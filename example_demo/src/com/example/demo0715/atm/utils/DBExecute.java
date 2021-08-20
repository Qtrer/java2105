package com.example.demo0715.atm.utils;

import com.example.demo0715.atm.vo.Atm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBExecute {
    public static List<Atm> executeQuery(String sql, Object...args) throws SQLException {
        List<Atm> list = new ArrayList<>();
        PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
        for (int i=0;i<args.length;i++){
            ps.setObject(i+1, args[i]);
        }
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Atm atm = new Atm(rs.getString(1), rs.getString(2), rs.getInt(3));
            list.add(atm);
        }
        ps.close();
        return list;
    }

    public static void executeUpdate(String sql, Object...args) throws SQLException {
        PreparedStatement ps  = DBUtils.getConnection().prepareStatement(sql);
        for (int i=0;i<args.length;i++){
            ps.setObject(i+1, args[i]);
        }
        ps.executeUpdate();
        ps.close();
    }
}
