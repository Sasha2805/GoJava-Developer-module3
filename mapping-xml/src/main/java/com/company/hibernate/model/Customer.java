package com.company.hibernate.model;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String info;
    private Set<Project> projects = new HashSet<>(0);

    public Customer() {}

    public Customer(String firstName, String lastName, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", info = '" + info + '\'' +
                '}';
    }
}
