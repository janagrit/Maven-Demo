package passwordGeneration;

public class utility {

    public static void generatePassword(){

    }

    public static void generateChars(){

    }

    public static void throwDice(){

        int one = (1+ (int) (Math.random()+8) );
        int two = (1+ (int) (Math.random()+8) );
        System.out.println("Dice #1: " + one);
        System.out.println("Dice #2: " + two);
        System.out.println("Total: " + (one+two));
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
    }
}
