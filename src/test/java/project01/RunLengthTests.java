package project01;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

public class RunLengthTests {

    // Note: this method can be used to run the unit test without a test framework (e.g. to debug)
    public static void main(String[] args) {
        RunLengthTests r = new RunLengthTests();
        r.example();
    }

    @Test
    void example() {
        List<String> input = List.of("A", "A", "B");
        List<Run<String>> expected = List.of(new Run<>(2, "A"), new Run<>(1, "B"));
        Assertions.assertEquals(expected, RunLength.encode(input));
    }

    @Test
    void testSum() {
        List<Integer> input = List.of(4,3,3);
        List<Run<Integer>> runs = RunLength.encode(input);

        Assertions.assertEquals(10, RunLength.sum(runs));
    }

    public static Integer sum(List<Integer> elems) {
        return elems.stream().reduce(0, Integer::sum);
    }

    @Property
    void canDecode(@ForAll List<String> input) {
        // TODO: check that encoding the input and then decoding the resulting runs
        //       gives back a list that is equal to the original input

        List<String> output = RunLength.decode(RunLength.encode(input));

        for(int i = 0; i < input.size(); i++) {
            Assertions.assertEquals(input.get(i), output.get(i));
        }
    }

    @Property
    void optimizedSum(@ForAll List<Integer> input) {
        // TODO: check that the optimized sum method of RunLength computes on the encoding
        //       the same result as the reference implementation (method sum above) on the given input
        
        List<Run<Integer>> runs = RunLength.encode(input);

        Assertions.assertEquals(sum(input), RunLength.sum(runs));
    }
}
