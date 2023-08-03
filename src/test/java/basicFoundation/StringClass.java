package basicFoundation;

public class StringClass {

    public static void nameSeparation(String str){
        int space;
        space = str.indexOf(" ");

        System.out.println("First: "+ str.substring(0,space)) ;
        System.out.println("Last: " + str.substring(space+1));
        System.out.println("Initials: " +str.substring(0,1) + "."+str.substring(space+1, space+2)+".");

    }


    public static String extractTwoCharThreeTimes(String str) {
        return  str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
    }

    public static String swapTwoLastChars(String str) {

        if(str.length() < 2){
            return str;
        }else {
//            String lastTwo = str.substring(str.length()-2);
//            String lastLetter = str.substring(str.length()-1);
//            String secondfromTheend = str.substring(str.length()-2, str.length()-1);
//            String firstPart = str.substring(0,str.length()-2);
          //  return  firstPart + lastLetter + secondfromTheend;
            return  str.substring(0,str.length()-2) + str.charAt(str.length()-1)+str.charAt(str.length()-2);
        }

    }


    public static String amendTwoEqualStrings(String str, String str2) {
        if(str.length() < str2.length()){
            return str+str2.substring(str2.length()-2);
        }else if(str.length() > str2.length()) {
            return  str.substring(str.length()-str2.length()) + str2;
        }else
        return str+str2;
    }


    public static void returnTwoCharFront(String str){
        String st = str.substring(str.length()-2);
        String st2 = str.substring(0,str.length()-2);
        System.out.println("str length: "+str.length()+" "+st+st2) ;
    }

    public static void main(String[] args) {
       // returnTwoCharFront("roberto");

        System.out.println(swapTwoLastChars("Co"));
        System.out.println(amendTwoEqualStrings("Hello", "uber"));

//        String str = "hello";
//        str.length();
//        String a = String.valueOf('a');
//        System.out.println(a);
//        System.out.println(str.length());
//        str.toLowerCase();
//        str.toUpperCase();

//        nameSeparation("Martin Ludvig");
//
//        String neww=extractTwoCharThreeTimes("helolo");
//        System.out.println(neww);



    }
}
