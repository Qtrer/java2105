package com.example.demo0714.utils;

import com.example.demo0713.utils.DBUtils;
import com.example.demo0713.vo.PerInfo;
import com.example.demo0714.vo.Dish;
import com.example.demo0714.vo.Menu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBExecute {
    public static List<Menu> executeQuery(String sql, Object... args) throws SQLException {
        List<Menu> list = new ArrayList<>();
        PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
        for (int i=0;i<args.length;i++){
            ps.setObject(i+1,args[i]);
        }
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Menu menu = new Menu();
            menu.setId(rs.getInt(1));
            menu.setName(rs.getString(2));
            String dishes = rs.getString(3);
            String[] split = dishes.split(",");
            List<Dish> dishList = new ArrayList<>();
            for (String s:split){
                String[] ss = s.split(" ");
                dishList.add(new Dish(Integer.parseInt(ss[0]),ss[1]));
            }
            menu.setDishes(dishList);
            list.add(menu);
        }
        ps.close();
        return list;
    }
}
