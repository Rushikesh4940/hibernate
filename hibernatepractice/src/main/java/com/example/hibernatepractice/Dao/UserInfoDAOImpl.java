package com.example.hibernatepractice.Dao;

import com.example.hibernatepractice.Tables.UserInfo;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

    @Autowired
    private EntityManager entityManager;

    public UserInfoDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
        System.out.println("welcome");
    }

    public UserInfoDAOImpl() {
    }


    @Override
    @Transactional
    public void adduserInfo(UserInfo userInfo)
    {
        entityManager.persist(userInfo);
    }
}
