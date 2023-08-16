package basicFoundation;

public class NullPoiterExeption_1 {

    public static void printMsgUppercase(String str, int times){
        if(str==null || str.isEmpty()){
            System.err.println("Cannot pass");
//            System.exit(1);
            return;
        }

        while(times > 0){
            System.out.println(str.toUpperCase());
            times--;
        }
    }

    public static void main(String[] args) {
        printMsgUppercase("", 5);
    }
}
