package us.mattgreen;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public Menu () {
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("What animal do you wish to create:");
        System.out.println("(c)at or (d)og?");
        String input = scanner.nextLine();


    }
}
