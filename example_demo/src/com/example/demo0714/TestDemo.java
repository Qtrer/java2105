package com.example.demo0714;

import com.example.demo0714.dao.MenuDao;
import com.example.demo0714.daoImpl.MenuDaoImpl;
import com.example.demo0714.vo.Menu;

import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        MenuDao dao = new MenuDaoImpl();
//        Menu menu = dao.queryid(1);
//        System.out.println(menu);
        List<Menu> list = dao.queryAll();
        list.forEach(System.out::println);
    }
}
