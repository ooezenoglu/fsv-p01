package project01;

import java.util.ArrayList;
import java.util.List;

import net.jqwik.api.Assume;

public class RunLength {
    public static <T> List<Run<T>> encode(List<T> input) {
        // Note: you may assume without checking that input contains no null elements.
        // Java will complain if you try something like this:
        //     if(input.contains(null))

        List<Run<T>> result = new ArrayList<>();
        
        // TODO: implement this method

        Assume.that(input.size() > 0);

        int counter = 1;

        for(int i = 0; i < input.size()-1; i++) {
            if (input.get(i).equals(input.get(i+1))) {
                counter++;
            } else {
                result.add(new Run<T>(counter, input.get(i)));
                counter = 1;
            }
        }

        // add last run of the input
        result.add(new Run<T>(counter, input.get(input.size()-1)));

        return result;
    }

    public static <T> List<T> decode(List<Run<T>> runs) {
        List<T> result = new ArrayList<>();

        // TODO: implement this method

        for(int i = 0; i < runs.size(); i++) {
            for(int j = 0; j < runs.get(i).count(); j++) {
                result.add(runs.get(i).elem);
            }
        }

        return result;
    }

    public static Integer sum(List<Run<Integer>> runs) {
        // TODO: implement this method (you may peek)

        return 0;
    }
}
