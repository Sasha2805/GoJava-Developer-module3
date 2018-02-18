package com.company.hibernate.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company {
    private Long id;
    private String name;
    private String info;

    public Company(){}

    public Company(Long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", info = '" + info + '\'' +
                '}';
    }
}
