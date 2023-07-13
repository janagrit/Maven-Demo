package basicVariablesDeclaration;
import java.util.*;
public class declareOperatorVariables {
    public static void main(String[] args) {

        double miles = new Scanner(System.in).nextDouble();
        final double kil_per_mile = 1.609;
        double kilometers = miles * kil_per_mile;
        System.out.println("kilometers "+ kilometers);




    }
}
