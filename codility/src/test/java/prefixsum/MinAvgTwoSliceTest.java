package prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinAvgTwoSliceTest {

    private final MinAvgTwoSlice sut = new MinAvgTwoSlice();

    @Test
    void solution() {
        assertEquals(1, sut.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
}
