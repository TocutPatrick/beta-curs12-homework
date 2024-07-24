package beta.curs12.homework.extra1;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private DaysOfWeek daysOfWeek;
    private List<String> activities;

    public DaySchedule(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        this.activities = new ArrayList<>();
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }

    @Override
    public String toString() {
        return "DaySchedule: " +
                daysOfWeek +
                "-> activities " + activities;
    }
}

