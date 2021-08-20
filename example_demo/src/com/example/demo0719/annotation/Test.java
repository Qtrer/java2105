package com.example.demo0719.annotation;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class dao = Dao.class;
        String table_name = ((Table) dao.getAnnotation(Table.class)).value();
        System.out.println(table_name);
        String insert_sql = dao.getMethod("insert", MyATM.class).getAnnotation(SQL.class).value();
        System.out.println(insert_sql);
    }
}
