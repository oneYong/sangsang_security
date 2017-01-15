package com.sangsang.security.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by wonyongkim on 2017. 1. 15..
 */
public interface AccountMapper {

    @Select("SELECT * FROM sangsang.SS_USER")
    public List<Map<String, Object>> getUsers() throws Exception;
}
