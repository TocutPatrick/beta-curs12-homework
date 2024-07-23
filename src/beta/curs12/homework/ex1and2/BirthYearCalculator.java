package beta.curs12.homework.ex1and2;

import java.time.LocalDateTime;
import java.util.Scanner;

public record BirthYearCalculator(
        int age
) {
    public BirthYearCalculator(int age) {
        this.age = age;
    }

    public int getBirthYear() throws AgeException {
        Scanner scan = new Scanner(System.in);
        int currentYear = LocalDateTime.now().getYear();
        int year = 0;
        if (age < 0) {
            throw new AgeException("Error. You are not born yet");
        }
        if (age > 120) {
            throw new AgeException("Error. You are too old to be true");
        }
        System.out.println("Has it already been your birthday this year? (yes/no)");
        String response = scan.next();
        if (response.equalsIgnoreCase("yes")) {
            year = currentYear - age;
        } else {
            year = currentYear - 1 - age;
        }
        return year;
    }
}

