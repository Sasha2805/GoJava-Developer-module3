package com.company.hibernate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = createManagerFactory();

    private static EntityManagerFactory createManagerFactory(){
        return Persistence.createEntityManagerFactory("jpa");
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return ENTITY_MANAGER_FACTORY;
    }
}
