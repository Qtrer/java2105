package com.example.demo0714.dao;

import com.example.demo0714.vo.Menu;

import java.util.List;

public interface MenuDao {
    Menu queryid(int id);
    List<Menu> queryAll();
}
