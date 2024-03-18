//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Instrustor:
Assignment Name: GLAB - 303.3.2 -Reading a String From the Console
Author: Pavlenko Anna
Data: March_18_2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // To read a string from the console as input in Java applications,
        // you can use the <Scanner> class along with <System.in>

        // Example 1 – Read String from Console Input:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        // Example 2: Reading a String From the Console:
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input2.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);

    }
}