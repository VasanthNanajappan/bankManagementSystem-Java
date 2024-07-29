package bankingManagement;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JTextField textName,textFName,textEmail,textMb,textAddress,textCity,textPincode,textState;
    JDateChooser dateChooser;//For calendar, press-Alt+Enter
    JRadioButton r1,r2,r3,r4,r5;
    JButton next;
    //For Application NO.
    Random ran=new Random();//It is used to generate random number!
    long firstFour=(ran.nextLong()%9000L)+1000L; //It's value ranges from -8999 to 8999 but adding with 1000L then the range becomes -7999 to 8999
    String first=" "+Math.abs(firstFour);//this function ensures that the value is not negative!

    SignUp(){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(getClass().getResource("/icons/Bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        //Label
        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        label1.setForeground(Color.black);
        label1.setBounds(160,20,600,40);
        add(label1);

        //Label-2
        JLabel label2=new JLabel("Page no.1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setForeground(Color.BLACK);
        label2.setBounds(330,70,600,30);
        add(label2);

        //label-3
        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setForeground(Color.black);
        label3.setBounds(290,90,600,30);
        add(label3);

        //Getting Info
        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setForeground(Color.black);
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        //Father's Name
        JLabel labelFName=new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setForeground(Color.black);
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        //DateOfBirth
        JLabel labelDob=new JLabel("Date of Birth :");
        labelDob.setFont(new Font("Raleway",Font.BOLD,20));
        labelDob.setForeground(Color.BLACK);
        labelDob.setBounds(100,340,200,30);
        add(labelDob);

        //For calendar
        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        //GENDER
        JLabel gender=new JLabel("Gender :");
        gender.setForeground(Color.BLACK);
        gender.setFont((new Font("Raleway",Font.BOLD,20)));
        gender.setBounds(100,290,200,30);
        add(gender);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        //Avoid selecting both the buttons
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //EMAIL-ADDRESS
        JLabel labelEmail=new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setForeground(Color.black);
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        //MARRIED-STATUS
        JLabel labelMb=new JLabel("Martial Status :");
        labelMb.setFont(new Font("Raleway",Font.BOLD,20));
        labelMb.setForeground(Color.BLACK);
        labelMb.setBounds(100,440,200,30);
        add(labelMb);


        r3=new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,440,100,30);
        add(r3);

        r4=new JRadioButton("Un-Married");
        r4.setFont((new Font("Raleway",Font.BOLD,14)));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,440,200,30);
        add(r4);

        r5=new JRadioButton("Other");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(635 ,440,100,30);
        add(r5);

        ButtonGroup bg2=new ButtonGroup();
        bg2.add(r3);
        bg2.add(r4);
        bg2.add(r5);


        //ADDRESS
        JLabel labelAddress=new JLabel("Address :");
        labelAddress.setFont(new Font("Raleway",Font.BOLD,20));
        labelAddress.setForeground(Color.BLACK);
        labelAddress.setBounds(100,490,200,30);
        add(labelAddress);

        textAddress=new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(300,490,400,30);
        add(textAddress);

        //CITY
        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setForeground(Color.BLACK);
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        //PIN CODE
        JLabel labelPincode=new JLabel("Pincode :");
        labelPincode.setFont(new Font("Raleway",Font.BOLD,20));
        labelPincode.setForeground(Color.BLACK);
        labelPincode.setBounds(100,590,200,30);
        add(labelPincode);

        textPincode=new JTextField();
        textPincode.setFont(new Font("Raleway",Font.BOLD,14));
        textPincode.setBounds(300,590,400,30);
        add(textPincode);

        //STATE
        JLabel labelState=new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setForeground(Color.BLACK);
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState=new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,20));
        textState.setBounds(300,640,400,30);
        add(textState);

        //BUTTONS
        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        next.setBounds(620,710,80,30);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //here we are going to get data from user and store it in database

        String formno=first;
        String name=textName.getText();
        String fname=textFName.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();//this is for extracting date from the calendar

        String gen=null;
        //if we used RADIO button we need to declare like this!!
        if(r1.isSelected()){
            gen="Male";
        }else if(r2.isSelected()){
            gen="Female";
        }else{
            gen="others";
        }

        String email=textEmail.getText();

        String marry=null;
        if(r3.isSelected()){
            marry="Married";
        }else if(r4.isSelected()){
            marry="Un-Married";
        }else if(r5.isSelected()){
            marry="Other";
        }

        String address=textAddress.getText();
        String city=textCity.getText();
        String pincode=textPincode.getText();//we are extracting data using getText();
        String state=textState.getText();

        //we have created a database ,extracted the value!
        //Now we have to store the data in database!
        try{
            if(textName.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Fill all the details required!");//it is used to display the error message!
            }else{
                Con con1=new Con();//Con is an Object
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gen+"','"+email+"','"+marry+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";//our data are stored in the database here, signup here is the name of the database
                con1.statement.executeUpdate(q);//used to execute the query
                new Signup2(formno);//after storing all the details we need to move to the next page! and we are passing the Form_No as a parameter
                setVisible(false);//then set the current signup page to false!
            }
        }catch (Exception E){
            E.printStackTrace();;
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
    //Con - it creates a custom class to handle database queries or connections
    //insert into signup values - it is an sql command used to add new row into give table, It assumes the table has columns that match the data being inserted.
    //executeUpdate(q): This method is used for executing SQL statements that modify the database (such as INSERT, UPDATE, or DELETE). It returns the number of rows affected by the query.
}
