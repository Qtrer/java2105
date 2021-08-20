package com.example.demo0713.utils;

import com.example.demo0713.vo.PerInfo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBExecute {
    public static int executeUpdate(String sql, Object...args) throws SQLException {
        PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
        for (int i=0;i<args.length;i++){
            ps.setObject(i+1,args[i]);
        }
        return ps.executeUpdate();
    }
    public static List<PerInfo> executeQuery(String sql, Object...args) throws SQLException {
        List<PerInfo> list = new ArrayList<>();
        PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
        for (int i=0;i<args.length;i++){
            ps.setObject(i+1,args[i]);
        }
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            PerInfo pi = new PerInfo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
            list.add(pi);
        }
        return list;
    }
}
