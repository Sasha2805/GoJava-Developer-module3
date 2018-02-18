package com.company.hibernate.dao.jpaImpl;

import com.company.hibernate.dao.AbstractJpaDao;
import com.company.hibernate.model.Skill;
import java.util.List;

public class SkillDaoImpl extends AbstractJpaDao<Skill> {

    public SkillDaoImpl(){
        super.setClass(Skill.class);
    }

    @Override
    public void save(Skill skill) {
        super.save(skill);
    }

    @Override
    public Skill getById(Long id) {
        return super.getById(id);
    }

    @Override
    public void remove(Long id) {
        super.remove(id);
    }

    @Override
    public List<Skill> getAll() {
        return super.getAll();
    }

    @Override
    public void update(Skill skill) {
        super.update(skill);
    }
}
