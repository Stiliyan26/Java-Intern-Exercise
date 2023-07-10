package arr;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] intArr = GenerateRandomArr(6);
        System.out.println(Arrays.toString(intArr));

        int[] sortedArr = sortIntegers(intArr);
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] sortIntegers(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        int temp;
        boolean flag = true;

        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return  sortedArray;
    }

    private static int[] GenerateRandomArr(int len){
        Random rnd = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++){
            arr[i] = rnd.nextInt(100);
        }

        return arr;
    }
}
