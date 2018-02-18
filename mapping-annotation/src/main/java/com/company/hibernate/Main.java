package com.company.hibernate;

import com.company.hibernate.dao.jpaImpl.DeveloperDaoImpl;
import com.company.hibernate.model.Developer;

public class Test {
    public static void main(String[] args) {
        DeveloperDaoImpl developerDao = new DeveloperDaoImpl();
        Developer developer = developerDao.getById(1L);
        System.out.println(developer.toString());
        developer.getSkills().forEach(i -> System.out.println(i.toString()));

       // developerDao.getAll().forEach(i -> System.out.println(i.toString()));
        System.exit(0);
    }
}
