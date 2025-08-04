package org.example.Homework.session18;

import java.util.Arrays;
import java.util.List;

//Implement the toString method in a class holding a large dataset to print a “summary” version of the dataset, facilitating debugging and logging.

public class Summary {
    private List<String> data;

    public Summary(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        int maxElem = 3;
        StringBuilder sb = new StringBuilder();
        sb.append("Summary=").append(data.size()).append(", preview=[");

        for (int i = 0; i < Math.min(data.size(), maxElem); i++) {
            sb.append(data.get(i));
            if (i < Math.min(data.size(), maxElem) - 1) {
                sb.append(", ");
            }
        }

            if (data.size() > maxElem) {
                sb.append(", ...");
            }

            sb.append("])");
            return sb.toString();
        }
    }


 class Summaries {
    public static void main(String[] args) {
        Summary ds = new Summary(Arrays.asList("unu", "doi", "trei", "patru", "cinci"));
        System.out.println(ds);
    }
}

