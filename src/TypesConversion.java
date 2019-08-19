public class TypesConversion {
    public static void main(String[] args) {
        String firstNumber = "123";
        String secondNumber = "10";
        // int - Integer
        int a = Integer.parseInt(firstNumber); // преобразуем строку в число
        int b = Integer.parseInt(secondNumber);

        int result = a + b;
        System.out.println(result);
        String strResult = "<" + String.valueOf(result).charAt(0) + ">"; // преобразуем число в строку
        if(firstNumber instanceof String) { } // <- это не относится к заданию
        System.out.println(strResult);
    }
}
