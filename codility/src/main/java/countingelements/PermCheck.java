package countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Check whether array A is a permutation.
 * <a href="https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/">Link</a>
 */
public class PermCheck {

    public int solution(int[] arrayOfNumbers) {

        Set<Integer> permutation = new HashSet<>();

        for (int i = 1; i <= arrayOfNumbers.length; i++) {
            permutation.add(i);
        }

        for (int number : arrayOfNumbers) {
            permutation.remove(number);

            if (permutation.isEmpty()) {
                return 1;
            }
        }

        return 0;
    }
}
