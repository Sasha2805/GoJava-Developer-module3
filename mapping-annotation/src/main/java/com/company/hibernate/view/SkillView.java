package com.company.hibernate.view;

import com.company.hibernate.dao.jpaImpl.SkillDaoImpl;
import com.company.hibernate.model.Skill;
import com.company.hibernate.model.enums.SkillLevel;
import java.util.Scanner;

public class SkillView extends ModelView<Skill> {
    private SkillDaoImpl skillDao = new SkillDaoImpl();
    private Scanner in = MainView.SCANNER;

    public SkillView(){
        super.setClass(skillDao);
    }

    @Override
    public void getView() {
        super.getView();
    }

    @Override
    void save() {
        Skill skill = new Skill();
        this.setSkill(skill);
        this.setSkillLevel(skill);
        skillDao.save(skill);
    }

    @Override
    void update() {
        System.out.print("Enter id: ");
        Long id = in.nextLong();
        Skill skill = skillDao.getById(id);
        System.out.println("Select a field to update");
        System.out.println("1. Skill");
        System.out.println("2. Skill level");
        System.out.println("3. Back");
        int choice = in.nextInt();
        if (choice == 1) {
            skillDao.update(this.setSkill(skill));
            super.backToUpdate();
        } else if (choice == 2) {
            skillDao.update(this.setSkillLevel(skill));
            super.backToUpdate();
        } else if (choice == 3) {
            super.backToActions();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            update();
        }
    }

    private Skill setSkill(Skill skill){
        System.out.print("Enter skill: ");
        String skillName = in.next();
        skill.setSkill(skillName);
        return skill;
    }

    private Skill setSkillLevel(Skill skill){
        System.out.println("Select skill level: ");
        System.out.println("1. Junior");
        System.out.println("2. Middle");
        System.out.println("3. Senior");
        int choice = in.nextInt();
        if (choice == 1) {
            skill.setSkillLevel(SkillLevel.JUNIOR);
            return skill;
        } else if (choice == 2) {
            skill.setSkillLevel(SkillLevel.MIDDLE);
            return skill;
        } else if (choice == 3) {
            skill.setSkillLevel(SkillLevel.SENIOR);
            return skill;
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            setSkill(skill);
        }
        return null;
    }
}
