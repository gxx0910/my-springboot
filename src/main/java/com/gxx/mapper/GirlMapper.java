package com.gxx.mapper;

import com.gxx.Girl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface GirlMapper {
    /**
     * 查询用户
     *
     * @param Id
     * @return
     */
    List<Girl> findAll(@Param("id") int Id);

    Girl findAll1(@Param("id") int Id);

    void test1(Girl girl);

    List<Map<String, Object>> findAll11();
}