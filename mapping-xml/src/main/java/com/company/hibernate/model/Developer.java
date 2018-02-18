package com.company.hibernate.model;

import com.company.hibernate.model.enums.Gender;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private BigDecimal salary;
    private Set<Skill> skills = new HashSet<>(0);
    private Set<Project> projects = new HashSet<>(0);

    public Developer(){}

    public Developer(String firstName, String lastName, Integer age, Gender gender, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", gender = '" + gender + '\'' +
                ", salary = " + salary +
                '}';
    }
}
