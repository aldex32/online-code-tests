package sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * Compute number of distinct values in an array.
 * <a href="https://app.codility.com/programmers/lessons/6-sorting/distinct/">Link</a>
 */
public class Distinct {

    public int solution(int[] arrayOfNumbers) {
        Set<Integer> distinctNumbers = new HashSet<>();

        for (int number : arrayOfNumbers) {
            distinctNumbers.add(number);
        }

        return distinctNumbers.size();
    }
}
