package prefixsum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class GenomicRangeQueryTest {

    private final GenomicRangeQuery sut = new GenomicRangeQuery();

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 4, 1}, sut.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }
}
