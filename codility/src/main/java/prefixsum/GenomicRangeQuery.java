package prefixsum;

/**
 * Find the minimal nucleotide from a range of sequence DNA.
 * <a href="https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/">Link</a>
 */
public class GenomicRangeQuery {

    public int[] solution(String dnaSequence, int[] queryP, int[] queryQ) {
        int[] result = new int[queryP.length];
        int[][] prefixSums = new int[3][dnaSequence.length() + 1];

        // Calculate prefix sums for each nucleotide
        for (int i = 0; i < dnaSequence.length(); i++) {
            int a = 0, c = 0, g = 0;

            if (dnaSequence.charAt(i) == 'A') {
                a = 1;
            } else if (dnaSequence.charAt(i) == 'C') {
                c = 1;
            } else if (dnaSequence.charAt(i) == 'G') {
                g = 1;
            }

            // Update prefix sums
            prefixSums[0][i + 1] = prefixSums[0][i] + a;
            prefixSums[1][i + 1] = prefixSums[1][i] + c;
            prefixSums[2][i + 1] = prefixSums[2][i] + g;
        }

        // Perform queries
        for (int i = 0; i < queryP.length; i++) {
            int startIndex = queryP[i];
            int endIndex = queryQ[i] + 1;

            // The order of the condition is important
            if (prefixSums[0][endIndex] != prefixSums[0][startIndex]) {
                result[i] = 1; // A
            } else if (prefixSums[1][endIndex] != prefixSums[1][startIndex]) {
                result[i] = 2; // C
            } else if (prefixSums[2][endIndex] != prefixSums[2][startIndex]) {
                result[i] = 3; // G
            } else {
                result[i] = 4; // T
            }
        }

        return result;
    }
}
