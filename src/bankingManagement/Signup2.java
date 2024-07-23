package bankingManagement;

import javax.swing.*;
import java.awt.*;

public class Signup2 extends JFrame {
    String formno;
    //constructor
    //getting the form_no as a parameter here
    Signup2(String first){
        super("APPLICATION_FORM");
        //Image
        ImageIcon i1=new ImageIcon(getClass().getResource("/icons/Bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;//setting the parameter form_no to the global variable






        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    public static void main(String[] args){
        new Signup2(" ");
    }
}
