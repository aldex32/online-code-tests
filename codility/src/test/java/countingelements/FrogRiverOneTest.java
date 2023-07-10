package countingelements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogRiverOneTest {

    private final FrogRiverOne sut = new FrogRiverOne();

    @Test
    void solution() {
        assertEquals(6, sut.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        assertEquals(-1, sut.solution(5, new int[]{1, 3, 1, 4, 2, 3}));
    }
}
