package arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CyclicRotationTest {

    private final CyclicRotation sut = new CyclicRotation();

    @Test
    void solution() {
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, sut.solution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{2}, sut.solution(new int[]{2}, 3));
        assertArrayEquals(new int[]{0, 0, 0}, sut.solution(new int[]{0, 0, 0}, 1));
        assertArrayEquals(new int[]{2, 1}, sut.solution(new int[]{1, 2}, 1));
    }
}
