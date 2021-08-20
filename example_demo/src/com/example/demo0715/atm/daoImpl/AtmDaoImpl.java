package com.example.demo0715.atm.daoImpl;

import com.example.demo0715.atm.dao.AtmDao;
import com.example.demo0715.atm.utils.DBExecute;
import com.example.demo0715.atm.vo.Atm;

import java.sql.SQLException;
import java.util.List;

public class AtmDaoImpl implements AtmDao {
    @Override
    public Atm register(Atm atm) {
        String sql = "insert atm values(?,?,?)";
        try {
            DBExecute.executeUpdate(sql, atm.getAccount(), atm.getPassword(), atm.getRemain());
            System.out.println("注册成功...");
        } catch (SQLException throwables) {
            System.out.println("账号已存在，正在重新生成账号...");
            atm = register(new Atm(atm.getPassword()));
        }
        return atm;
    }

    @Override
    public Atm login(String account, String password) {
        String sql = "select * from atm where account=? and password=?";
        List<Atm> list = null;
        try {
            list = DBExecute.executeQuery(sql, account, password);
        } catch (SQLException throwables) {
            System.err.println("操作异常...");
            return null;
        }
        if (list != null) {
            System.out.println("登陆成功...");
            return list.get(0);
        }else {
            System.out.println("登陆失败...");
            return null;
        }

    }

    @Override
    public void save(Atm atm, int count) {
        String sql = "update atm set remain=? where account=? and password=?";
        try {
            DBExecute.executeUpdate(sql, atm.getRemain()+count, atm.getAccount(), atm.getPassword());
            System.out.println("存款成功...");
        } catch (SQLException throwables) {
            System.err.println("操作异常...");
        }
    }

    @Override
    public void draw(Atm atm, int count) {
        if (count > atm.getRemain()) {
            System.out.println("余额不足...");
            return;
        }
        String sql = "update atm set remain=? where account=? and password=?";
        try {
            DBExecute.executeUpdate(sql, atm.getRemain()-count, atm.getAccount(), atm.getPassword());
            System.out.println("取款成功...");
        } catch (SQLException throwables) {
            System.err.println("操作异常...");
        }
    }

    @Override
    public void transfer(Atm atm, String account, int count) {
        String sql = "select * from atm where account=?";
        List<Atm> list = null;
        try {
            list = DBExecute.executeQuery(sql, account);
        } catch (SQLException throwables) {
            System.err.println("操作异常...");
        }
        if (list == null){
            System.out.println("转账用户不存在...");
            return;
        }
        if (count > atm.getRemain()) {
            System.out.println("余额不足...");
            return;
        }
        Atm to_atm = list.get(0);
        sql = "update atm set remain=? where account=? and password=?";
        try {
            DBExecute.executeUpdate(sql, atm.getRemain()-count, atm.getAccount(), atm.getPassword());
            DBExecute.executeUpdate(sql, to_atm.getRemain()+count, to_atm.getAccount(), to_atm.getPassword());
            System.out.println("转账成功...");
        } catch (SQLException throwables) {
            System.err.println("操作异常...");
        }
    }
}
