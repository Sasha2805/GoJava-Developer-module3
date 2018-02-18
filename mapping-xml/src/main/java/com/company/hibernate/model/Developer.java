package com.company.hibernate.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private BigDecimal salary;

    public Developer(){}

    public Developer(Long id, String firstName, String lastName, Integer age, String sex, BigDecimal salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = sex;
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
