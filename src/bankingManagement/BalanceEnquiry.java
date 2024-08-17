package bankingManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel l2;

    JButton b1;

    String pin;

    //Constructor
    BalanceEnquiry(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(getClass().getResource("/icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        //LABELS
        JLabel l1=new JLabel("Your Current Balance is Rs. ");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.white);
        l1.setBounds(430,180,700,35);
        image.add(l1);//used to show above the image

        l2=new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setForeground(Color.white);
        l2.setBounds(430,220,400,35);
        image.add(l2);//used to show above the image

        //BUTTONS
        b1=new JButton("Back");
        b1.setFont(new Font("Raleway",Font.BOLD,16));
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        b1.setBounds(700,406,150,35);
        image.add(b1);


        int balance=0;
        try{
        Con c=new Con();//the data has to come out i.e. the Amount
            ResultSet resultSet=c.statement.executeQuery("Select * from bank where pin='"+pin+"' ");

            while (resultSet.next()){
                if(resultSet.getString("transaction_type").equals("Deposit")){
                    //If the amount gets deposited
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }else{
                    //If Not
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        l2.setText(""+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            setVisible(false);
            new Main_Class(pin);
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new BalanceEnquiry("");
    }
}
