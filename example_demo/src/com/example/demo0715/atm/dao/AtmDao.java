package com.example.demo0715.atm.dao;

import com.example.demo0715.atm.vo.Atm;

public interface AtmDao {
    Atm register(Atm atm);
    Atm login(String account, String password);
    void save(Atm atm, int count);
    void draw(Atm atm, int count);
    void transfer(Atm atm, String account, int count);
}
