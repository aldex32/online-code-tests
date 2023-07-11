package prefixsum;

import java.util.HashSet;
import java.util.Set;

/**
 * Count the number of passing cars on the road.
 * <a href="https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/">Link</a>
 */
public class PassingCars {

    public int solution(int[] carsOnRoad) {
        Set<Integer> carsToWest = new HashSet<>();

        for (int i = 0; i < carsOnRoad.length; i++) {
            if (carsOnRoad[i] == 1) {
                carsToWest.add(i);
            }
        }

        int countPassing = 0;

        for (int i = 0; i < carsOnRoad.length; i++) {
            if (carsOnRoad[i] == 0) {
                countPassing += carsToWest.size();
            }
            if (countPassing > 1_000_000_000) {
                return -1;
            }
            carsToWest.remove(i);
        }

        return countPassing;
    }

}
