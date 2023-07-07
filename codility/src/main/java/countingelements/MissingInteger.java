package countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the smallest positive integer that does not occur in a given sequence.
 * <a href="https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/">Link</a>
 */
public class MissingInteger {

    public int solution(int[] arrayOfNumbers) {
        Set<Integer> positiveIntegers = new HashSet<>();

        for (int i = 1; i <= arrayOfNumbers.length + 1; i++) {
            positiveIntegers.add(i);
        }

        for (int number : arrayOfNumbers) {
            positiveIntegers.remove(number);
        }

        return positiveIntegers.iterator().next();
    }
}
