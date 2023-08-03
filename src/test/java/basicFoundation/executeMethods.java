package basicFoundation;


public class executeMethods {
    public static void main(String[] args) {


        // generate 97 -123
        int i5 = 1 + (int)(Math.random()*7);
        int ch1 = 97 + (char)((Math.random()*26)); // small
        int ch2 = 65 + (char)((Math.random()*26)); // small
        System.out.println(i5);
        System.out.println((char)ch1);
        System.out.println((char)ch2);
        utility.getRandomSSN();
        utility.throwDice();
        utility.getRandomPassword();
        utility.checkEvenOrOdd(4);
    }
}
