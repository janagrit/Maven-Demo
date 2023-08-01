package passwordGeneration;

import java.util.Scanner;

public class multiReturnMethod {

    public static String sell(int num){
        String st = "Wrong Card";
        if(num==1){
         st="Amex";
        } else if (num==2) {
            st="MC";
        } else if (num==3) {
            st="Discovery";
        }
        return st;
    }


    public static String whatCanYouDo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();

        String answer="dunno";
        if(age <= 10){
            answer="Baby, too small to drive";
          //  System.out.println("Baby, too small to drive");
        } else if (age <= 20) {
            answer="Ok, you can learn how to drive.";
        } else if (age <= 30) {
            answer="You are mature and you can drive.";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(sell(4));

        System.out.println(whatCanYouDo());
    }


}
