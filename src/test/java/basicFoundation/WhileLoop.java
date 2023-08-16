package basicFoundation;

import java.util.Scanner;



public class WhileLoop {
    public static void printMsgTimes(String str, int x){

        while (0 < x){
            System.out.println(str);
            x--;
        }
    }


    public static void sumNumber( int x){
        int sum =0;
        int i = 1;
        while (i <= x){
            sum =i+sum ;
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        printMsgTimes("hi", 2);
        sumNumber(100);
//        System.out.println("Yes or NO?");
//        String answer = new Scanner(System.in).nextLine();
//
//        while (!answer.equals("yes") && !answer.equals("no") ){
//            System.out.println("wrong input, try again");
//            answer = new Scanner(System.in).next();
//        }
//        System.out.println("Thank you, your answer is accepted now.");
    }
}
