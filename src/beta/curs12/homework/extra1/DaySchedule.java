package beta.curs12.homework.extra1;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private Day day;
    private final List<String> activities = new ArrayList<>();

    public DaySchedule(Day day) {
        this.day = day;
    }

    public Day getDaysOfWeek() {
        return day;
    }

    public List<String> getActivities() {
        return new ArrayList<>(activities);
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
                day +
                "-> activities " + activities;
    }
}

