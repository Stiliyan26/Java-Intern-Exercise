package arr;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        int[] reverseArray = reverseArray(array);
        System.out.println(Arrays.toString(reverseArray));

        boolean sameRef = array == reverseArray;
        System.out.println("Ref is " + sameRef);
    }

    private static int[] reverseArray(int[] array){
        int[] reversedArr = Arrays.copyOf(array, array.length);

        for (int i = array.length - 1; i >= 0; i--){
            reversedArr[array.length - 1 - i] = array[i];
        }

        return reversedArr;
    }
}
