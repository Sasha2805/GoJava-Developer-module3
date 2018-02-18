package com.company.hibernate.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "info")
    private String info;

    @Column(name = "cost")
    private BigDecimal cost;

    @ManyToMany(fetch = FetchType.EAGER,
            targetEntity = Developer.class,
            cascade = {CascadeType.MERGE})
    @JoinTable(name = "developer_projects",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "developer_id"))
    private Set<Developer> developers = new HashSet<>(0);

    @ManyToMany(fetch = FetchType.EAGER,
            targetEntity = Company.class,
            cascade = {CascadeType.MERGE})
    @JoinTable(name = "company_projects",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id"))
    private Set<Company> companies = new HashSet<>(0);

    @ManyToMany(fetch = FetchType.EAGER,
            targetEntity = Customer.class,
            cascade = {CascadeType.MERGE})
    @JoinTable(name = "customer_projects",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id"))
    private Set<Customer> customers = new HashSet<>(0);

    public Project(){}

    public Project(String name, String info, BigDecimal cost) {
        this.name = name;
        this.info = info;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", info = '" + info + '\'' +
                ", cost = " + cost +
                '}';
    }
}
