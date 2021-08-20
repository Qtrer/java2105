package com.example.demo0719;

import com.example.demo0716.Utils.DBUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBExecute {
    public static <T> List<T> queryAll(Class<T> clazz, String sql, Object...args){
        List<T> list = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        try(PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql)){
            for (int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                T obj = clazz.getDeclaredConstructor().newInstance();
                for (int i=0;i<fields.length;i++){
                    fields[i].setAccessible(true);
                    fields[i].set(obj,rs.getObject(fields[i].getName()));
                }
                list.add(obj);
            }
        }catch (SQLException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e){
            e.printStackTrace();
        }
        return list;
    }

    public static int updateAll(String sql, Object...args){
        int row = 0;
        try(PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);) {
            for (int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            row = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
}
