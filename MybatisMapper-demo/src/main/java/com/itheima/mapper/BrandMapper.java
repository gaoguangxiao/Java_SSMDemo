package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {

    //查询所有
    List<Brand> selectAll();

    //    查看详情
    Brand selectById(int id);

    //   企业名称模糊查询
    /*
     * 条件查询
     * 1、散装参数 需要使用注解Param
     * */
    List<Brand> selectByCondition(@Param("status") Integer status,
                                  @Param("componeyName") String componeyName,
                                  @Param("brandName") String brandName);

    List<Brand> selectByCondition(Map map);

    /*添加商品*/
    void add(Brand brand);

    int update(Brand brand);

    void deleteById(int id);

    void deleyeByids(@Param("ids") int[] ids);
}
