package timecomplexity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FrogJumpTest {

    private final FrogJump sut = new FrogJump();

    @Test
    void solution() {
        assertEquals(3, sut.solution(10, 85, 30));
        assertEquals(0, sut.solution(1, 1, 1));
    }
}
