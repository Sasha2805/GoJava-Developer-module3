package com.company.hibernate;

import com.company.hibernate.view.MainView;

public class Main {
    public static void main(String[] args) {
        MainView.getView();
        MainView.getScanner().close();
        System.exit(0);
    }
}
