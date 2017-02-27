package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the first number?");
            int x = input.nextInt();
            System.out.println("What is the second number?");
            int y = input.nextInt();
            System.out.println("Do you want to find it 1: Recursively or 2: Iteratively... Please enter the number!");
            input.nextLine();
            String qwer = input.nextLine();
            if(qwer.equalsIgnoreCase("1"))
            System.out.println("The GCF is " + Recursively(x, y));
            else if(qwer.equalsIgnoreCase("2"))
            System.out.println("The GCF is " + Iteratively(x, y));
            else
                System.out.println("That was not an option or you did not enter the number");
        } catch (InputMismatchException e) {
            System.out.println("That is not a number!");
        }

    }
    public static int Recursively(int x, int y) {
            if(x == 0)
                return y;
            else if(y == 0)
                return x;
            else if(x > y)
                return Recursively(y, x%y);
            return Recursively(x, y%x);

    }
    public static int Iteratively(int x, int y){
        boolean w = true;
        int whale = 0;
        while(w){
            if(x == 0)
                return y;
            else if(y == 0)
                return x;
            if(x > y)
                whale = x%y;
            else
                whale = y%x;
            x = y;
            y = whale;
        }
        return 0;
    }
}
