package bankingManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;
    //Constructor
     Main_Class(String pin){
         //we are passing the pin from login screen
         this.pin=pin;

         //Image
         ImageIcon i1=new ImageIcon(getClass().getResource("/icons/atm2.png"));
         Image i2=i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0,0,1550,830);
         add(image);


         //LABELS
         JLabel label=new JLabel("Please Select Your Transaction");
         label.setFont(new Font("System",Font.BOLD,28));
         label.setForeground(Color.WHITE);
         label.setBounds(430,180,700,35);
         image.add(label);

        //BUTTONS
         b1=new JButton("DEPOSIT");
         b1.setBackground(new Color(65,125,128));
         b1.setForeground(Color.WHITE);
         b1.addActionListener(this);
         b1.setBounds(410,274,150,35);
         image.add(b1);

         b2=new JButton("CASH WITHDRAWL");
         b2.setBackground(new Color(65,125,128));
         b2.setForeground(Color.WHITE);
         b2.addActionListener(this);
         b2.setBounds(700,274,150,35);
         image.add(b2);

         b3=new JButton("FAST CASH");
         b3.setBackground(new Color(65,125,128));
         b3.setForeground(Color.WHITE);
         b3.addActionListener(this);
         b3.setBounds(410,318,150,35);
         image.add(b3);

         b4=new JButton("MINI STATEMENT");
         b4.setBackground(new Color(65,125,128));
         b4.setForeground(Color.WHITE);
         b4.addActionListener(this);
         b4.setBounds(700,318,150,35);
         image.add(b4);

         b5=new JButton("PIN CHANGE");
         b5.setBackground(new Color(65,125,128));
         b5.setForeground(Color.WHITE);
         b5.addActionListener(this);
         b5.setBounds(410,362,150,35);
         image.add(b5);

         b6=new JButton("BALANCE ENQUIRY");
         b6.setBackground(new Color(65,125,128));
         b6.setForeground(Color.WHITE);
         b6.addActionListener(this);
         b6.setBounds(700,362,150,35);
         image.add(b6);

         b7=new JButton("EXIT");
         b7.setBackground(new Color(65,125,128));
         b7.setForeground(Color.WHITE);
         b7.addActionListener(this);
         b7.setBounds(700,406,150,35);
         image.add(b7);


         //Frame
         setLayout(null);//Border Layout
         setSize(1550,1080);
         setLocation(0,0);
         setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
                new Deposit(pin);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main_Class("");
    }
}
