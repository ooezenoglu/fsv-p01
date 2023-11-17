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

    public static Integer sum(List<Integer> elems) {
        return elems.stream().reduce(0, Integer::sum);
    }

    @Property
    void canDecode(@ForAll List<String> input) {
        // TODO: check that encoding the input and then decoding the resulting runs
        //       gives back a list that is equal to the original input
    }

    @Property
    void optimizedSum(@ForAll List<Integer> input) {
        // TODO: check that the optimized sum method of RunLength computes on the encoding
        //       the same result as the reference implementation (method sum above) on the given input
    }
}
