package basicFoundation;

public class LoopPrintSongCoke {

    public static void printSong(String str, int times){


        for (int i = times; i > 0; i--) {

            System.out.println (i + " bottle" +( (i==1)?"":"s" ) + " of " + str +" on the wall. " );

        }
    }
    public static void main(String[] args) {

        printSong("vodka", 5);

    }
}
