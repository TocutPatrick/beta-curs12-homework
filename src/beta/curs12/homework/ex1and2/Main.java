package beta.curs12.homework.ex1and2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = scan.nextInt();
            BirthYearCalculator newCalculator = new BirthYearCalculator(age);

            System.out.println("Has it already been your birthday this year? (yes/no)");
            String response = scan.next();
            boolean birthdayOccurred = response.equalsIgnoreCase("yes");

            System.out.println("Your birth year is " + newCalculator.getBirthYear(birthdayOccurred));
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
