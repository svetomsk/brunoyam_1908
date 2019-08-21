public class ConditionsExample {
    public static void main(String[] args) {
        int value = -2;
        // > < >= <=
        if(value > 10) {
            System.out.println("Right");
        }
        if(value < -10) {
            System.out.println("Left");
        }
        if(value >= -10) {
            if(value <= 10) {
                System.out.println("Center");
            }
        }

        if(value > 10) {
            System.out.println("Right");
        } else if(value < -10) {
            System.out.println("Left");
        } else { // во всех остальных случаях
            System.out.println("Center");
        }

        if(value > 10) {

        } else {

        }

        int a = 19;
        int b = 3;
        int reminer = a % b;
        System.out.println(reminer);
        if(reminer == 1) {
            System.out.println("yes");
        }
        if(reminer != 1) {
            System.out.println("no");
        }
        if(a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        int first = 124;
        int second = 2;
        if(second == 0) {
            System.out.println("Are you ok?");
        } else if(first % second == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        value = 12345;
        String strValue = String.valueOf(value);
        System.out.println(strValue.charAt(strValue.length() - 1));

        System.out.println(value % 10);
    }
}
