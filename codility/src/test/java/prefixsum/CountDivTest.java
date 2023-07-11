package prefixsum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountDivTest {

    private final CountDiv sut = new CountDiv();

    @Test
    void solution() {
        assertEquals(3, sut.solution(6, 11, 2));
        assertEquals(2, sut.solution(7, 11, 2));
        assertEquals(1, sut.solution(0, 1, 11));
        assertEquals(1, sut.solution(0, 0, 11));
        assertEquals(1, sut.solution(10, 10, 5));
        assertEquals(0, sut.solution(10, 10, 7));
        assertEquals(0, sut.solution(10, 10, 20));
        assertEquals(12300, sut.solution(101, 123_000_000, 10_000));
    }
}
