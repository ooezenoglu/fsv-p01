package project01;

import java.util.ArrayList;
import java.util.List;

public class RunLength {
    public static <T> List<Run<T>> encode(List<T> input) {
        // Note: you may assume without checking that input contains no null elements.
        // Java will complain if you try something like this:
        //     if(input.contains(null))

        List<Run<T>> result = new ArrayList<>();
        
        // TODO: implement this method

        return result;
    }

    public static <T> List<T> decode(List<Run<T>> runs) {
        List<T> result = new ArrayList<>();

        // TODO: implement this method

        return result;
    }

    public static Integer sum(List<Run<Integer>> runs) {
        // TODO: implement this method (you may peek)

        return 0;
    }
}
