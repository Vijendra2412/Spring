package com.vjcoder.AOPDemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements Accountdao{

    @Override
    public void addAccount() {
        System.out.println(getClass() + ":- DOING MY DB WORK: ADDING AN ACCOUNT");

    }
}
