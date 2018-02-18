package com.company.hibernate.view;

import java.util.Scanner;

public class MainView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static DeveloperView developerView = new DeveloperView();
    private static ProjectView projectView = new ProjectView();
    private static CustomerView customerView = new CustomerView();
    private static CompanyView companyView = new CompanyView();
    private static SkillView skillView = new SkillView();

    public static void getView(){
        System.out.println("Welcome to Database Manager");
        start();
    }

    private static void start(){
        System.out.println("Select an action:");
        System.out.println("1. Start working with the object");
        System.out.println("2. Exit");
        int choice = SCANNER.nextInt();
        if (choice == 1) {
            selectEntity();
        } else if (choice == 2) {
            SCANNER.close();
        } else {
            System.out.println("You entered an invalid number..Enter the number again.");
            start();
        }
    }

    private static void selectEntity(){
        System.out.println("Select the type of object you want to work with");
        System.out.println("1. Developer");
        System.out.println("2. Project");
        System.out.println("3. Customer");
        System.out.println("4. Company");
        System.out.println("5. Skill");
        int choice = SCANNER.nextInt();
        if (choice == 1) {
            developerView.getView();
        } else if (choice == 2) {
            projectView.getView();
        } else if (choice == 3) {
            customerView.getView();
        } else if (choice == 4) {
            companyView.getView();
        } else if (choice == 5) {
            skillView.getView();
        } else {
            System.out.println("You entered an invalid number...Enter the number again.");
            selectEntity();
        }
    }

    public static Scanner getScanner() {
        return SCANNER;
    }
}
