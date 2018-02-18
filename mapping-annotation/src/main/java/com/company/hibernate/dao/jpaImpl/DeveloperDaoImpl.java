package com.company.hibernate.dao.jpaImpl;

import com.company.hibernate.dao.AbstractJpaDao;
import com.company.hibernate.model.Developer;
import java.util.List;

public class DeveloperDaoImpl extends AbstractJpaDao<Developer> {

    public DeveloperDaoImpl(){
        super.setClass(Developer.class);
    }

    @Override
    public void save(Developer developer) {
        super.save(developer);
    }

    @Override
    public Developer getById(Long id) {
        return super.getById(id);
    }

    @Override
    public void remove(Long id) {
        super.remove(id);
    }

    @Override
    public List<Developer> getAll() {
        return super.getAll();
    }

    @Override
    public void update(Developer developer) {
        super.update(developer);
    }
}
