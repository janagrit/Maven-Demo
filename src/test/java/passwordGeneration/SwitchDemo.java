package passwordGeneration;

import java.util.Scanner;

public class SwitchDemo {


    public static void main(String[] args) {


        System.out.println(("Enter num 1 - 4"));
        int number = new Scanner(System.in).nextInt();
        switch (number) {
            case 1:
                System.out.println("AMEX: 1");
                System.out.println(Math.random() * 10000000000000000L);
                break;
            case 2:
                System.out.println("CapitalOne: 2");
                System.out.println(Math.random() * 10000000000000000L);
                break;
            case 3:
                System.out.println("ChinaBank: 3");
                System.out.println(Math.random() * 10000000000000000L);
                break;
            case 4:
                System.out.println("Merchant: 4");
                System.out.println(Math.random() * 10000000000000000L);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
