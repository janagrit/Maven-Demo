package passwordGeneration;

import java.util.Scanner;

public class multiway_If_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        if(num > 100){
            System.out.println("Incorrect input.");
            return;
        }

        if(num >=90){
            System.out.println("Great score");
        } else if (num >=80) {
            System.out.println("The score is not bad");
        } else if (num>=70) {
            System.out.println("The score could be better");
        } else if (num>=60) {
            System.out.println("The score is not good, but you pass it.");
        }else{
            System.out.println("You did not pass");
        }
    }
}
