package basic_package;

public class Cycles {
    public static void main(String[] args) {
        int sum = 0;
        int n = 12345;
        // -------------
        int i = 0;
        while(i < n) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
        // --------------

        // --------------
        sum = 0;
        int k = 0;
        k = k + 1;
        k++;

        k = k - 1;
        k--;
        for(int j = 0; j < n; j++) {
            sum = sum + j;
        }
        System.out.println(sum);
        // --------------

        String number = "123213123123123213123123123123123";
    }
}
