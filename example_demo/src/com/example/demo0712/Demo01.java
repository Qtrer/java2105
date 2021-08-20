package com.example.demo0712;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pwd = "root";
        Connection connection = DriverManager.getConnection(url,user,pwd);
        System.out.println(connection);
        Statement statement = connection.createStatement();
        String sql = "insert into test(name, age, sex, salary, depno) values('赵六', 32, '男', 4500, 20)";
        System.out.println(statement.executeUpdate(sql));
        statement.close();
        connection.close();
    }
}
