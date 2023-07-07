package countingelements;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MaxCountersTest {

    private final MaxCounters sut = new MaxCounters();

    @Test
    void solution() {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, sut.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}
