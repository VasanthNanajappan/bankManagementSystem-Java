package bankingManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {

    String pin;

    TextField textField;

    JButton b1, b2;

    //Constructor
    Withdraw(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        //LABELS
        JLabel l1 = new JLabel("MAXIMUM WITHDRAWAL IS Rs.10,000");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.white);
        l1.setBounds(460, 180, 700, 35);
        image.add(l1);//used to show above the image

        JLabel l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.white);
        l2.setBounds(460, 220, 400, 35);
        image.add(l2);//used to show above the image


        textField = new TextField();
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.white);
        textField.setBounds(460, 260, 320, 25);
        image.add(textField);

        //BUTTONS
        b1 = new JButton("WITHDRAWAL");
        b1.setFont(new Font("Raleway", Font.BOLD, 16));
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65, 125, 128));
        b1.addActionListener(this);
        b1.setBounds(700, 362, 150, 35);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Raleway", Font.BOLD, 16));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65, 125, 128));
        b2.addActionListener(this);
        b2.setBounds(700, 406, 150, 35);
        image.add(b2);


        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (amount.equals("") || !amount.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid amount");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("transaction_type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawal', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new Main_Class(pin);

                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new Main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdraw("");
    }
}

//ResultSet -> It is a Java object used to store the data retrieved from a database using an SQL query.
//It provides a way to iterate over the rows of data returned by the query. You can move the cursor through the ResultSet to process each row individually.
