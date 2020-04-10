package com.example.demo.service;

import com.example.demo.bean.Money;
import com.example.demo.dao.MoneyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyService {
    @Autowired
    private MoneyDao moneyDao;

    /**
     * 根据名字查找用户
     */
    public Money selectMoneyById(int id) {
        return moneyDao.findMoneyById(id);
    }

}