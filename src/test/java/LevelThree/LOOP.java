package LevelThree;

public class LOOP {
    public static void main(String[] args) {
      multiplicationTable();

    }

    private static void multiplicationTable() {
        
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= 9; j++) {

                System.out.print(j*i + "\t ");
            }
        }
    }
}
