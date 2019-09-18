package basic_package;

public class StringExample {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String lastName = "Petrov";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        char firstLetter = lastName.charAt(0);
        char secondLetter = lastName.charAt(1);
        System.out.println(firstLetter);
        System.out.println(secondLetter);

        String shortName = firstName + " " + firstLetter + ".";
        System.out.println(shortName);

        int nameLength = fullName.length();
        char lastLetter = fullName.charAt(nameLength - 1);
        System.out.println("Last symbol = " + lastLetter);
        System.out.println("Length = " + nameLength);


    }
}
