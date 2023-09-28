package LevelThree;

public class nestedLoop_Odometer {


    public static void main(String[] args) throws InterruptedException {

//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println("INNER LOOP: " + j);
//            }
//            System.out.println("---------- "+i +" --------" );
//        }

        odometer();

    }

    private static void odometer() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        System.out.print( "" + i+j+k+l + "\r");
                        Thread.sleep(100);
                    }
                }
            }
        }
    }
}
