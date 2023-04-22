package class12Hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first names and if they expecting boy or girl?
Based on the input suggests a name for a baby: Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Mom's first name");
        String mom=scan.next();
        System.out.println("Enter Dad's first name");
        String dad=scan.next();
        System.out.println("Boy or Girl?");
        String gender=scan.next();

        String suggestedname=null;
        if (gender.equalsIgnoreCase("boy")) {
            suggestedname = dad.substring(0, 2) + mom.substring(0, 2);
            System.out.println(suggestedname);
        } else if (gender.equalsIgnoreCase("girl")) {
            suggestedname=mom.substring(0,2) + dad.substring(0,2);
            System.out.println(suggestedname);
        }


    }
}
