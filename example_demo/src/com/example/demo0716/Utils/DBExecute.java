package com.example.demo0716.Utils;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBExecute {
    public static int insert(Object obj){
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        StringBuffer str_field = new StringBuffer();
        str_field.append("insert into ").append(clazz.getSimpleName()).append("(");
        StringBuffer str_value = new StringBuffer();
        str_value.append(" values(");
        for (int i=0;i<fields.length;i++){
            if (i == fields.length-1){
                str_field.append(fields[i].getName()).append(")");
                str_value.append("?)");
            } else {
                str_field.append(fields[i].getName()).append(",");
                str_value.append("?,");
            }
        }
        String sql = str_field.append(str_value).toString();
//        System.out.println(sql);
        PreparedStatement ps = null;
        int row = 0;
        try {
            ps = DBUtils.getConnection().prepareStatement(sql);
            for (int i=0;i<fields.length;i++){
                fields[i].setAccessible(true);
                ps.setObject(i+1,fields[i].get(obj));
            }
            row = ps.executeUpdate();
        } catch (SQLException | IllegalAccessException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return row;
    }

//    public static int update(Object obj){
//        Class clazz = obj.getClass();
//        Field[] fields = clazz.getDeclaredFields();
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("update ").append(clazz.getSimpleName()).append(" set ");
//    }
}
