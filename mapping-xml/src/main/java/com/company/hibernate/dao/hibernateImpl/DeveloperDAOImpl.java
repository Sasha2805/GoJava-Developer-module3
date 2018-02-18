package com.company.hibernate.dao.hibernate;

import com.company.hibernate.dao.DeveloperDAO;
import com.company.hibernate.model.Developer;
import com.company.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class DeveloperDAOImpl implements DeveloperDAO {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Developer developer) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(developer);
        transaction.commit();
        session.close();
    }

    @Override
    public Developer getById(Long id) {
        Session session = this.sessionFactory.openSession();
        Developer developer = session.get(Developer.class, id);
        return developer;
    }

    @Override
    public void remove(Long id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Developer developer = session.get(Developer.class, id);
        session.delete(developer);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Developer> getAll() {
        Session session = this.sessionFactory.openSession();
        Query query = session.createQuery("FROM Developer");
        List<Developer> result = query.list();
        session.close();
        return result;
    }

    @Override
    public void update(Developer developer) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(developer);
        transaction.commit();
        session.close();
    }
}
