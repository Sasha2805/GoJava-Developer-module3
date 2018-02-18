package com.company.hibernate.view;

import com.company.hibernate.dao.jpaImpl.CompanyDaoImpl;
import com.company.hibernate.model.Company;
import java.util.Scanner;

public class CompanyView extends ModelView<Company> {
    private CompanyDaoImpl companyDao = new CompanyDaoImpl();
    private Scanner in = MainView.getScanner();

    public CompanyView(){
        super.setClass(companyDao);
    }

    @Override
    public void getView() {
        super.getView();
    }

    @Override
    void save() {
        Company company = new Company();
        this.setName(company);
        this.setInfo(company);
        companyDao.save(company);
    }

    @Override
    void update() {
        System.out.print("Enter id: ");
        Long id = in.nextLong();
        Company company = companyDao.getById(id);
        System.out.println("Select a field to update");
        System.out.println("1. Name");
        System.out.println("2. Info");
        System.out.println("3. Back");
        int choice = in.nextInt();
        if (choice == 1) {
            companyDao.update(this.setName(company));
            super.backToUpdate();
        } else if (choice == 2) {
            companyDao.update(this.setInfo(company));
            super.backToUpdate();
        } else if (choice == 3) {
            super.backToActions();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            update();
        }
    }

    private Company setName(Company company){
        System.out.print("Enter name: ");
        String name = in.next();
        company.setName(name);
        return company;
    }

    private Company setInfo(Company company){
        System.out.print("Enter info: ");
        String info = in.next();
        company.setInfo(info);
        return company;
    }
}
