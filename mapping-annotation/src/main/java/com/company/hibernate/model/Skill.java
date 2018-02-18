package com.company.hibernate.model;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skill {
    private Long id;
    private String skill;
    private String skillLevel;
    private Set<Developer> developers = new HashSet<>(0);

    public Skill(){}

    public Skill(Long id, String skill, String skillLevel) {
        this.id = id;
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
