package Revers2;

import java.util.Scanner;

public class ReversCopyCat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option = "Y";
        //Reversing number
        do {

            System.out.println("Enter number");
            //user input
            int num = input.nextInt();
            input.nextLine();
            //for loop will decrement i
            for (int i = num; i >= 1; i--) {

                if (i % 5 == 0) {
                    System.out.println("Copy");

                } else if (i % 7 == 0) {
                    System.out.println("Cat");
                }else
                    System.out.println(i);

            }
            System.out.println("Would you like to enter another number (y/n) ");
            //user will have option to continue
            option=input.nextLine();

        } while (option.equalsIgnoreCase("y"));

    }
}
