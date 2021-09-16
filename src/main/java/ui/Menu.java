package ui;

import services.AtmCurrency;
import services.Service;

public class Menu {
    public static void mainMenu() {
        System.out.println("Please choose operation\n");
        for (int i = 0; i < Service.values().length; i++) {
            System.out.printf("          %d: %s\n", i + 1, Service.values()[i].getValue());
        }
        System.out.println("          0: exit\n");
    }


    public static void currency() {
        System.out.println("Please choose currency\n");
        for (int i = 0; i < AtmCurrency.values().length; i++) {
            System.out.printf("          %d: %s\n", i + 1, AtmCurrency.values()[i]);
        }
        System.out.println("          0: exit\n");
    }
}
