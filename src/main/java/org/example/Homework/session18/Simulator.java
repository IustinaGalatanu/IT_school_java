package org.example.Homework.session18;

public class Simulator {

        public static void main(String[] args) {
            LightColor[] sequence = {LightColor.RED, LightColor.GREEN, LightColor.YELLOW};

            for (int i = 0; i < 3; i++) {
                for (LightColor color : sequence) {
                    System.out.println("Light: " + color);
                    System.out.println("Action: " + color.getDescription());
                    System.out.println("Duration: " + color.getDuration() + " seconds");
                    System.out.println("-------------------------");
                }
            }
        }
}
