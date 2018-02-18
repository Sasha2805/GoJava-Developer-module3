package com.company.hibernate.model;

import java.util.HashSet;
import java.util.Set;
import com.company.hibernate.model.enums.SkillLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skill {
    private Long id;
    private String skill;
    private SkillLevel skillLevel;
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
