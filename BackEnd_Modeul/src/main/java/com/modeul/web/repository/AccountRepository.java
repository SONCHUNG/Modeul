package com.modeul.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.modeul.web.entity.Account;

@Mapper
public interface AccountRepository {

    int insertAccount(Account account);

    // Account findAccountById(Long memberId);

    List<Account> findViewById(Long memberId, int size, int offset, String orderField, String orderDir);
    
}
