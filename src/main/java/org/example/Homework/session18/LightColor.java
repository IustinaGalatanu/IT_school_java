package org.example.Homework.session18;
//Create an enum called LightColor that represents the three colors of a traffic light: red, yellow, and green. Each color should have a string representation and a duration (in seconds) associated with it (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green = "Go", 45 seconds).
public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

        private final String description;
        private final int duration;

        LightColor(String description, int duration) {
            this.description = description;
            this.duration = duration;
        }

        public String getDescription() {
            return description;
        }

        public int getDuration() {
            return duration;
        }
    }
    class Main {
    public static void main(String[] args) {
        for (LightColor color : LightColor.values()) {
            System.out.println(
                    color.name() + ": " +
                            color.getDescription() + " for " +
                            color.getDuration() + " seconds."
            );
        }
    }
}



