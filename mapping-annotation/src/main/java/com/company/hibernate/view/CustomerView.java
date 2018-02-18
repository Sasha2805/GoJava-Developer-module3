package com.company.hibernate.view;

import com.company.hibernate.dao.jpaImpl.CustomerDaoImpl;
import com.company.hibernate.model.Customer;
import java.util.Scanner;

public class CustomerView extends ModelView<Customer> {
    private CustomerDaoImpl customerDao = new CustomerDaoImpl();
    private Scanner in = MainView.getScanner();

    public CustomerView(){
        super.setClass(customerDao);
    }

    @Override
    public void getView() {
        super.getView();
    }

    @Override
    void save() {
        Customer customer = new Customer();
        this.setFirstName(customer);
        this.setLastName(customer);
        this.setInfo(customer);
        customerDao.save(customer);
    }

    @Override
    void update() {
        System.out.print("Enter id: ");
        Long id = in.nextLong();
        Customer customer = customerDao.getById(id);
        System.out.println("Select a field to update");
        System.out.println("1. First name");
        System.out.println("2. Last name");
        System.out.println("3. Cost");
        System.out.println("4. Back");
        int choice = in.nextInt();
        if (choice == 1) {
            customerDao.update(this.setFirstName(customer));
            super.backToUpdate();
        } else if (choice == 2) {
            customerDao.update(this.setLastName(customer));
            super.backToUpdate();
        } else if (choice == 3) {
            customerDao.update(this.setInfo(customer));
            super.backToUpdate();
        } else if (choice == 4) {
            super.backToActions();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            update();
        }
    }

    private Customer setFirstName(Customer customer){
        System.out.print("Enter first name: ");
        String firstName = in.next();
        customer.setFirstName(firstName);
        return customer;
    }

    private Customer setLastName(Customer customer){
        System.out.print("Enter last name: ");
        String lastName = in.next();
        customer.setLastName(lastName);
        return customer;
    }

    private Customer setInfo(Customer customer){
        System.out.print("Enter info: ");
        String info = in.next();
        customer.setInfo(info);
        return customer;
    }
}
