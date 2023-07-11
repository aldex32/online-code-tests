package prefixsum;

/**
 * Compute number of integers divisible by k in range [a..b].
 * <a href="https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/">Link</a>
 */
public class CountDiv {

    public int solution(int first, int last, int divisor) {
        int firstRemainder = first % divisor;

        if (firstRemainder == 0) {
            return ((last - first) / divisor) + 1;
        }

        return (last - (first - firstRemainder)) / divisor;
    }

}
