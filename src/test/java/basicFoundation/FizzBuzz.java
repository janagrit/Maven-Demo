package basicFoundation;



public class FizzBuzz {

    public static void fizzBuzz(int num){
        
        for (int i = 1; i <= num; i++) {
            if( (i % 5 == 0) && (i % 3 == 0)){
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            else System.out.println(""+i);
        }

    }


    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
