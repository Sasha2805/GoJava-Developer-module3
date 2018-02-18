package com.company.hibernate.dao.hibernate;

import com.company.hibernate.dao.ProjectDAO;
import com.company.hibernate.model.Project;
import com.company.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class ProjectDAOImpl implements ProjectDAO {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Project project) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(project);
        transaction.commit();
        session.close();
    }

    @Override
    public Project getById(Long id) {
        Session session = this.sessionFactory.openSession();
        Project project = session.get(Project.class, id);
        session.close();
        return project;
    }

    @Override
    public void remove(Long id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Project project = session.get(Project.class, id);
        session.delete(project);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Project> getAll() {
        Session session = this.sessionFactory.openSession();
        Query query = session.createQuery("FROM Project");
        List<Project> result = query.list();
        session.close();
        return result;
    }

    @Override
    public void update(Project project) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(project);
        transaction.commit();
        session.close();
    }
}
