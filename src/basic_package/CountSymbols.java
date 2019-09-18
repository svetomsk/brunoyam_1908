package basic_package;

import java.util.Scanner;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String value = "aBAAaaaA";
        mainLoop:
        for (;true;) {
//        for (int j = 0; j >= 0; j++) {
            String value = sc.nextLine();
            if (value.toLowerCase().equals("exit")) {
                break;
            }
            int n = value.length();
            int count = 0;
            for (int i = 0; i < n; i++) {
                char currentChar = value.charAt(i);
                if (currentChar == 'A') {
                    count++;
                }
                if(count > 2) {
                    break mainLoop;
                }
            }
            System.out.println(count);
        }
    }
}
