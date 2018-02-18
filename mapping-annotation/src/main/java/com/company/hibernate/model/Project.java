package com.company.hibernate.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
    private Long id;
    private String name;
    private String info;
    private BigDecimal cost;
    private Set<Developer> developers = new HashSet<>(0);
    private Set<Company> companies = new HashSet<>(0);
    private Set<Customer> customers = new HashSet<>(0);

    public Project(){}

    public Project(Long id, String name, String info, BigDecimal cost) {
        this.id = id;
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
