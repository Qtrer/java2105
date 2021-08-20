package com.example.demo0712;

import com.example.demo0712.entity.TestData;
import com.example.demo0712.utils.TestUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) throws SQLException {
        TestUtils tus = new TestUtils();
        List<TestData> list = tus.selectAll();
        list.forEach(System.out::println);
//        TestData td =tus.selectOne(3);
//        System.out.println(td);
//        td.setName("田七");
//        td.setAge(55);
//        td.setSalary(8000);
//        tus.save(td);
//        td.setSex("女");
//        tus.update(3, td);
//        tus.delete(8);
    }
}
