package arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {

    private final OddOccurrencesInArray sut = new OddOccurrencesInArray();

    @Test
    void solution() {
        assertEquals(7, sut.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        assertEquals(1, sut.solution(new int[]{1}));
        assertEquals(1, sut.solution(new int[]{1, 1, 1}));
    }
}
