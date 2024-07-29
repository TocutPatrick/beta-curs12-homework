package beta.curs12.homework.extra1.extra2;

import beta.curs12.homework.extra1.DailyPlanner;
import beta.curs12.homework.extra1.Day;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoCommandForNumber {
        DailyPlanner plan = new DailyPlanner();
        Scanner scan = new Scanner(System.in);
        int response = 0;
        String day, act;
        do {
            try {
                System.out.println("Planner App");
                System.out.print("""
                        1) Add an activity
                        2) Remove an activity
                        3) List all activities
                        4) End planning
                        """);
                System.out.print("Enter number for command: ");
                response = scan.nextInt();

                switch (response) {
                    case 1 -> {
                        System.out.print("Day... ");
                        day = dayResponse();
                        System.out.print("Activity...");
                        act = activityResponse();
                        plan.addActivity(daysOfWeek(day), act);
                    }
                    case 2 -> {
                        System.out.print("Day... ");
                        day = dayResponse();
                        System.out.print("Activity...");
                        act = activityResponse();
                        plan.removeActivity(daysOfWeek(day), act);
                    }
                    case 3 -> System.out.println(plan.getDaySchedule());
                }
                if (response > 4) {
                    throw new NoCommandForNumber("Incorrect input");
                }
            } catch (NoCommandForNumber | InvalidDay e) {
                System.out.println(e.getMessage());
            }
        } while (response != 4);
        System.out.println("Closing Planner App...");
    }

    private static String activityResponse() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    private static String dayResponse() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    private static Day daysOfWeek(String day) throws InvalidDay {
        try {
            return Day.valueOf(day.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidDay("Invalid day input: " + day);
        }
    }
}