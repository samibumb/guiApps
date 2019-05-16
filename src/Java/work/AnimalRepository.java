package Java.work;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class AnimalRepository {

    private final static String url= "jdbc:mysql://localhost:3306/world";
    private final static String user="root";
    private final static String password="Material1!";

    public static void createTable(){
        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement=connection.prepareStatement("create table ZOO(" +
                                                                                "id int," +
                                                                                 "name varchar(250)," +
                                                                                 "breed varchar(250)," +
                                                                                 "age int," +
                                                                                 "primary key (id)" +
                                                                                 ")");
            preparedStatement.execute();
            System.out.println("Table created");
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public static void insertIntoTable(Animal animal){
        try {
            Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement =connection.prepareStatement("insert into ZOO(id,name,breed,age)" +
                    "values(?,?,?,?);");
            preparedStatement.setInt(1,animal.id);
            preparedStatement.setString(2,animal.name);
            preparedStatement.setString(3,animal.breed);
            preparedStatement.setInt(4,animal.age);

            preparedStatement.execute();
            JOptionPane.showMessageDialog(null,"Row inserted");
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public static void showTable(){

        try {
            Connection connection=DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement=connection.prepareStatement("SELECT * from ZOO;");
            ResultSet resultSet=preparedStatement.executeQuery();

            int i=3;
            System.out.println("Animals displayed in :");
            while(i!=0){
                System.out.println(i);
                i--;
                Thread.sleep(1000);
            }
            System.out.println("Animals table:\nID/NAME/BREED/AGE");
            while (resultSet.next()){
                System.out.println(resultSet.getString("id")+" "+resultSet.getString("name")+" "+
                        resultSet.getString("breed")+" "+resultSet.getString("age"));
            Thread.sleep(1000);
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        //createTable();

     int att=0,max=3;

     while (att<max){
         System.out.println(">>>LOGIN<<<");
         Scanner scanner=new Scanner(System.in);
         System.out.print("Username :");
        String username=scanner.nextLine();
         System.out.println("Password :");
        String pass=scanner.nextLine();

        if (username.equals("samibumb")&&pass.equals("sami")){
            System.out.println("Welcome to the ZOO!!!\n");
            showTable();
            break;
        }else{
            System.out.println("Invalid username or password.");
       }
        att++;

     }
        if (att>=max){
           try {
               throw new Error("Please,try again later");
           }catch (Error error){
               System.out.println("You reached the maximum nr of attempts."+ error);
           }
        }


    }
}
