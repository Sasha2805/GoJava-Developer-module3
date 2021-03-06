package com.company.hibernate.dao.hibernateImpl;

import com.company.hibernate.dao.AbstractHibDao;
import com.company.hibernate.model.Company;
import java.util.List;

public class CompanyDaoImpl extends AbstractHibDao<Company> {

    public CompanyDaoImpl() {
        super.setClass(Company.class);
    }

    @Override
    public void save(Company company) {
        super.save(company);
    }

    @Override
    public Company getById(Long id) {
        return super.getById(id);
    }

    @Override
    public void remove(Long id) {
        super.remove(id);
    }

    @Override
    public List<Company> getAll() {
        return super.getAll();
    }

    @Override
    public void update(Company company) {
        super.update(company);
    }
}
