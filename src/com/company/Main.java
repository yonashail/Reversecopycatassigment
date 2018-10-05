package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String newnumber=("n");
// Calculate the multiplication of 5 and 7 of any number using do-while and for loop
    {do {
        int n;
        System.out.println("Enter an integer");

        n = in.nextInt();


        for (int counter = n; counter >= 1; counter--) {
            if (counter % 5 == 0) {
                System.out.println(counter);
                // write your code here
            } else if (counter % 7 == 0) {
                System.out.println(counter);
            }
        }
        System.out.println("Would you like to enter another number?");
        newnumber = in.nextLine();
    }while (newnumber.equals("y"));}
    System.out.println("Thank you for playing!!");
    }

}
