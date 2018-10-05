package Revers2;

import java.util.Scanner;

public class ReversCopyCat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option = "Y";

        do {

            System.out.println("Enter number");

            int num = input.nextInt();
            input.nextLine();

            for (int i = num; i >= 1; i--) {

                if (i % 5 == 0) {
                    System.out.println("Copy");

                } else if (i % 7 == 0) {
                    System.out.println("Cat");
                }else
                    System.out.println(i);

            }
            System.out.println("Would you like to enter another number (y/n) ");

            option=input.nextLine();

        } while (option.equalsIgnoreCase("y"));

    }
}
