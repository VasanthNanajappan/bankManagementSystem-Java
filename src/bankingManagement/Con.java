package bankingManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    //Connection with DataBase

    Connection connection; //Connection object represents a session with a specific database.And it provides link between java application and database

    Statement statement; //Statement object is used to execute a static SQL statement and return the results. And it provides a way to send SQL commands to the database and process the results.
    //Constructor
    public Con(){
       try {
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","63820");//with the help of driver manager we can able to connect with database
           statement=connection.createStatement();//by using this our database is perfectly connected!


       }catch (Exception e){
           //used to handle runtime errors!
           e.printStackTrace();
       }
    }
}
