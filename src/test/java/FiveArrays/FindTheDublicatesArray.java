package FiveArrays;

import java.util.Arrays;

public class FindTheDublicatesArray {

    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 4 , 5, 2, 5};
        
        // find the duplicates:
        System.out.println((find_duplicate(arr)));

    }

    public static int find_duplicate(int [] arr){



        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]==arr[j]){

                    return arr[i];

                }
            }
        }
        return -1;
    }
}
