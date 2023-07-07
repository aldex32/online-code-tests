package arrays;

/**
 * Rotate an array to the right by a given number of steps.
 * <a href="https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/">Link</a>
 */
public class CyclicRotation {

    public int[] solution(int[] arrayOfNumbers, int rightShift) {

        if (arrayOfNumbers.length == 0 || arrayOfNumbers.length == 1 || arrayOfNumbers.length == rightShift) {
            return arrayOfNumbers;
        }

        int[] rotatedArray = new int[arrayOfNumbers.length];
        int smarterRightShift = rightShift > arrayOfNumbers.length ? rightShift % arrayOfNumbers.length : rightShift;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int index;
            if (i + smarterRightShift <= arrayOfNumbers.length - 1) {
                index = i + smarterRightShift;
            } else {
                index = i + smarterRightShift - arrayOfNumbers.length;
            }
            rotatedArray[index] = arrayOfNumbers[i];
        }

        return rotatedArray;
    }

}
