package project01;

import java.util.Arrays;
import java.util.List;

public class Histogram {
    int[] frequency;
    int min, max;

    public Histogram(List<Integer> data) {
        // TODO: initialize attributes

        min = data.stream().min(Integer::compare).get();
        max = data.stream().max(Integer::compare).get();
        frequency = new int[max-min+1];

        for (int value : data) {
            // TODO: update frequencies here
            // Hint: look at method count below
            
            frequency[value - min]++;
        }
    }

    // Note: this constructor is provided as a convenience,
    //       it calls the primary constructor above
    public Histogram(Integer... data) {
        this(Arrays.asList(data));
    }

    public int min() {
        return min;
    }

    public int max() {
        return max;
    }

    public int count(int value) {
        int index = value - min;

        if (0 <= index && index < frequency.length)
            return frequency[index];
        else
            return 0;
    }
}
