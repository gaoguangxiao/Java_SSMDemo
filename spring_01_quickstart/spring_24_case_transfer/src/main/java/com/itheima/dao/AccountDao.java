package com.itheima.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

public interface AccountDao {
    @Update("update account set money = money + #{money} where name = #{name}")
    public void inMoney(@Param("name") String name,@Param("money") Double money);

    @Update("update account set money = money - #{money} where name = #{name}")
    public void outMoney(@Param("name")String name,@Param("money") Double money);
}
