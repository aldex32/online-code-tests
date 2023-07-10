package timecomplexity;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the missing element in a given permutation.
 * <a href="https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/">Link</a>
 */
public class PermMissingElem {

    public int solution(int[] arrayOfNumbers) {
        Set<Integer> permutation = new HashSet<>();

        for (int i = 1; i <= arrayOfNumbers.length + 1; i++) {
            permutation.add(i);
        }

        for (int number : arrayOfNumbers) {
            permutation.remove(number);
        }

        return permutation.iterator().next();
    }
}
