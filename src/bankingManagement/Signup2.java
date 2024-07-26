package bankingManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5; //It  is a component that combines a button or editable field and a drop-down list.
    JTextField textField,aadharfield;
    JRadioButton r1,r2,r3,r4;
    JButton next;
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

        //LABELS
        JLabel l1=new JLabel("Page2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        //RELIGION-LABEL
        JLabel l3=new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        //we are creating a dropdown with combo box for all relgions
        String[] religion={"Hindu","Muslim","Christian","Others"};
        comboBox=new JComboBox(religion);//we need to pass the string we createed above
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        //CATEGORY
        JLabel l4=new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        //Drop-Down
        String[] category={"General","OBC","SC","ST","Other"};
         comboBox2=new JComboBox(category);//used combobox here
         comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
         comboBox2.setBackground(new Color(252,208,76));
         comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        //INCOME
        JLabel l5=new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        //Drop-Down
        String[] income={"Null","<1,50,000","<2,50,000","5,00,000","Up-to 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        //EDUCATION
        JLabel l6=new JLabel("Education :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        //Drop-Down
        String[] education={"Non-Graduate","Graduate","Post-Graduate","Others"};
        comboBox4=new JComboBox(education);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        //OCCUPATION
        JLabel l7=new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        //Drop-Down
        String[] occupation={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5=new JComboBox(occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        //PAN-Number
        JLabel l8=new JLabel("PAN-Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textField=new JTextField();
        textField.setFont(new Font("Raleway",Font.BOLD,14));
        textField.setBounds(350,390,320,30);
        add(textField);

        //AADHAR-Number
        JLabel l9=new JLabel("Aadhar-Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);

        aadharfield=new JTextField();
        aadharfield.setFont(new Font("Raleway",Font.BOLD,14));
        aadharfield.setBounds(350,440,320,30);
        add(aadharfield);

        //SENIOR-CITIZEN
        JLabel l10=new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        //EXISTING-ACCOUNT
        JLabel l11=new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        r3=new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,540,100,30);
        add(r3);

        r4=new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(460,540,100,30);
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);


        //FORM-NO
        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(760,10,100,30);
        add(l13);

        //BUTTON
        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        next.setBounds(570,640,100,30);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args){
        new Signup2(" ");
    }
}
