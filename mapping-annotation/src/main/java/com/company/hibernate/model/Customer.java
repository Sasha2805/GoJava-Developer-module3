package com.company.hibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "info")
    private String info;

    @ManyToMany(fetch = FetchType.EAGER,
            targetEntity = Project.class,
            cascade = {CascadeType.MERGE})
    @JoinTable(name = "customer_projects",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects = new HashSet<>(0);

    public Customer() {}

    public Customer(String firstName, String lastName, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.info = info;
    }

    @Override
    public String toString() {
        return "CustomerDaoImpl{" +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", info = '" + info + '\'' +
                '}';
    }
}
