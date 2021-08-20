package com.example.demo0714.daoImpl;

import com.example.demo0714.utils.DBExecute;
import com.example.demo0714.dao.MenuDao;
import com.example.demo0714.vo.Menu;

import java.sql.SQLException;
import java.util.List;

public class MenuDaoImpl implements MenuDao {
    @Override
    public Menu queryid(int id){
        String sql = "select m.id,m.name,group_concat(d.id,' ',d.name) names from menu m, dish d " +
                "where m.id=d.sid and m.id=? group by m.name";
        Menu menu = null;
        try {
            menu = DBExecute.executeQuery(sql,id).get(0);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return menu;
    }

    @Override
    public List<Menu> queryAll() {
        String sql = "select m.id,m.name,group_concat(d.id,' ',d.name) names from menu m, dish d " +
                "where m.id=d.sid group by m.name";
        List<Menu> list = null;
        try {
            list = DBExecute.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
