package bankingManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;

    TextField textField;

    JButton b1,b2;
    //Constructor
     Deposit(String pin){
         this.pin=pin;

         //ATM machine's layout
         ImageIcon i1=new ImageIcon(getClass().getResource("/icons/atm2.png"));
         Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0,0,1550,830);
         add(image);

         //LABELS
         JLabel l1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT:");
         l1.setFont(new Font("System",Font.BOLD,16));
         l1.setForeground(Color.white);
         l1.setBounds(460,180,400,35);
         image.add(l1);//used to show above the image

         textField=new TextField();
         textField.setFont(new Font("Raleway",Font.BOLD,22 ));
         textField.setBackground(new Color(65,125,128));
         textField.setForeground(Color.white);
         textField.setBounds(460,230,320,25);
         image.add(textField);

         //BUTTONS
         b1=new JButton("DEPOSIT");
         b1.setFont(new Font("Raleway",Font.BOLD,16));
         b1.setForeground(Color.white);
         b1.setBackground(new Color(65,125,128));
         b1.setBounds(700,362,150,35);
         image.add(b1);

         b2=new JButton("BACK");
         b2.setFont(new Font("Raleway",Font.BOLD,16));
         b2.setForeground(Color.WHITE);
         b2.setBackground(new Color(65,125,128));
         b2.setBounds(700,406,150,35);
         image.add(b2);








         setLayout(null);
         setSize(1550,1080);
         setLocation(0,0);
         setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount=textField.getText();
            Date date=new Date();

            if (e.getSource()==b1){//e denotes event

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Deposit("");
    }
}
