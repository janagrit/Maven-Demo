package FiveArrays;

import java.util.Arrays;

public class ShiftingArrayElements {

    public static void main(String[] args) {

        int [] arr = { 1, 2, 3, 4 , 5};

        // shift to the left:
//        int temp = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            arr[i-1] = arr[i];
//        }
//            arr[arr.length-1] = temp;

        // shift to the right: // { 1, 2, 3, 4 , 5};  ->>   { 5, 1, 2, 3 , 4}; -->>>
        int temp = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));


    }
}
