package LevelThree;

public class stringDublicates {

    public static boolean hasDublicate(String str){

        for (int i = 0; i < str.length()-1; i++) {

            for (int j = i+1; j < str.length(); j++) {
                if( str.charAt(i) ==  str.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDublicate("java"));


    }
}
