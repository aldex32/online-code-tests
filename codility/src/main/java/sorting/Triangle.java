package sorting;

import java.util.Arrays;

/**
 * Determine whether a triangle can be built from a given set of edges.
 * <a href="https://app.codility.com/programmers/lessons/6-sorting/triangle/">Link</a>
 */
public class Triangle {

    public int solution(int[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);

        for (int i = 0; i < arrayOfNumbers.length - 2; i++) {
            if ((long) arrayOfNumbers[i] + arrayOfNumbers[i + 1] > arrayOfNumbers[i + 2]) {
                return 1;
            }
        }

        return 0;
    }

}
