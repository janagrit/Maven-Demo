package basicVariablesDeclaration;

public class timeMillis {
    public static void main(String[] args) {
        long millies = System.currentTimeMillis();
        System.out.println(millies);

        long days = millies / 86400000;
        long years = days / 360;
        long remaining = millies % 86400000;
        long hours = remaining / 360000;
        remaining = remaining % 360000;
        long mints = remaining / 60000;
        remaining %= 60000;
        long seconds = remaining / 1000;
        System.out.println(days + " days");
        System.out.println(years + " years");
        System.out.println(hours + " hours");
        System.out.println(mints + " mints");
        System.out.println(seconds + " seconds");

    }
}
