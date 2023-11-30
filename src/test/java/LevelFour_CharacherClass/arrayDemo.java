package LevelFour_CharacherClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayDemo {

    public static void main(String[] args) {
        String str = "h8fks4hnfl3ejsv1'!";
        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                // sum = sum + Character.getNumericValue(str.charAt(i));
               // sum = sum + Integer.parseInt("" + str.charAt(i));
                sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("+Sum is " + sum);

        System.out.println();

        char ch = 11;
        System.out.println(Character.isDigit(ch) + " " + ch);



        // ARRAY DECLARATION basic syntax
        int [] num = new int[6];

        for (int i = 0; i < num.length; i++) {
            num[i]=i;
        }
        System.out.println(num);
        System.out.println(Arrays.toString(num));

        char [] chararr = new char[6];
        System.out.println(Arrays.toString(chararr));

        boolean [] chararr2 = new boolean[6];
        System.out.println(Arrays.toString(chararr2));

        String [] chararr3 = new String[6];
        System.out.println(Arrays.toString(chararr3));

        double [] chararr4 = new double[6];
        System.out.println(Arrays.toString(chararr4));


        // Array initialize
        char [] letters = {'j', 'l', 'l','p'};
        letters[1]='x';
        System.out.println(Arrays.toString(letters));

        // split method !!!
        String str2 = "Reaffirm and strengthen the contribution of space activities and space tools for the achievement of the Sustainable Development Goals;";
        String [] words = str2.split("t");
        System.out.println(Arrays.toString(words));





    }
}
