public class ScopesExample {
    public static void main(String[] args) {
        int n = 10;
        int i = 0;
        while(i < n) {
            System.out.println(i);
            i++;
        }

        String name = "Ivan";
        System.out.println("Hello, Ivan");

        System.out.println(name);
        for(i = 0; i < n; i++) {
            System.out.println(i);
            int k = 0;
        }
        System.out.println(i);
//        System.out.println(k);
    }
}
