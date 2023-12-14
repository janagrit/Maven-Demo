package FiveArrays;

import java.util.Arrays;

public class swapArraysValue {
    public static void main(String[] args) {

//        double [] arr = {2.2, 4.3, 6.3, 4.3, 1.5};
//        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
//            double temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        String[] stre = {"hi", "new year", "koko", "po"};
        System.out.println(stre[1]);


//        System.out.println(reverse("hi"));
        String a [] ={"dudu", "jack"};
        String b [] ={"mimi", "nancy"};
        System.out.println( Arrays.toString(combineNames( a, b )) );

    }

    public static String reverse(String str){
        char [] ch = str.toCharArray();
        for (int i = 0, j = ch.length-1; i < j ; i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }

    public static String [] combineNames(String [] first,  String [] second){
        for (int i = 0; i < first.length; i++) {
            first[i] = first[i] + " " + second[i];
        } return first;
    }
}
