package sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleTest {

    private final Triangle sut = new Triangle();

    @Test
    void solution() {
        assertEquals(1, sut.solution(new int[]{10, 2, 5, 1, 8, 20}));
        assertEquals(0, sut.solution(new int[]{10, 50, 5, 1}));
        assertEquals(0, sut.solution(new int[]{0, 50, 5, 1}));
    }
}
