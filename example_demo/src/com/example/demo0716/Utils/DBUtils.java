package com.example.demo0716.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    private static Connection connection;
    private DBUtils(){}
    static {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("example_demo/src/db.properties"));
            Class.forName(pro.getProperty("driver"));
            connection = DriverManager.getConnection(pro.getProperty("db_url"), pro.getProperty("db_user"), pro.getProperty("db_pwd"));
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
