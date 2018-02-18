package com.company.hibernate.dao.hibernate;

import com.company.hibernate.dao.SkillDAO;
import com.company.hibernate.model.Skill;
import com.company.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class SkillDAOImpl implements SkillDAO {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Skill skill) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(skill);
        transaction.commit();
        session.close();
    }

    @Override
    public Skill getById(Long id) {
        Session session = this.sessionFactory.openSession();
        Skill skill = session.get(Skill.class, id);
        session.close();
        return skill;
    }

    @Override
    public void remove(Long id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, id);
        session.delete(skill);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Skill> getAll() {
        Session session = this.sessionFactory.openSession();
        Query query = session.createQuery("FROM Skill");
        List<Skill> result = query.list();
        session.close();
        return result;
    }

    @Override
    public void update(Skill skill) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(skill);
        transaction.commit();
        session.close();
    }
}
