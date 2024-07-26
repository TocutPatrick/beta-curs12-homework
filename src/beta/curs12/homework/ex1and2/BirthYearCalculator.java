package beta.curs12.homework.ex1and2;

import java.time.LocalDateTime;
import java.util.Scanner;

public record BirthYearCalculator(
        int age
) {
    public BirthYearCalculator {
        if (age < 0 || age > 120) {
            throw new AgeException("Age must be between 0 and 120.");
        }
    }

    public int getBirthYear(boolean birthdayOccured) {
        int year = LocalDateTime.now().getYear();
        return birthdayOccured ? year - age : year - 1 - age;
    }
}

