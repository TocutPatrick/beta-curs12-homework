package beta.curs12.homework.extra1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private List<DaySchedule> daySchedule;

    public DailyPlanner() {
        this.daySchedule = new ArrayList<>();
        for (Day day : Day.values()) {
            daySchedule.add(new DaySchedule(day));
        }
    }

    public List<String> getDaySchedule() {
        List<String> list = new ArrayList<>();
        for (DaySchedule ds : daySchedule) {
            list.add(ds.getDaysOfWeek() + " -> " + ds.getActivities());
        }
        return list;
    }

    public void addActivity(Day day, String activity) {
        if (activity == null) {
            throw new NoActivityException("Activity is null");
        }
        for (DaySchedule ds : daySchedule) {
            if (ds.getDaysOfWeek().equals(day)) {
                ds.addActivity(activity);
            }
        }
    }

    public void removeActivity(Day day, String activity) {
        for (DaySchedule ds : daySchedule) {
            for (String ac : ds.getActivities()) {
                if (ac.equalsIgnoreCase(activity)) {
                    throw new NoActivityException("Activity doesn't exist");
                }
            }
            if (ds.getDaysOfWeek().equals(day)) {
                ds.removeActivity(activity);
            }
        }
    }

    public List<String> getActivities(Day day) {
        List<String> toDo = new ArrayList<>();
        for (DaySchedule ds : daySchedule) {
            if (ds.getDaysOfWeek().equals(day)) {
                toDo.add(ds.toString());
            }
        }
        return toDo;
    }

    public Map<Day, List<String>> endPlanning() throws NoActivitiesForDay {
        Map<Day, List<String>> map = new HashMap<>();
        for (DaySchedule ds : daySchedule) {
            if (ds.getActivities().isEmpty()) {
                throw new NoActivitiesForDay("No activities for " + ds.getDaysOfWeek());
            }
            map.put(ds.getDaysOfWeek(), ds.getActivities());
        }
        return map;
    }


}
