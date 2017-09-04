package Actual;

import javax.swing.*;
import java.sql.*;

/**
 * Created by HACKER on 05/08/2017.
 * Operators|| == && != +
 * IN this tutorial we are going to connect to youtube database from java code using jdbc
 */
public class JDBCTutorial {
    public static void main(String[] args) {
        //letx make the connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","")) {
            JOptionPane.showMessageDialog(null,"Successfully connected to database!!");
            //lets retrieve some data
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM videos;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("Title:"+resultSet.getString(1)+" Length:"+resultSet.getString(2)+" Minutes"+" Description:"+resultSet.getString(3));
            }
            //Lets delete a record from our videos table
            PreparedStatement preparedStatement1 = connection.prepareStatement("DELETE FROM videos WHERE length = ?");
            preparedStatement1.setString(1,"10");
            preparedStatement1.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}