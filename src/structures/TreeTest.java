package structures;

public class TreeTest {
    public static void main(String[] args) {
        Item ten = new Item(null, null, 10);

        // все переменные ниже использовать нельзя
        Item eight = new Item(null, null, 8);
        Item thirteen = new Item(null, null, 13);
        ten.setLeft(eight);
        ten.setRight(thirteen);

        Item one = new Item(null, null, 1);
        Item nine = new Item(null, null, 9);
        Item twelve = new Item(null, null, 12);
        Item fifteen = new Item(null, null, 15);
        eight.setLeft(one);
        eight.setRight(nine);
        thirteen.setLeft(twelve);
        thirteen.setRight(fifteen);


//        System.out.println(ten.getValue());
//        if(ten.getLeft() != null) {
//            System.out.println(ten.getLeft().getValue());
//
//            if (ten.getLeft().getLeft() != null) {
//                System.out.println(ten.getLeft().getLeft().getValue());
//            }
//        }
//        print(ten);

        Tree tree = new Tree();
        tree.addValue(10);
        tree.addValue(8);
        tree.addValue(1);
        tree.addValue(0);
        tree.printTree();
    }

    public static void print(Item current) {
        if(current.getLeft() != null) {
            print(current.getLeft());
        }
        if(current.getRight() != null) {
            print(current.getRight());
        }

        System.out.println(current.getValue());
    }
}
