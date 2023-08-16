package basicFoundation;

public class ReverseString {


    public static void reverseNumber(int num){

        int i = 0;
        while ( num != 0){
         i = i * 10;
         i = i + num % 10; // take the last digit from num
         num = num / 10;
        }
        System.out.println(i);
    }


    public static void sumOfEven(int i1, int i2){
        int sum = 0;

        while (i1 <= i2){
            if(i1 % 2 == 0){
                sum = sum+i1;
            }
            i1++;
        }
        System.out.println(sum);

//        if(i1 < i2){
//            for (int i = i1; i <= i2; i++) {
//               if(i % 2 == 0) {
//                  sum = sum + i;
//                }
//            }
//            System.out.println("its "+sum);
//        }

    }
    public static void main(String[] args) {

//        sumOfEven(2,12);
        reverseNumber(123);

//        String str = "Hello World";
//        String newone ="";
//        for (int i = str.length()-1; i >= 0; i--) {
//            newone += str.charAt(i);
//        }
//        System.out.println(newone);
    }
}
