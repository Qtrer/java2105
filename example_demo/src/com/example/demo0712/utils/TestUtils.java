package com.example.demo0712.utils;

import com.example.demo0712.entity.TestData;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestUtils {

    public void save(TestData test) throws SQLException {
        Statement statement = DBUtils.getConnection().createStatement();
        String sql = String.format("insert into test values(null, '%s', %d, '%s', %d, %d)",
                test.getName(), test.getAge(), test.getSex(), test.getSalary(), test.getDepno());
        statement.executeUpdate(sql);
        System.out.println("save success");
        statement.close();
    }
    public void update(int id, TestData test) throws SQLException {
        Statement statement = DBUtils.getConnection().createStatement();
        String sql = String.format("update test set name='%s',age=%d,sex='%s',salary=%d,depno=%d where id=%d",
                test.getName(), test.getAge(), test.getSex(), test.getSalary(), test.getDepno(), id);
        statement.executeUpdate(sql);
        System.out.println("update success");
        statement.close();
    }
    public void delete(int id) throws SQLException {
        Statement statement = DBUtils.getConnection().createStatement();
        String sql = String.format("delete from test where id=%d", id);
        statement.executeUpdate(sql);
        System.out.println("delete success");
        statement.close();
    }
    public List<TestData> selectAll() throws SQLException {
        Statement statement = DBUtils.getConnection().createStatement();
        String sql = "select * from test";
        ResultSet rs = statement.executeQuery(sql);
        List<TestData> list = new ArrayList<>();
        while (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            String sex = rs.getString(4);
            int salary = rs.getInt(5);
            int depno = rs.getInt(6);
            TestData td = new TestData(id, name, age, sex, salary, depno);
            list.add(td);
        }
        statement.close();
        return list;
    }
    public TestData selectOne(int id) throws SQLException {
        Statement statement = DBUtils.getConnection().createStatement();
        String sql = String.format("select * from test where id=%d", id);
        ResultSet rs = statement.executeQuery(sql);
        rs.next();
        String name = rs.getString(2);
        int age = rs.getInt(3);
        String sex = rs.getString(4);
        int salary = rs.getInt(5);
        int depno = rs.getInt(6);
        TestData td = new TestData(id, name, age, sex, salary, depno);
        statement.close();
        return td;
    }
}
