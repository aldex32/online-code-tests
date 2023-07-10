package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Find value that occurs in odd number of elements.
 * <a href="https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/">Link</a>
 */
public class OddOccurrencesInArray {

    public int solution(int[] arrayOfNumbers) {

        Set<Integer> numbers = new HashSet<>();

        for (int number : arrayOfNumbers) {
            if (numbers.contains(number)) {
                numbers.remove(number);
            } else {
                numbers.add(number);
            }

        }

        return numbers.iterator().next();
    }
}
