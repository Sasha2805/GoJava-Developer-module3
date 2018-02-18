package com.company.hibernate;

import com.company.hibernate.view.MainView;

public class Main {
    public static void main(String[] args) {
        MainView.getView();
        MainView.SCANNER.close();
        System.exit(0);
    }
}
