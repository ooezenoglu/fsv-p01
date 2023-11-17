package project01;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import net.jqwik.api.Property;

public class HistogramTests {
    // Note: this method can be used to run the unit test without a test framework (e.g. to debug)
    public static void main(String[] args) {
        HistogramTests h = new HistogramTests();
        h.example();
    }

    @Test
    void example() {
        Histogram histogram = new Histogram(2, 3, 0, 5, 5, 6, -2, 9, 0, 3, 5);
        Assertions.assertEquals(-2, histogram.min());
        Assertions.assertEquals(9, histogram.max());

        // TODO: add some more checks here
        Assertions.assertEquals(2, histogram.count(0));
        Assertions.assertEquals(0, histogram.count(1));
        Assertions.assertEquals(1, histogram.count(2));
        // TODO: add some more checks here
    }

    int countOccurrences(int value, List<Integer> data) {
        return (int) data.stream().filter(i -> i == value).count();
    }

    @Property // TODO: specify jqwik annotations for the parameters, note we have conveniently marked with ??? where to insert code
    void histogramDoesNotCrash(/* ??? */ List</* ??? */ Integer> data) {
        new Histogram(data);
    }

    @Property // TODO: specify jqwik annotations for the parameters
    void histogramCount(List<Integer> data, int value) {
        // TODO: check method count of class Histogram against reference implementation countOccurrences
    }

    @Property // TODO: specify jqwik annotations for the parameters
    void histogramRange(List<Integer> data, int value) {
        // TODO: check that if countOccurrences(value) > 0 then
        //       value is between min and max of the corresponding histogram
    }
}
