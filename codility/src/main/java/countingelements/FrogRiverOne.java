package countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the earliest time when a frog can jump to the other side of a river.
 * <a href="https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/">Link</a>
 */
public class FrogRiverOne {

    public int solution(int endPosition, int[] leaves) {

        Set<Integer> route = new HashSet<>();

        for (int i = 1; i <= endPosition; i++) {
            route.add(i);
        }

        for (int i = 0; i < leaves.length; i++) {
            route.remove(leaves[i]);

            if (route.isEmpty()) {
                return i;
            }
        }

        return -1;
    }

}
