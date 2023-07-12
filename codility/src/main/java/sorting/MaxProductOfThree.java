package sorting;

import java.util.Arrays;

/**
 * Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
 * <a href="https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/">Link</a>
 */
public class MaxProductOfThree {

    public int solution(int[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);
        int arrayLength = arrayOfNumbers.length;

        int productOfBiggestNumbers =
                arrayOfNumbers[arrayLength - 3] * arrayOfNumbers[arrayLength - 2] * arrayOfNumbers[arrayLength - 1];
        int productWithProbablyTwoNegativeNumbers =
                arrayOfNumbers[0] * arrayOfNumbers[1] * arrayOfNumbers[arrayLength - 1];

        return Math.max(productOfBiggestNumbers, productWithProbablyTwoNegativeNumbers);
    }

}
