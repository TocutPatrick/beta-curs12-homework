package beta.curs12.homework.extra1;

public class Planner {
    public static void main(String[] args) throws NoActivitiesForDay {


    DailyPlanner plan = new DailyPlanner();
        try {
            plan.addActivity(DaysOfWeek.MONDAY, "Sport");
            plan.addActivity(DaysOfWeek.MONDAY, "Pray");
            plan.addActivity(DaysOfWeek.MONDAY, "Eat");
//            plan.addActivity(DaysOfWeek.MONDAY, null);

            plan.addActivity(DaysOfWeek.TUESDAY, "Meetings");
//            plan.addActivity(DaysOfWeek.TUESDAY, "Meetings");

            plan.addActivity(DaysOfWeek.WEDNESDAY, "Rest");
            plan.addActivity(DaysOfWeek.WEDNESDAY, "Basketball");
            plan.addActivity(DaysOfWeek.WEDNESDAY, "Study");
            plan.addActivity(DaysOfWeek.WEDNESDAY, "Swim");

            plan.addActivity(DaysOfWeek.THURSDAY,"Read");

            plan.addActivity(DaysOfWeek.FRIDAY,"School");

            plan.addActivity(DaysOfWeek.SATURDAY,"Rest");

            plan.addActivity(DaysOfWeek.SUNDAY, "Church");
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
