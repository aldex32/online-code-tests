package countingelements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermCheckTest {

    private final PermCheck sut = new PermCheck();

    @Test
    void solution() {
        assertEquals(1, sut.solution(new int[]{4, 1, 3, 2}));
        assertEquals(0, sut.solution(new int[]{4, 1, 3}));
    }
}
