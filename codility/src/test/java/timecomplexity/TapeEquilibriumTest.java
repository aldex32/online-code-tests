package timecomplexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {

    private final TapeEquilibrium sut = new TapeEquilibrium();

    @Test
    void solution() {
        assertEquals(1, sut.solution(new int[]{3, 1, 2, 4, 3}));
        assertEquals(1, sut.solution(new int[]{5, 6}));
        assertEquals(11, sut.solution(new int[]{-5, 6}));
        assertEquals(0, sut.solution(new int[]{5, 5}));
    }
}
