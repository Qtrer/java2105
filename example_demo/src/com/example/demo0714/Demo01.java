package com.example.demo0714;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("example_demo/src/db.properties"));
        String driver = pro.getProperty("driver");
        String url = pro.getProperty("db_url");
        String user = pro.getProperty("db_user");
        String pwd = pro.getProperty("db_pwd");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, pwd);
        DatabaseMetaData dmd = connection.getMetaData();
        System.out.println(dmd.getDriverName());
        System.out.println(dmd.getDriverVersion());
        System.out.println(dmd.getDatabaseProductName());
        System.out.println(dmd.getDatabaseProductVersion());
        System.out.println(dmd.getConnection());
        System.out.println();
        PreparedStatement ps = connection.prepareStatement("select * from emoji");
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i=0;i<rsmd.getColumnCount();i++){
            System.out.println(rsmd.getColumnName(i+1));
            System.out.println(rsmd.getColumnLabel(i+1));
            System.out.println(rsmd.getColumnType(i+1));
            System.out.println(rsmd.getColumnTypeName(i+1));
            System.out.println();
        }
    }
}
