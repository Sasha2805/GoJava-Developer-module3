package com.company.hibernate.model;

import com.company.hibernate.model.enums.Gender;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "developers")
public class Developer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "salary")
    private BigDecimal salary;

    @ManyToMany(fetch = FetchType.EAGER,
                targetEntity = Skill.class,
                cascade = {CascadeType.MERGE})
    @JoinTable(name = "developer_skills",
                joinColumns = @JoinColumn(name = "developer_id"),
                inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> skills = new HashSet<>(0);

    @ManyToMany(fetch = FetchType.EAGER,
            targetEntity = Project.class,
            cascade = {CascadeType.MERGE})
    @JoinTable(name = "developer_projects",
            joinColumns = @JoinColumn(name = "developer_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
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
