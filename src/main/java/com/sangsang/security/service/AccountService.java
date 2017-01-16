package com.sangsang.security.service;

import com.sangsang.security.domain.AccountUser;
import com.sangsang.security.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;

/**
 * Created by wonyongkim on 2017. 1. 15..
 */
public class AccountService implements UserDetailsService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountUser accountUser = null;
        try{
                accountUser = accountMapper.readAccountUser(username);
                accountUser.setAuthorities(getAuthorities(accountUser.getUsername()));
        }catch(Exception e){

        }

        return accountUser;
    }

    private Collection<SimpleGrantedAuthority> getAuthorities(String username){
        Collection<SimpleGrantedAuthority> authorities = null;
        try{
                authorities = accountMapper.readAccountAuthority(username);
        }catch (Exception e){

        }
        return authorities;

    }
}
