package prefixsum;

/**
 * Find the minimal average of any slice containing at least two elements.
 * <a href="https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/">Link</a>
 */
public class MinAvgTwoSlice {

    /**
     * The strategy to solve this problem is considering the slices of 2 and 3 items, the bigger slices can be composed
     * by these smaller slices.
     */
    public int solution(int[] arrayOfNumbers) {
        double averageSlice2 = Double.MAX_VALUE;
        double averageSlice3 = Double.MAX_VALUE;
        int smallerIndexSlice2 = -1;
        int smallerIndexSlice3 = -1;

        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            // Average for slices of two elements
            double avg2 = (double) (arrayOfNumbers[i] + arrayOfNumbers[i + 1]) / 2;
            if (avg2 < averageSlice2) {
                averageSlice2 = avg2;
                smallerIndexSlice2 = i;
            }

            if (i < arrayOfNumbers.length - 2) {
                // Average for slices of three elements
                double avg3 = (double) (arrayOfNumbers[i] + arrayOfNumbers[i + 1] + arrayOfNumbers[i + 2]) / 3;
                if (avg3 < averageSlice3) {
                    averageSlice3 = avg3;
                    smallerIndexSlice3 = i;
                }
            }
        }

        if (averageSlice2 < averageSlice3) {
            return smallerIndexSlice2;
        } else if (averageSlice2 > averageSlice3) {
            return smallerIndexSlice3;
        } else {
            return Math.min(smallerIndexSlice2, smallerIndexSlice3);
        }
    }

}
