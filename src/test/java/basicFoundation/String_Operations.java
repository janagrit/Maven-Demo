package basicFoundation;
public class String_Operations {

    public static String week(String weekday) {

        switch (weekday) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thurthday":
                return "Working Hard!!!";

            case "Friday":
                return ("Friday is coming!");

            case "Saturday":
            case "Sunday":
                return ("Its party time bro!");


            default: return ("wrong input");

        }

    }

    public static void main(String[] args) {

       // System.out.println(week("riday"));
//        String answer = new Scanner(System.in).next();
//
//        switch (answer.toUpperCase()){
//            case "a":
//            case "b":
//            case "c":
//        }
        String str1="hello sweetie, lets go out and have some fun";
        String str2 = "Hi";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.contains("g"));

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(str1.length()-7));
        System.out.println(str1.substring(0, 5));
        System.out.println("str1.substring(str1.indexOf(\"lets\"): "+str1.substring(str1.indexOf("lets"), str1.indexOf("some")+4 ));
        System.out.println("str1.indexOf(\"lets\"): "+str1.indexOf("lets"));
        System.out.println(str1.substring(str1.indexOf("h", 1)));
        System.out.println(str1.indexOf('h', 1));
        String cash = "$10,45";
        String cash2 = cash.replace("$", "");
        System.out.println(cash2);
    }

}
