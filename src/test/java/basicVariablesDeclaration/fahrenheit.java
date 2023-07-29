package basicVariablesDeclaration;

import java.util.Scanner;

public class fahrenheit {

    public static void main(String[] args) {


         //formula celsius = (5/9) * (fahrenheit-32)
        double fahrenheit = new Scanner(System.in).nextDouble();
        double celsius = (5d/9) * (fahrenheit-32);

        System.out.println("fahrenheit: "+fahrenheit+" is celsius : " +celsius);


    }
}
