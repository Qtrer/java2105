package com.example.demo0713;

import com.example.demo0713.dao.DBDao;
import com.example.demo0713.daoImpl.DBDaoImpl;
import com.example.demo0713.vo.PerInfo;

import java.sql.SQLException;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) throws SQLException {
        DBDao dao = new DBDaoImpl();
        List<PerInfo> list = dao.queryAll();
        list.forEach(System.out::println);
    }
}
