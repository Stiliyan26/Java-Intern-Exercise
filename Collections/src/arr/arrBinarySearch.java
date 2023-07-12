package arr;

import java.util.Arrays;

public class arrBinarySearch {
    public static void main(String[] args) {
        String[] sArr = {"Kiril", "Mirko", "Stiliyan", "Peter"};
        Arrays.sort(sArr);

        System.out.println(Arrays.toString(sArr));
        if (Arrays.binarySearch(sArr, "Mirko") >= 0){
            System.out.println("Mirko found!");
        }
    }
}
