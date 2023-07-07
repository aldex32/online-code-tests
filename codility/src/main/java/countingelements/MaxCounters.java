package countingelements;

/**
 * Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all
 * counters to current maximum.
 * <a href="https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/">Link</a>
 */
public class MaxCounters {

    public int[] solution(int counter, int[] operations) {

        int[] counters = new int[counter];
        int maxValue = 0;
        int minValue = 0;

        for (int operation : operations) {
            if (operation == counter + 1) {
                minValue = maxValue;
            } else {
                operation--;
                counters[operation] = Math.max(counters[operation] + 1, minValue + 1);
                maxValue = Math.max(maxValue, counters[operation]);
            }
        }

        for (int i = 0; i < counter; i++) {
            counters[i] = Math.max(minValue, counters[i]);
        }

        return counters;
    }

}
