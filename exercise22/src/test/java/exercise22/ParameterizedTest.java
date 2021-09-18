package exercise22;

import java.util.Arrays;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

public @interface ParameterizedTest {
    @ParameterizedTest(getLargestNumber = null)
    @ValueSource(numbers = {{1,2,3},{22,61,25},{24,24,56}})
    void getLargestNumber(int[] numbers) {
        OptionalInt max = Arrays.stream(numbers).max();
        assertEquals(max, Solution22.getLargestNumber(numbers));
    }
}
