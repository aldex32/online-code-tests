package timecomplexity;

/**
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 * <a href="https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/">Link</a>
 */
public class TapeEquilibrium {

    public int solution(int[] arrayOfNumbers) {
        int sumOnRightSide = 0;

        for (int number : arrayOfNumbers) {
            sumOnRightSide += number;
        }

        int sumOnLeftSide = 0;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            sumOnLeftSide += arrayOfNumbers[i];
            sumOnRightSide -= arrayOfNumbers[i];

            minDifference = Math.min(minDifference, Math.abs(sumOnLeftSide - sumOnRightSide));
        }

        return minDifference;
    }

}
