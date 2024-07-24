package beta.curs12.homework.extra1.extra2;

import beta.curs12.homework.extra1.DailyPlanner;
import beta.curs12.homework.extra1.DaysOfWeek;

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
                System.out.println("1) Add an activity\n2)Remove an activity\n3)List all activities\n4)End planning");
                System.out.print("Enter number for command: ");
                response = scan.nextInt();

                if (response == 1) {
                    System.out.print("Day... ");
                    day = dayResponse();
                    System.out.print("Activity...");
                    act = activityResponse();
                    plan.addActivity(daysOfWeek(day), act);
                }

                if (response == 2) {
                    System.out.print("Day... ");
                    day = dayResponse();
                    System.out.print("Activity...");
                    act = activityResponse();
                    plan.removeActivity(daysOfWeek(day), act);
                }

                if (response == 3) {
                    plan.getDaySchedule();
                }

                if (response > 4) {
                    throw new NoCommandForNumber("Inccorect input");
                }
            } catch (NoCommandForNumber | InvalidDay e) {
                System.out.println(e.getMessage());
            }
        } while (response != 4);
        System.out.println("Closing Planner App...");
    }

    private static String activityResponse() {
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        return day;
    }

    private static String dayResponse() {
        Scanner scan = new Scanner(System.in);
        String activity = scan.next();
        return activity;
    }

    private static DaysOfWeek daysOfWeek(String day) throws InvalidDay {
        DaysOfWeek nd;
        switch (day.toLowerCase()) {
            case "monday":
                nd = DaysOfWeek.MONDAY;
                break;
            case "tuesday":
                nd = DaysOfWeek.TUESDAY;
                break;
            case "wednesday":
                nd = DaysOfWeek.WEDNESDAY;
                break;
            case "thursday":
                nd = DaysOfWeek.THURSDAY;
                break;
            case "friday":
                nd = DaysOfWeek.FRIDAY;
                break;
            case "saturday":
                nd = DaysOfWeek.SATURDAY;
                break;
            case "sunday":
                nd = DaysOfWeek.SUNDAY;
                break;
            default:
                throw new InvalidDay("Invalid day: " + day);
        }
        return nd;
    }
}
