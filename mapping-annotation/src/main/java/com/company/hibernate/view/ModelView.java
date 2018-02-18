package com.company.hibernate.view;

import com.company.hibernate.dao.AbstractJpaDao;
import java.util.Scanner;

public abstract class ModelView<T> {
    private AbstractJpaDao<T> abstractJpaDao;
    private Scanner in = new Scanner(System.in);

    public final void setClass(AbstractJpaDao<T> abstractJpaDao){
        this.abstractJpaDao = abstractJpaDao;
    }

    public void getView(){
        System.out.println("Select an action:");
        System.out.println("1. Select by id");
        System.out.println("2. Select all");
        System.out.println("3. Remove");
        System.out.println("4. Save");
        System.out.println("5. Update");
        System.out.println("6. Finish work with the object");
        int choice = in.nextInt();
        if (choice == 1) {
            selectById();
        } else if (choice == 2) {
            selectAll();
        } else if (choice == 3) {
            remove();
        } else if (choice == 4) {
            save();
        } else if (choice == 5) {
            update();
        } else if (choice == 6) {
            System.out.println();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            getView();
        }
    }

    private void selectById(){
        System.out.print("Enter id: ");
        Long id = in.nextLong();
        System.out.println(abstractJpaDao.getById(id));
        this.backToActions();
    }

    private void selectAll(){
        abstractJpaDao.getAll().forEach(i -> System.out.println(i.toString()));
        this.backToActions();
    }

    private void remove(){
        System.out.print("Enter id: ");
        Long id = in.nextLong();
        abstractJpaDao.remove(id);
        System.out.println("Object deleted.");
        this.backToActions();
    }

    abstract void save();
    abstract void update();

    public void backToActions(){
        System.out.println("Do you want to continue working with the object?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = in.nextInt();
        if (choice == 1) {
            this.getView();
        } else if (choice == 2) {
            System.out.println();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            backToActions();
        }
    }

    public void backToUpdate(){
        System.out.println("Do you want to continue updating?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = in.nextInt();
        if (choice == 1) {
            this.update();
        } else if (choice == 2) {
            this.getView();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            backToUpdate();
        }
    }
}
