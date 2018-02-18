package com.company.hibernate.dao;

import com.company.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public abstract class AbstractHibDao<T> implements Dao<T, Long> {
    private Class<T> entityClass;
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public final void setClass(Class<T> classToSet){
        this.entityClass = classToSet;
    }

    @Override
    public void save(T t) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(t);
        transaction.commit();
        session.close();
    }

    @Override
    public T getById(Long id) {
        Session session = this.sessionFactory.openSession();
        return session.get(entityClass, id);
    }

    @Override
    public void remove(Long id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(session.get(entityClass, id));
        transaction.commit();
        session.close();
    }

    @Override
    public List<T> getAll() {
        Session session = this.sessionFactory.openSession();
        Query query = session.createQuery("FROM " + entityClass.getName());
        List<T> result = query.list();
        session.close();
        return result;
    }

    @Override
    public void update(T t) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(t);
        transaction.commit();
        session.close();
    }
}
