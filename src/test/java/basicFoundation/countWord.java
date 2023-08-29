package basicFoundation;

public class countWord {


    public static void countHi(String str){
        String str1 = str.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
           if(str1.charAt(i)=='h' && str1.charAt(i+1)=='i')
               count++;
        }
        System.out.println("Hi is presented "+ count +" times");
    }


    public static void countWords(String str, String word){
        int count=0;
        for (int i = 0; i <= str.length()-word.length(); i++) {
            System.out.println(str.substring(i, i+word.length()));
            if(str.substring(i, i + word.length() ).equalsIgnoreCase(word))
                count++;

        }
        System.out.println(word + " is presented "+ count +" times");
    }

    public static void main(String[] args) {
     // countHi("hi mm kd ho hi Hi jh ih HI");
      countWords("hello ghghg hello", "hello");
    }
}
