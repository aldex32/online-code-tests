package timecomplexity;

/**
 * Count minimal number of jumps from position X to Y.
 * <a href="https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/">Link</a>
 */
public class FrogJump {

    public int solution(int startPosition, int endPosition, int jumpDistance) {

        return (int) Math.ceil((double) (endPosition - startPosition) / jumpDistance);
    }
}
