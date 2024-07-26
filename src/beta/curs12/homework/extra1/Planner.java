package beta.curs12.homework.extra1;

public class Planner {
    public static void main(String[] args) throws NoActivitiesForDay {


    DailyPlanner plan = new DailyPlanner();
        try {
            plan.addActivity(Day.MONDAY, "Sport");
            plan.addActivity(Day.MONDAY, "Pray");
            plan.addActivity(Day.MONDAY, "Eat");
//            plan.addActivity(DaysOfWeek.MONDAY, null);

            plan.addActivity(Day.TUESDAY, "Meetings");
//            plan.addActivity(DaysOfWeek.TUESDAY, "Meetings");

            plan.addActivity(Day.WEDNESDAY, "Rest");
            plan.addActivity(Day.WEDNESDAY, "Basketball");
            plan.addActivity(Day.WEDNESDAY, "Study");
            plan.addActivity(Day.WEDNESDAY, "Swim");

            plan.addActivity(Day.THURSDAY,"Read");

            plan.addActivity(Day.FRIDAY,"School");

            plan.addActivity(Day.SATURDAY,"Rest");

            plan.addActivity(Day.SUNDAY, "Church");
        } catch (NoActivityException e) {
            System.out.println(e.getMessage());;
        }

        try {
            System.out.println(plan.endPlanning());
        }catch (NoActivitiesForDay e){
            System.out.println(e.getMessage());
        }
    }
}
