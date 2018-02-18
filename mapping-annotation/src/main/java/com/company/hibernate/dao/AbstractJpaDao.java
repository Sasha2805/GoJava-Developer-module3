package com.company.hibernate.dao;

import com.company.hibernate.util.JpaUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public abstract class AbstractJpaDao<T> implements Dao<T, Long> {
    private Class<T> entityClass;
    private EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();

    public final void setClass(Class<T> classToSet){
        this.entityClass = classToSet;
    }

    @Override
    public void save(T t) {
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public T getById(Long id) {
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        return entityManager.find(entityClass, id);
    }

    @Override
    public void remove(Long id) {
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(entityClass, id));
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<T> getAll() {
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("FROM " + entityClass.getName());
        return query.getResultList();
    }

    @Override
    public void update(T t) {
        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(t);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
