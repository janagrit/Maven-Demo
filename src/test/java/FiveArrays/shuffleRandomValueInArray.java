package FiveArrays;

import java.util.Arrays;

public class shuffleRandomValueInArray {
    public static void main(String[] args) {

        int [] nums = { 7, 8, 9, 4, 1 };

        System.out.println(Arrays.toString(shuffleRandomArray(nums)) );


    }

    public static int [] shuffleRandomArray(int [] first){
        for (int i = first.length-1; i > 0; i--) {

          int j = (int) (Math.random() * (i+1));
          int temp = first[i];
          first[i] = first[j];
          first[j] = temp;
        }
        return first;
    }
}
