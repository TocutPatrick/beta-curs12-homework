package beta.curs12.homework.extra1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private List<DaySchedule> daySchedule;

    public DailyPlanner() {
        this.daySchedule = new ArrayList<>();
        for (DaysOfWeek day : DaysOfWeek.values()) {
            daySchedule.add(new DaySchedule(day));
        }
    }

    public void getDaySchedule() {
        for (DaySchedule ds : daySchedule) {
            System.out.println(ds.getDaysOfWeek() + " -> " + ds.getActivities());
        }
    }

    public void addActivity(DaysOfWeek daysOfWeek, String activity) {
        if (activity == null) {
            throw new NoActivityException("Activity is null");
        }
        for (DaySchedule ds : daySchedule) {
            if (ds.getDaysOfWeek().equals(daysOfWeek)) {
                ds.addActivity(activity);
            }
        }
    }

    public void removeActivity(DaysOfWeek daysOfWeek, String activity) {
        for (DaySchedule ds : daySchedule) {
            for (String ac : ds.getActivities()) {
                if (ac.equalsIgnoreCase(activity)) {
                    throw new NoActivityException("Activity doesn't exist");
                }
            }
            if (ds.getDaysOfWeek().equals(daysOfWeek)) {
                ds.removeActivity(activity);
            }
        }
    }

    public List<String> getActivities(DaysOfWeek daysOfWeek) {
        List<String> toDo = new ArrayList<>();
        for (DaySchedule ds : daySchedule) {
            if (ds.getDaysOfWeek().equals(daysOfWeek)) {
                toDo.add(ds.toString());
            }
        }
        return toDo;
    }

    public Map<DaysOfWeek, List<String>> endPlanning() throws NoActivitiesForDay {
        Map<DaysOfWeek, List<String>> map = new HashMap<>();
        for (DaySchedule ds : daySchedule) {
            if (ds.getActivities().isEmpty()) {
                throw new NoActivitiesForDay("No activities for " + ds.getDaysOfWeek());
            }
            map.put(ds.getDaysOfWeek(), ds.getActivities());
        }
        return map;
    }


}
