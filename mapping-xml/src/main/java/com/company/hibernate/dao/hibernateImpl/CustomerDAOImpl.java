package com.company.hibernate.dao.hibernate;

import com.company.hibernate.dao.CustomerDAO;
import com.company.hibernate.model.Customer;
import com.company.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Customer customer) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public Customer getById(Long id) {
        Session session = this.sessionFactory.openSession();
        Customer customer = session.get(Customer.class, id);
        session.close();
        return customer;
    }

    @Override
    public void remove(Long id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        session.delete(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Customer> getAll() {
        Session session = this.sessionFactory.openSession();
        Query query = session.createQuery("FROM Customer");
        List<Customer> result = query.list();
        session.close();
        return result;
    }

    @Override
    public void update(Customer customer) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(customer);
        transaction.commit();
        session.close();
    }
}
