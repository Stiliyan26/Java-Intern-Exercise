package arr;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] newArr = new int[5];
//
//        for (int i = 0; i < newArr.length; i++){
//            newArr[i] = i;
//            System.out.print(newArr[i] + " ");
//        }
//
//        System.out.println();
//        for (int element : newArr){
//            System.out.print(element + "el ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(newArr));

        int[] firstArr = getRandomArray(10);
        System.out.println(Arrays.toString(firstArr));
        Arrays.sort(firstArr);
        System.out.println(Arrays.toString(firstArr));
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++){
            arr[i] = random.nextInt(100);
        }

        return  arr;
    }
}
