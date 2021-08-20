package com.example.demo0713.dao;

import com.example.demo0713.vo.PerInfo;

import java.sql.SQLException;
import java.util.List;

public interface DBDao {
    int insert(PerInfo perInfo) throws SQLException;
    int insert(List<PerInfo> list) throws SQLException;
    void update(PerInfo perInfo) throws SQLException;
    void delete(int id) throws SQLException;
    List<PerInfo> queryAll() throws SQLException;
    PerInfo queryId(int id) throws SQLException;
}
