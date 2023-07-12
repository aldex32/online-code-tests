package sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DistinctTest {

    private final Distinct sut = new Distinct();

    @Test
    void solution() {
        assertEquals(3, sut.solution(new int[]{2, 1, 1, 2, 3, 1}));
    }
}
