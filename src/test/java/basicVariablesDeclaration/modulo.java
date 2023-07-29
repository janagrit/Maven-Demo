package basicVariablesDeclaration;

public class modulo {
    public static void main(String[] args) {
        // modulo
//        System.out.println(10 % 3);
//        System.out.println(153 % 10);

        // TASK diff between multiplication and sum
        int num = 9876;

        int num4 = num % 10;
        int rem = num/10; //987

        int num3 = rem % 10;
        int rem2 =  rem/10; // 98

        int num2 = rem2 % 10;

        int num1 = rem2 / 10;

        System.out.println((num1*num2*num3*num4) -(num1+num2+num3+num4) );

        System.out.println(4 - 4 + 5 + 2 / 2 * 5 % 2);

        // INCREMENT
        int n1 = 34;
       // int n2 = ++n1;
        System.out.println(n1 );
      //  System.out.println(n2);
    }
}
