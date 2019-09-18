package basic_package;

public class CyclesWithString {
    public static void main(String[] args) {
        String name = "Ivan";
        // length()
        // charAt(1)
        for(int i = 0; i < name.length(); i++) {
            System.out.println(i);
            System.out.println(name.charAt(i));
        }

        // посчитать количество букв A в строке
        String value = "aaAbbAc";
        for (int i = 0; i < value.length(); i++) {
            char currentChar = value.charAt(i);
            if(currentChar == 'A') {
                System.out.println("found A in position " + i);
            }
        }

        char symbol = 'b';
        int number = (int) symbol;
        System.out.println(number);

    }
}
