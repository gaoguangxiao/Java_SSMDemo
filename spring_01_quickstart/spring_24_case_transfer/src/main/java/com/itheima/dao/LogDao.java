package com.itheima.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {
    @Insert("insert into logService (info,createData) values (#{info},now())")
    public void log(String info);
}
