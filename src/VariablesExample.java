public class VariablesExample {
    // psvm
    public static void main(String[] args) {
        byte a = 123;
        int b = a;
        System.out.println(b);

        int first = 128;
        byte second = (byte) first;
        System.out.println(second);

        first = 1;
        second = 3;
        double result = (double) first / second;
        System.out.println(result);
    }
}
