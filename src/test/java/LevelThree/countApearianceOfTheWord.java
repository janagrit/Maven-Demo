package LevelThree;

public class countApearianceOfTheWord {
    public static void main(String[] args) {


        countWord("h", "hi my dear, hello, hi too for you Hi HI ");

    }

    private static void countWord(String str, String s) {
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.substring(i, i+str.length()).equalsIgnoreCase(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
