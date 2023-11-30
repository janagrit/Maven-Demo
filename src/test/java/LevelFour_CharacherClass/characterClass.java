package LevelFour_CharacherClass;

public class characterClass {

//    public static void charterOnly(String str){
//
//        String strr = "";
//        for (int i = 0; i < str.length(); i++) {
//            if(Character.isLetter(str.charAt(i))){
//                strr=strr+str.charAt(i);
//            }
//        }
//        System.out.println(strr);
//    }

    public static void main(String[] args) {

       // charterOnly("HHhgh5jhwke89r40w20w!*");

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
        System.out.println(", sum " + sum);



        // get rid of numbers

        String str3 = "hghgh75osjmfbfg!@#$%,vfkflf!!~";
        String str4 = "";
        int sum2 = 0;
        for (int i = 0; i < str3.length(); i++) {
            if(Character.isDigit(str3.charAt(i))){
                str4 = str4 + String.valueOf(str3.charAt(i));
                sum2+= Character.getNumericValue(str3.charAt(i));
            }

        }
        System.out.println("str4 " + str4);
        System.out.println("SUM IS --->>>> " + sum2);

        int i = Character.getNumericValue('5');
        System.out.println(i);

    }


}
