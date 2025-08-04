package org.example.Homework.session18;
//Create a day scheduler application that uses an enum to represent the days of the week. The application should be able to assign and retrieve activities for each day.
import org.example.Session17.JavaCollectionsDemo;

import java.util.Map;
import java.util.TreeMap;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Scheduler {
    private Map<Day, String> activities;

    public Scheduler() {
        activities = new TreeMap<>();
    }

    public void setActivity(Day day, String activity) {
        activities.put(day, activity);
    }

    public String getActivity(Day day) {
        return activities.get(day);
    }


}
 class Prog {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();

        scheduler.setActivity(Day.MONDAY, "Go to gym");
        scheduler.setActivity(Day.WEDNESDAY, "Team meeting");
        scheduler.setActivity(Day.FRIDAY, "Movie night");

        System.out.println("Activity on Monday: " + scheduler.getActivity(Day.MONDAY));
        System.out.println("Activity on Sunday: " + scheduler.getActivity(Day.SUNDAY));

    }
}

