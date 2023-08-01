package passwordGeneration;

public class utility {

    public static void getRandomPassword(){
        char pass ;
        for (int i = 0; i < 6; i++) {
            pass=(char) (65 + (Math.random() * 26) );
            System.out.print(pass);
        }
        System.out.println();
    }



    public static void checkEvenOrOdd(int number){

        if( number%2 == 0 ){
            System.out.println("the number " + number + " is even");
        }else {
            System.out.println("the number " + number + " is odd");
        }

    }

    public static void throwDice(){

        int one = (int) (Math.random()*5) +1 ;
        int two = (int) (Math.random()*5) + 1 ;
        System.out.println("Dice #1: " + one +"\n" +
                "Dice #2: " + two + "\n" +
                "Total: " + (one+two) +"\n");
    }

    public static void generateEmail(){

    }

    public static void getRandomSSN(){

        // 333-33-3334
        int n1 = 100+((int)(Math.random()*899));
        int n2 = 10+((int)(Math.random()*89));
        int n3 = 1000+((int)(Math.random()*8999));
        System.out.println(n1 + "-"+n2+"-"+n3);

    }

    public static void main(String[] args) {

        getRandomSSN();
        throwDice();
        getRandomPassword();
    }
}
