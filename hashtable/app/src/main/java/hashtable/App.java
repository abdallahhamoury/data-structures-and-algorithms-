package hashtable;
import java.util.*;
public class App {
    public static void main(String[] args) {
        HashTable myTable = new HashTable();
//        myTable.add("Cat", 1);
//        myTable.add("container", 2);
//        myTable.add("ddd", 2);
//        myTable.add(555, 3);
//        myTable.add(8, 4);
//        System.out.println(myTable.get("Cat"));
//        System.out.println(myTable.get("container"));
//        System.out.println(myTable.get("test"));
//        System.out.println(myTable.contains("aseel"));
//        System.out.println(myTable.contains("Cat"));
//        System.out.println(myTable.hash("555"));
//        System.out.println(myTable.hash("Cat"));
//        System.out.println(myTable.hash("ddd"));
//        System.out.println(myTable);
        /* --------------------------------------------------------------------------------------*/
//        System.out.println(repeatedWord("\"Once upon a time, there was a brave princess who...\""));
        /* --------------------------------------------------------------------------------------*/
        BinaryTree<Integer> binaryTreeOne = new BinaryTree<>(new Node<>(5));
        Node<Integer> node1 = new Node<>(2);
        Node<Integer> node2 = new Node<>(3);
        Node<Integer> node3 = new Node<>(1, node1, node2);
        Node<Integer> node5 = new Node<>(6);
        Node<Integer> node4 = new Node<>(4, node5, null);
        binaryTreeOne.root.rightChild = node4;
        binaryTreeOne.root.leftChild = node3;
        BinaryTree<Integer> binaryTreeTwo = new BinaryTree<>(new Node<>(45));
        Node<Integer> node6 = new Node<>(2);
        Node<Integer> node7 = new Node<>(12);
        Node<Integer> node8 = new Node<>(1, node6, node7);
        Node<Integer> node9 = new Node<>(44);
        Node<Integer> node10 = new Node<>(4, node9, null);
        binaryTreeTwo.root.rightChild = node10;
        binaryTreeTwo.root.leftChild = node8;
        System.out.println(treeIntersection(binaryTreeOne, binaryTreeTwo));
    }
    public static ArrayList treeIntersection(BinaryTree tree1, BinaryTree tree2) {
        if (tree1.root == null || tree2.root == null) return null;
        Map<String,String> storeMap = new HashMap();
        ArrayList<Object> arr = new ArrayList<>();
        for (Object oneItem : tree1.preOrder(tree1.root)) {
            storeMap.put(oneItem.toString(), null);
        }
        for (Object oneItem: tree2.preOrder(tree2.root)) {
            if (storeMap.containsKey(oneItem.toString()) && !arr.contains(oneItem)) arr.add(oneItem);
        }
        return arr;
    }
    public static String repeatedWord(String sentence) {
        Map<String, String> hashMap = new HashMap<>();
        sentence = sentence.replace(",", "");
        String[] allWords = sentence.split(" ");
        for (String word : allWords) {
            word = word.toLowerCase();
            if (hashMap.containsKey(word)) return word;
            else hashMap.put(word, word);
        }
        return null;
    }
}