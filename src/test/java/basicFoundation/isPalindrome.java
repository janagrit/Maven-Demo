package basicFoundation;

public class isPalindrome {

    public static boolean isPalindrome(String str){
        // civic
        str = str.toLowerCase();
        for (int i = 0, j = str.length()-1; i < j; i++, j--) {
            if(str.charAt(i) !=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome("civic"));
    }
}
