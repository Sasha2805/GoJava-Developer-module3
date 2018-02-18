package com.company.hibernate.view;

import com.company.hibernate.dao.hibernateImpl.DeveloperDaoImpl;
import com.company.hibernate.model.Developer;
import com.company.hibernate.model.enums.Gender;
import java.math.BigDecimal;
import java.util.Scanner;

public class DeveloperView extends ModelView<Developer>{
    private DeveloperDaoImpl developerDao = new DeveloperDaoImpl();
    private Scanner in = MainView.SCANNER;

    public DeveloperView(){
        super.setClass(developerDao);
    }

    @Override
    public void getView() {
        super.getView();
    }

    @Override
    void save() {
        Developer developer = new Developer();
        this.setFirstName(developer);
        this.setLastName(developer);
        this.setAge(developer);
        this.setGender(developer);
        this.setSalary(developer);
        developerDao.save(developer);
        super.backToActions();
    }

    @Override
    void update() {
        System.out.print("Enter id: ");
        Long id = in.nextLong();
        Developer developer = developerDao.getById(id);
        System.out.println("Select a field to update");
        System.out.println("1. First name");
        System.out.println("2. Last name");
        System.out.println("3. Age");
        System.out.println("4. Sex");
        System.out.println("5. Salary");
        System.out.println("6. Back");
        int choice = in.nextInt();
        if (choice == 1) {
            developerDao.update(this.setFirstName(developer));
            super.backToUpdate();
        } else if (choice == 2) {
            developerDao.update(this.setLastName(developer));
            super.backToUpdate();
        } else if (choice == 3) {
            developerDao.update(this.setAge(developer));
            super.backToUpdate();
        } else if (choice == 4) {
            developerDao.update(this.setGender(developer));
            super.backToUpdate();
        } else if (choice == 5) {
            developerDao.update(this.setSalary(developer));
            super.backToUpdate();
        } else if (choice == 6){
            super.backToActions();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            update();
        }
    }

    private Developer setFirstName(Developer developer){
        System.out.print("Enter first name: ");
        String firstName = in.next();
        developer.setFirstName(firstName);
        return developer;
    }

    private Developer setLastName(Developer developer){
        System.out.print("Enter last name: ");
        String lastName = in.next();
        developer.setLastName(lastName);
        return developer;
    }

    private Developer setAge(Developer developer){
        System.out.print("Enter age: ");
        int age = in.nextInt();
        developer.setAge(age);
        return developer;
    }

    private Developer setGender(Developer developer){
        System.out.println("Select gender: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        int choice = in.nextInt();
        if (choice == 1) {
            developer.setGender(Gender.MALE);
            return developer;
        } else if (choice == 2) {
            developer.setGender(Gender.FEMALE);
            return developer;
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            setGender(developer);
        }
        return null;
    }

    private Developer setSalary(Developer developer){
        System.out.print("Enter salary: ");
        BigDecimal salary = in.nextBigDecimal();
        developer.setSalary(salary);
        return developer;
    }
}
