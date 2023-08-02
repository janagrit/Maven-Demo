package passwordGeneration;

public class LazyOperator {



    public static void divisibleBy(int num){
        if( (num % 2 == 0) || (num % 3 == 0) ){
            System.out.println("The number " + num + " is divisible by 2 or 3");
        }

        if( (num % 2 == 0) ^ (num % 3 == 0) ){
            System.out.println("The number " + num + " is divisible by 2 or 3, but not both");
        }

        if( (num % 2 == 0) && (num % 3 == 0) ){
            System.out.println("The number " + num + " is divisible by 2 and 3");
        }

        if( ! ((num % 2 == 0) && (num % 3 == 0)) ){
            System.out.println("The number " + num + " is not divisible by 2 and not by 3");
        }

    }


    public static boolean lookGood(int age, double income, int look){
        return ( (age > 18 && age <= 40) || income >= 200000 && look >= 5);
    }


    public static boolean leapYear(int year){
        // divisible by 4 but not by 100 or its divisible by 400
        return ( ((year % 4 == 0) && !(year % 100==0)) || (year%400==00) );
    }

    public static void main(String[] args) {

        int num1  = 10;
      //  System.out.println(true || ++num1>10);
        System.out.println(false || ++num1>10);
        System.out.println(num1);

        int num2  = 10;
        //  System.out.println(true || ++num1>10);
        System.out.println(true && ++num2 > 10);
        System.out.println(num2);

        System.out.println("========== && ==========" + "\n");
        if ((true==true) && (true==true)){System.out.println("true && true");}
        if ((true==false) && (true==true)){System.out.println("false && true");}
        if ((true==false) && (true==false)){System.out.println("false && false");}
        if ((true==true) && (true==false)){System.out.println("true && false");}

        System.out.println("========== || ==========" + "\n");
        if ((true==true) || (true==true)){System.out.println("true || true");}
        if ((true==false) || (true==true)){System.out.println("false || true");}
        if ((true==false) || (true==false)){System.out.println("false || false");}
        if ((true==true) || (true==false)){System.out.println("true || false");}


        System.out.println("====== & ==========" + "\n");
        if ((true==true) & (true==true)){System.out.println("true & true");}
        if ((true==false) & (true==true)){System.out.println("true & true");}
        if ((true==false) & (true==false)){System.out.println("false & false");}
        if ((true==true) & (true==false)){System.out.println("false & false");}

        System.out.println("========== | ==========" + "\n");
        if ((true==true) | (true==true)){System.out.println("true | true");}
        if ((true==false) | (true==true)){System.out.println("false | true");}
        if ((true==false) | (true==false)){System.out.println("false | false");}
        if ((true==true) | (true==false)){System.out.println("true | false");}

        divisibleBy(7);

        boolean b = lookGood(22, 30000, 5);
        System.out.println(b);

        boolean b1 = leapYear(4000);
        System.out.println(leapYear(2000));

    }
}
