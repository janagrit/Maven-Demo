package basicFoundation;

public class generatePassword {

    public static void generateLowerChars(int num){

        for (int i = 0; i < num; i++) {
            char n = (char) (97+Math.random()*i);

            System.out.print(n);
        }

    }

    public static void generateLowerChars2(int num){
        String abc= "abcdefghigklmnopqrstuwxyz";
        String ch ="";
        for (int i = 0; i < num; i++) {
            int n = (int) (Math.random()*abc.length());
            ch += abc.charAt(n);
            System.out.print(ch);
        }

    }
    public static void main(String[] args) {

        generateLowerChars(8);

    }
}
