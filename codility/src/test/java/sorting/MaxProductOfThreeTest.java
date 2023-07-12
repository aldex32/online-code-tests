package sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxProductOfThreeTest {

    private final MaxProductOfThree sut = new MaxProductOfThree();

    @Test
    void solution() {
        assertEquals(60, sut.solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }
}
