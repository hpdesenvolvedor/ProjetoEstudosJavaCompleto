package javacore.ZZIjdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //java.sql = Connection, Statement, Result, DriverManager
    public static Connection getConnection(){
        String url = "jbdc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";
        try {
            DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
