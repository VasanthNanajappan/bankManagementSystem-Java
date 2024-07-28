package bankingManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2,c3,c4,c5,c6;

    JButton s,c;

    String formno;
    //Constructor
    Signup3(String formno){
        this.formno=formno;

        ImageIcon i1=new ImageIcon(getClass().getResource("/icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        //PAGE-3
        JLabel l1=new JLabel("Page-3 :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        //ACCOUNT-DETAILS
        JLabel l2=new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        //ACCOUNT-TYPES
        JLabel l3=new JLabel("Account Types :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1=new JRadioButton("Savings Account");
        r1.setFont(new Font("Ralewway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,180,30);
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        //CARD-NUMBER
        JLabel l4=new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5=new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7=new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        //PIN
        JLabel l8=new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10=new JLabel("(4 Digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        //SERVICE
        JLabel l11=new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        //If user wants to use two things to choose at a time(two services) ,then we need to use Checkboxes!!
        c1=new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,600,200,30);
        add(c6);

        //Final Checkbox
        JCheckBox c7=new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.",true);
        //give true in the above checklist to make sure the checkbox is always required!
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(new Color(215,252,252));
        c7.setBounds(100,680,600,20);
        add(c7);

        //FORM-NO
        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel();
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,100,30);
        add(l13);

        //SUBMIT-Button
        s=new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.white);
        s.addActionListener(this);//here this means current instance(Signup3)'s button! and acts to listen for the button event
        s.setBounds(250,720,100,30);
        add(s);

        //Cancel-Button
        c=new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.white);
        c.addActionListener(this);
        c.setBounds(420,720,100,30);
        add(c);



        setLayout(null);
        setSize(850,800);
        setLocation(450,80);
        getContentPane().setBackground(new Color(215,252,252));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acctype=" ";
        if(r1.isSelected()){
            acctype="Savings Account";
        }else if(r2.isSelected()){
            acctype="Fixed Deposit Account ";
        }else if(r3.isSelected()){
            acctype="Current Account";
        }else if (r4.isSelected()){
            acctype="Recurring Deposit Account";
        }

        //For creating a ATM card number we need to generate a random number
        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;//card num format,here after 9 has 7zeros so it gives us seven digit number
        String cardno=""+Math.abs(first7);

        //For PIN generation
        long first3=(ran.nextLong() % 9000L)+1000L;
        String pin=""+Math.abs(first3);

        //Services
        String facility="";
        int facilityCount=0;//for tracking of commas to insert
        if (c1.isSelected()) {
            if(facilityCount>0) facility+=",";
            facility += "ATM Card";
            facilityCount++;
        }
        if (c2.isSelected()) {
            if(facilityCount>0) facility+=",";
            facility += "Internet Banking, ";
            facilityCount++;
        }
        if (c3.isSelected()) {
            if(facilityCount>0) facility+=",";
            facility += "Mobile Banking, ";
            facilityCount++;
        }
        if (c4.isSelected()) {
            if(facilityCount>0) facility+=",";
            facility += "Email Alerts, ";
            facilityCount++;
        }
        if (c5.isSelected()) {
            if(facilityCount>0) facility+=",";
            facility += "Cheque Book, ";
            facilityCount++;
        }
        if (c6.isSelected()) {
            if(facilityCount>0) facility+=",";
            facility += "E-Statement, ";
            facilityCount++;
        }


        //Storing
        try{
            if(e.getSource()==s){//e is used to denote the actionevent,mouseevent,keyevent etc..
                if(acctype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields!!");
                }else{
                    Con con3=new Con();
                    String q1="insert into signupthree values('"+formno+"','"+acctype+"','"+cardno+"','"+pin+"','"+facility+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    con3.statement.executeUpdate(q1);
                    con3.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card_No:"+cardno+"\n Pin_No:"+pin);
                    setVisible(false);
                }
            }else if(e.getSource()==c){
                System.exit(0);//this method is used to terminate the JVM(Java virtual Machine)
                //here zero(0) value indicates normal termination
                //non-zero value indicates upNormal termination
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup3(" ");
    }
}
