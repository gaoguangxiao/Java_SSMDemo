package com.itheima.service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void log(String out, String in, Double money);

}
