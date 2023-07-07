package iterations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinaryGapTest {

    private final BinaryGap sut = new BinaryGap();

    @Test
    void solution() {
        assertEquals(2, sut.solution(9));
        assertEquals(4, sut.solution(529));
        assertEquals(1, sut.solution(20));
        assertEquals(0, sut.solution(15));
        assertEquals(0, sut.solution(30));
    }
}
