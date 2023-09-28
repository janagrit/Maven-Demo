package LevelThree;

public class countHI {
    private static void countHi(String str) {
      int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i, i+2).equalsIgnoreCase("hi")){
                count++;
            }
        }
        System.out.println("count is: " + count);
    }

    public static void main(String[] args) {
        countHi("hi HI ai hy jh hi");
    }


}
