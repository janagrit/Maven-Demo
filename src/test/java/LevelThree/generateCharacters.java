package LevelThree;

import java.util.Random;

public class generateCharacters {
    public static void main(String[] args) {
        generateChar(8);
        generatePass(8);
        generateCapChar(8);
    }

    private static void generateCapChar(int i) {
        for (int j = 0; j < i; j++) {
            char ch = (char) (65 + Math.random()*26);
            System.out.print(ch);
        }
        System.out.println();
    }

    private static void generatePass(int i) {

    }

    private static void generateChar(int i) {
        for (int j = 0; j < i; j++) {
            char ch = (char) (97 + Math.random()*26);
            System.out.print(ch);
        }
        System.out.println();
    }
}
