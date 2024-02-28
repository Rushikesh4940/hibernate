package com.example.hibernatepractice.controller;

import com.example.hibernatepractice.Dao.UserInfoDAO;
import com.example.hibernatepractice.Dao.UserInfoDAOImpl;
import com.example.hibernatepractice.Dao.UserInfoDAOImpl1;
import com.example.hibernatepractice.Tables.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserInfoContoller {
    @Autowired
    private UserInfoDAO userInfoDAO;
    public UserInfoContoller( UserInfoDAO userInfoDAO) {
        this.userInfoDAO = userInfoDAO;
    }
    @PostMapping("/userInfo")
    public void adduserinfo(@RequestBody UserInfo userInfo)
    {
        userInfoDAO.adduserInfo(userInfo);
    }
}
