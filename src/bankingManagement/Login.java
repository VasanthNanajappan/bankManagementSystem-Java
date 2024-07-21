package bankingManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;//declaring it globally
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    // constructor
    Login() {
        super("Bank Management System"); // gives title to the frame-on the border
        // super always needs to be declared on the top

        URL resource = getClass().getResource("/icons/bank.png");
        if (resource == null) {
            System.out.println("Image not found!");
            return;
        }

        ImageIcon i1 = new ImageIcon(resource);

        //Bank-Image
        // we are storing the image in i1
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // we are getting and scaling the image in i2
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100); // x,y,width and height
        add(image);
        // here we are making it visible in the Frame and setting boundary for it!

        //card image
        ImageIcon  i11=new ImageIcon(getClass().getResource("/icons/card.png"));
        Image i22=i11.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel image2=new JLabel(i33);
        image2.setBounds(630,350,100,100);
        add(image2);


        //Labels
        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white);//for color
        label1.setFont(new Font("AvantGrande",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("card No:");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        //TextField for CardNo
        textField2=new JTextField(15);//Column-it shows 15characters
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        textField2.setBounds(325,190,230,30);
        add(textField2);

        label3=new JLabel("PIN:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        add(label3);

        //PasswordField
        passwordField3=new JPasswordField(15);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        passwordField3.setBounds(325,250,230,30);
        add(passwordField3);


        //BUTTONS
        //SIGN-IN
        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.white);//for letter color
        button1.setBackground(Color.black);//for background color
        button1.addActionListener(this);//adding events
        button1.setBounds(300,300,100,30);
        add(button1);

        //CLEAR
        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.addActionListener(this);
        button2.setBounds(430,300,100,30);
        add(button2);

        //SIGN-UP
        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.addActionListener(this);
        button3.setBounds(300,350,230,30);
        add(button3);


        //background image
        ImageIcon i12=new ImageIcon(getClass().getResource("/icons/backbg.png"));//storing
        Image i23=i12.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);//retrieving and scaling
        ImageIcon i34=new ImageIcon(i23);//creating a new image icon using the scaled image
        JLabel image3=new JLabel(i34);//it is used for displaying the icon
        image3.setBounds(0,0,850,480);//setting the positions , here we are setting the image for full size
        add(image3);//adding it to jFrame


        setLayout(null); // by default, it was BorderLayout
        setSize(850, 480); // setting frame's size - width and height
        setLayout(null);
        setLocation(400, 250); // x and yaxis- for setting the frame to centre
        setVisible(true); // by default, it sets to false
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){

            } else if (e.getSource()==button2){
                //CLEAR-function
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource()==button3) {
                
            }
        }catch (Exception E){
            E.printStackTrace();//it makes error to visible
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
