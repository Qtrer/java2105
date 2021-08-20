package com.example.demo0714.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    private static Connection connection;
    private DBUtils(){
    }
    static {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("example_demo/src/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String driver = pro.getProperty("driver");
        String url = pro.getProperty("db_url");
        String user = pro.getProperty("db_user");
        String pwd = pro.getProperty("db_pwd");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return connection;
    }
    public static void close(){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
