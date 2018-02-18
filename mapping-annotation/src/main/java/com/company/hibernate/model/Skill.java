package com.company.hibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import com.company.hibernate.model.enums.SkillLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "skill")
    private String skill;

    @Column(name = "skill_level")
    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;

    @ManyToMany(fetch = FetchType.EAGER,
            targetEntity = Developer.class,
            cascade = {CascadeType.MERGE})
    @JoinTable(name = "developer_skills",
            joinColumns = @JoinColumn(name = "skill_id"),
            inverseJoinColumns = @JoinColumn(name = "developer_id"))
    private Set<Developer> developers = new HashSet<>(0);

    public Skill(){}

    public Skill(String skill, SkillLevel skillLevel) {
        this.skill = skill;
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id = " + id +
                ", skill = '" + skill + '\'' +
                ", skillLevel = '" + skillLevel + '\'' +
                '}';
    }
}
