package com.example.hibernatepractice.Dao;

import com.example.hibernatepractice.Tables.UserInfo;
import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Primary
@Repository
public class UserInfoDAOImpl1 implements UserInfoDAO{
    @Override
    @Transactional
    public void adduserInfo(UserInfo userInfo) {
        System.out.println("hi jagadeesh");
    }
}
