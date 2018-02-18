package com.company.hibernate.dao.hibernateImpl;

import com.company.hibernate.dao.AbstractHibDao;
import com.company.hibernate.model.Project;
import java.util.List;

public class ProjectDaoImpl extends AbstractHibDao<Project> {

    public ProjectDaoImpl() {
        super.setClass(Project.class);
    }

    @Override
    public void save(Project project) {
        super.save(project);
    }

    @Override
    public Project getById(Long id) {
        return super.getById(id);
    }

    @Override
    public void remove(Long id) {
        super.remove(id);
    }

    @Override
    public List<Project> getAll() {
        return super.getAll();
    }

    @Override
    public void update(Project project) {
        super.update(project);
    }
}
