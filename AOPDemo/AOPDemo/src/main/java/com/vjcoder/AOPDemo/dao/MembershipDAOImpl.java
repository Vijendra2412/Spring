package com.vjcoder.AOPDemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{

    @Override
    public boolean addSillyMember() {
        System.out.println(getClass() + ":- DOING MY DB WORK: ADDING A Membership ACCOUNT");
        return true;

    }
}
