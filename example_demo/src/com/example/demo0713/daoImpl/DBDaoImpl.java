package com.example.demo0713.daoImpl;

import com.example.demo0713.dao.DBDao;
import com.example.demo0713.utils.DBExecute;
import com.example.demo0713.utils.DBUtils;
import com.example.demo0713.vo.PerInfo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DBDaoImpl implements DBDao {
    @Override
    public int insert(PerInfo perInfo) throws SQLException {
        return DBExecute.executeUpdate("insert into perInfo values(null, ?, ?, ?)",
                perInfo.getName(), perInfo.getAge(), perInfo.getSex());
    }

    @Override
    public int insert(List<PerInfo> list) throws SQLException {
        int count = 0;
        for (PerInfo perInfo:list){
            int num = DBExecute.executeUpdate("insert into perInfo values(null, ?, ?, ?)",
                    perInfo.getName(), perInfo.getAge(), perInfo.getSex());
            count += num;
        }
//        String sql = "insert into perInfo values";
//        for (int i=0;i<list.size();i++){
//            if (i == list.size()-1) sql += "(null, ?, ?, ?)";
//            else sql += "(null, ?, ?, ?),";
//        }
//        int count = 0;
//        int index = 1;
//        PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
//        for (PerInfo p:list){
//            ps.setString(index++,p.getName());
//            ps.setInt(index++,p.getAge());
//            ps.setString(index++,p.getSex());
//            count++;
//        }
//        ps.close();
        return count;
    }

    @Override
    public void update(PerInfo perInfo) throws SQLException {
        DBExecute.executeUpdate("update perInfo set name=?, age=?, sex=? where id=?",
                perInfo.getName(), perInfo.getAge(), perInfo.getSex(), perInfo.getId());
    }

    @Override
    public void delete(int id) throws SQLException {
        DBExecute.executeUpdate("delete from perInfo where id=?", id);
    }

    @Override
    public List<PerInfo> queryAll() throws SQLException {
        return DBExecute.executeQuery("select * from perInfo");
    }

    @Override
    public PerInfo queryId(int id) throws SQLException {
        return DBExecute.executeQuery("select * from perInfo where id=?",id).get(0);
    }
}
