package com.company.hibernate.dao.hibernate;

import com.company.hibernate.dao.CompanyDAO;
import com.company.hibernate.model.Company;
import com.company.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class CompanyDAOImpl implements CompanyDAO {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Company company) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(company);
        transaction.commit();
        session.close();
    }

    @Override
    public Company getById(Long id) {
        Session session = this.sessionFactory.openSession();
        Company company = session.get(Company.class, id);
        session.close();
        return company;
    }

    @Override
    public void remove(Long id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Company company = session.get(Company.class, id);
        session.delete(company);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Company> getAll() {
        Session session = this.sessionFactory.openSession();
        Query query = session.createQuery("FROM Company");
        List<Company> result = query.list();
        session.close();
        return result;
    }

    @Override
    public void update(Company company) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(company);
        transaction.commit();
        session.close();
    }
}
