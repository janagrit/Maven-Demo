package LevelThree;

public class forLoopRectangle {


    static void print_alf() {

        char letter;
        char letter2;
        for (int i = 97; i <= 122; i++) {
            letter=(char)i;
         for (int j = i; j <= 122; j++) {
              letter2=(char)j;
             System.out.println(letter + " "+letter2);
            }
            System.out.println("----------------------------");

        }



    }


    // Function to print hollow rectangle
    static void print_rectangle(int rows, int colomns) {
        int i, j;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= colomns; j++) {
                if (i == 1 || i == rows || j == 1 || j == colomns)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

      //  print_rectangle(4,8);

        print_alf();

    }
}
