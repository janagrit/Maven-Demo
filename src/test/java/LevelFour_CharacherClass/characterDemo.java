package LevelFour_CharacherClass;

public class characterDemo {

    public static void charterOnly(String str){

        String strr = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                strr=strr+str.charAt(i);
            }
        }
        System.out.println(strr);
    }

    public static void main(String[] args) {

        charterOnly("HHhgh5jhwke89r40w20w!*");

        // Java has two type of variables: primitives and reference types (Object type, Class type)
        String str ="hgh5h3kc8dkwstggbkmden";

        char cr = 'r';
        Character charr = new Character('i');

        int w = 5;
        Integer y = new Integer(8);

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isLetter('8'));

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                System.out.print(str.charAt(i));
                sum=sum+Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.print(", sum " + sum);
    }
}
