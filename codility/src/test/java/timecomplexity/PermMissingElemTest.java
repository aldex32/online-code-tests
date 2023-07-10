package timecomplexity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PermMissingElemTest {

    private final PermMissingElem sut = new PermMissingElem();

    @Test
    void solution() {
        assertEquals(4, sut.solution(new int[]{2, 3, 1, 5}));
        assertEquals(1, sut.solution(new int[]{}));
        assertEquals(1, sut.solution(new int[]{2}));
    }
}
