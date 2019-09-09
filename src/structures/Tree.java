package structures;

public class Tree {
    private Item root; // вершина дерева

    public void printTree() {
        if(root != null) {
            print(root);
        }
    }

    public void addValue(int value) {
        if(root == null) { // дерево еще пустое
            root = new Item(null, null, value);
        } else {
            add(root, value);
        }
    }

    private void add(Item current, int newValue) {
        if(current.getValue() > newValue) {
            if(current.getLeft() != null) { // если слева что-то есть
                add(current.getLeft(), newValue); // переходим в левую вершину
            } else { // слева пустота
                Item item = new Item(null, null, newValue);
                current.setLeft(item); // добавляем новое ребро
            }
        }
    }

    private void print(Item current) {
        System.out.println(current.getValue());
        if(current.getLeft() != null) {
            print(current.getLeft());
        }
        if(current.getRight() != null) {
            print(current.getRight());
        }

    }
}
