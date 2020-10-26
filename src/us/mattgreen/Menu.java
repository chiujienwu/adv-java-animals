package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public Menu(ArrayList<Talkable> list) {
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("What animal do you wish to create:");
        System.out.println("(c)at or (d)og?");
        String input = scanner.nextLine().toLowerCase();

        switch (input) {
            case "c":
                System.out.println("What is the cat's name?");
                String catName = scanner.nextLine();
                System.out.println("How many mouse has the cat killed?");
                int mouse = scanner.nextInt();

                try {
                    Cat cat = new Cat(mouse, catName);
                    list.add(cat);
                } catch (Exception e) {
                    System.out.println("Something went wrong.");
                }

                break;

            case "d":
                System.out.println("What is the dog's name?");
                String dogName = scanner.nextLine();
                System.out.println("Is the dog friendly?");
                System.out.println("(y)es or (n)o?");
                String friend = scanner.nextLine().toLowerCase();

                boolean friendly = false;
                if (friend.equals("y")) {
                    friendly = true;
                }

                try {
                    Dog dog = new Dog(friendly, dogName);
                    list.add(dog);
                } catch (Exception e) {
                    System.out.println("Something went wrong.");
                }

                break;

            default:
                System.out.println("Invalid selection.");
        }
    }
}
