package com.sangsang.api;

import com.sangsang.security.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * Created by wonyongkim on 2017. 1. 15..
 */
@RestController
@RequestMapping(value="/api")
public class HelloController {

    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping(value="/hello1", method = RequestMethod.GET)
    public List<Map<String,Object>> hello1() throws Exception{
        return accountMapper.getUsers();
    }

    @RequestMapping(value="/hello2", method = RequestMethod.GET)
    public String hello2() throws Exception{
        return "Hello2 SangSang security";
    }

    @RequestMapping(value="/error", method = RequestMethod.GET)
    public String error() throws Exception{
        return "error";
    }


}
