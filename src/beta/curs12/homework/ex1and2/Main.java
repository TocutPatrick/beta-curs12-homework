package beta.curs12.homework.ex1and2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you age: ");
        int age = scan.nextInt();
        BirthYearCalculator newCalculator = new BirthYearCalculator(age);


        try {
            System.out.println(newCalculator.getBirthYear());
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
