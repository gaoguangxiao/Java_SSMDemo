package com.itheima.service.impl;

import com.itheima.dao.LogDao;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    public void log(String out, String in, Double money) {
        String str =  "转账操作由" + out + "到" + in + "金额为" + money;
        System.out.println(str);
        logDao.log(str);
    }
}
