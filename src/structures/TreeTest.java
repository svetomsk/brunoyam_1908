package structures;

public class TreeTest {
    public static void main(String[] args) {
        Item ten = new Item(null, null, 10);

        Item eight = new Item(null, null, 8);
        Item thirteen = new Item(null, null, 13);
        ten.setLeft(eight);
        ten.setRight(thirteen);


    }
}
