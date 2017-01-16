package com.sangsang.security.mapper;

import com.sangsang.security.domain.AccountUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Map;

/**
 * Created by wonyongkim on 2017. 1. 15..
 */
public interface AccountMapper {

    @Select("SELECT * FROM sangsang.SS_USER")
    public List<Map<String, Object>> getUsers() throws Exception;


    @Select("SELECT id, password, name FROM sangsang.SS_SECURITY_USER WHERE id = #{id} ")
    public AccountUser readAccountUser(@Param("id") String id) throws Exception;

    @Select("SELECT authority_name FROM sangsang.SS_SECURITY_AUTHORITY WHERE id = #{id}")
    public List<SimpleGrantedAuthority> readAccountAuthority(@Param("id") String id) throws Exception;
}
