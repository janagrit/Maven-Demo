package basicVariablesDeclaration;

public class VariablesCasting {
    public static void main(String[] args) {


        // IMPLICIT
      //  EXPLICIT

        // byte -> short -> int -> long -> float -> double
        long num1 = 1123232;
        int num2 = (int) num1; 

        //char ch = (char)0XAB0041; // The lower 16 bits hex code 0041
        char ch = (char)65.25; // Decimal 65 is assigned to ch
        System.out.println(ch);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a lowercase letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a numeric character");

        System.out.println("##########################"+ "\n");
        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is " + Character.isLetter('a'));
        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
        System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));
        System.out.println("##########################"+"\b");



        byte b = (byte) '\uFFF4';
        System.out.println(b);

        int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
        System.out.println(i);


        int j = 2 + 'a'; // (int)'a' is 97
        System.out.println("j is " + j); // j is 99
        System.out.println(j + " is the Unicode for character "
                + (char)j); // 99 is the Unicode for character c
        System.out.println("Chapter " + '2');



    }
}
