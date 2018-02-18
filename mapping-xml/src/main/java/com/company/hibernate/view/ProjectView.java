package com.company.hibernate.view;

import com.company.hibernate.dao.hibernateImpl.ProjectDaoImpl;
import com.company.hibernate.model.Project;
import java.math.BigDecimal;
import java.util.Scanner;

public class ProjectView extends ModelView<Project> {
    private ProjectDaoImpl projectDao = new ProjectDaoImpl();
    private Scanner in = MainView.getScanner();

    public ProjectView(){
        super.setClass(projectDao);
    }

    @Override
    public void getView() {
        super.getView();
    }

    @Override
    void save() {
        Project project = new Project();
        this.setName(project);
        this.setInfo(project);
        this.setCost(project);
        projectDao.save(project);
    }

    @Override
    void update() {
        System.out.print("Enter id: ");
        Long id = in.nextLong();
        Project project = projectDao.getById(id);
        System.out.println("Select a field to update");
        System.out.println("1. Name");
        System.out.println("2. Info");
        System.out.println("3. Cost");
        System.out.println("4. Finish update");
        int choice = in.nextInt();
        if (choice == 1) {
            projectDao.update(this.setName(project));
            super.backToUpdate();
        } else if (choice == 2) {
            projectDao.update(this.setInfo(project));
            super.backToUpdate();
        } else if (choice == 3) {
            projectDao.update(this.setCost(project));
            super.backToUpdate();
        } else if (choice == 4) {
            super.backToActions();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            update();
        }
    }

    private Project setName(Project project){
        System.out.print("Enter name: ");
        String name = in.next();
        project.setName(name);
        return project;
    }

    private Project setInfo(Project project){
        System.out.print("Enter info: ");
        String info = in.next();
        project.setInfo(info);
        return project;
    }

    private Project setCost(Project project){
        System.out.print("Enter cost: ");
        BigDecimal cost = in.nextBigDecimal();
        project.setCost(cost);
        return project;
    }
}
