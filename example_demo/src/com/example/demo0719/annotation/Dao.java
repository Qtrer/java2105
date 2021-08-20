package com.example.demo0719.annotation;

import java.util.List;

@Table("atm")
public interface Dao {
    @SQL("insert atm values(?,?,?)")
    void insert(MyATM atm);
    @SQL("update atm set password=?,remain=? where account=?")
    void update(MyATM atm);
    @SQL("delete from atm where account=?")
    void delete(MyATM atm);
    @SQL("select * from atm")
    List<MyATM> queryAll();
    @SQL("select * from atm where account=?")
    MyATM queryAccount(String account);
}
