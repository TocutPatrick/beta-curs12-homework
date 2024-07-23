package beta.curs12.homework.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        IntTools number = new IntTools(num);

        System.out.println("Digit sum is " + number.digitSum());
        System.out.println("Last digit is " + number.lastDigit());

        try {
            System.out.println("Digit at given position is " + number.digitAt(75));
        } catch (NumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
