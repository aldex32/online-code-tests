package prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PassingCarsTest {

    private final PassingCars sut = new PassingCars();

    @Test
    void solution() {
        assertEquals(5, sut.solution(new int[]{0, 1, 0, 1, 1}));
    }
}
