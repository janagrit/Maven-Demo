package passwordGeneration;

public class LazyOperator {
    public static void main(String[] args) {

        // &&

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

    }
}
