package iterations;

/**
 * Find the longest sequence of zeros in binary representation of an integer.
 * <a href="https://app.codility.com/programmers/lessons/1-iterations/binary_gap/">Link</a>
 */
public class BinaryGap {

    public int solution(int n) {
        final var binaryString = Integer.toBinaryString(n);

        int maxSequence = 0;
        int count = 0;
        boolean startCount = false;

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                if (startCount) {
                    maxSequence = Math.max(maxSequence, count);
                    count = 0;
                    continue;
                }
                startCount = true;
            } else {
                count += 1;
            }
        }

        return maxSequence;
    }

}
