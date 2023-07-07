package countingelements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MissingIntegerTest {

    private final MissingInteger sut = new MissingInteger();

    @Test
    void solution() {
        assertEquals(4, sut.solution( new int[]{1, 2, 3}));
        assertEquals(5, sut.solution(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(4, sut.solution(new int[]{1, 2, 3}));
        assertEquals(1, sut.solution(new int[]{-1, -3}));
        assertEquals(1, sut.solution(new int[]{3}));
        assertEquals(1, sut.solution(new int[]{3, 5}));
        assertEquals(1, sut.solution(new int[]{-3}));
    }
}
