package basicFoundation;

import java.util.Scanner;

public class ATM_DoWhile {
    public static void main(String[] args) {

        System.out.println("Welcome to DMV. Enter pin: ");
        int input = new Scanner(System.in).nextInt();
        int trytimes = 1;

        while( input != 123){

            if(trytimes==3){
                System.out.println("Incorrect input, you have "+trytimes +" attemps. After we block your card");
                System.exit(1);
            }
            System.out.println("Wrong pin, try again.");
            input = new Scanner(System.in).nextInt();
            trytimes++;
        }
            System.out.println("Correct ");
    }
}
