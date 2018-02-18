package com.company.hibernate.model;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company {
    private Long id;
    private String name;
    private String info;
    private Set<Project> projects = new HashSet<>(0);

    public Company(){}

    public Company(Long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", info = '" + info + '\'' +
                '}';
    }
}
