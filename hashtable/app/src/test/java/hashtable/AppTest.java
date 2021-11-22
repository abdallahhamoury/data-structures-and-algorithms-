package hashtable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void hashTable() {
        // Adding a key/value to your hashtable results in the value being in the data structure
        HashTable testTable = new HashTable();
        testTable.add("Test", 8);
        assertEquals(6, testTable.hash("Test"));
        assertEquals(" [ {Test:8} ] ", testTable.printOneBucket("Test"));
        assertEquals("hashTable =[null, null, null, null, null, null,  [ {Test:8} ] , null, null, null]", testTable.toString());
        // Retrieving based on a key returns the value stored
        assertEquals(8, testTable.get("Test"));
        // Successfully returns null for a key that does not exist in the hashtable
        assertEquals(null, testTable.get("null"));
        // Successfully handle a collision within the hashtable
        testTable.add("ddd", "ddd Value");
        testTable.add("Cat", "Cat Value");
        assertEquals(" [ {Cat:Cat Value} {ddd:ddd Value} ] ", testTable.printOneBucket("Cat"));
        assertEquals("hashTable =[ [ {Cat:Cat Value} {ddd:ddd Value} ] , null, null, null, null, null,  [ {Test:8} ] , null, null, null]", testTable.toString());
        // Successfully retrieve a value from a bucket within the hashtable that has a collision
        assertEquals("Cat Value", testTable.get("Cat"));
        // Successfully hash a key to an in-range value
        assertEquals(0, testTable.hash("ddd"));
        assertEquals(0, testTable.hash("Cat"));
    }
    @Test
    void hashRepeatedWord() {
        // empty String
        assertNull(App.repeatedWord(""));
        // if the String is only one word
        assertNull(App.repeatedWord("Aseel"));
        // if the repeated word is in uppercase
        String string1 = "\"Once upon a time, there was A brave princess who...\"";
        assertEquals("a", App.repeatedWord(string1));
        // if the repeated word have a comma after
        String string3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("summer", App.repeatedWord(string3));
        // Case from code challenge
        String string2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...\"\t\"it\"\n" +
                "\"It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("it", App.repeatedWord(string2));
    }
    @Test
    void testTreeIntersection() {
        BinaryTree<Integer> tree1 = new BinaryTree<>();
        BinaryTree<Integer> tree2 = new BinaryTree<>();
        // if both of the trees are empty
        assertNull(App.treeIntersection(tree1, tree2));
        // if one of the trees is empty
        tree1.root = new Node<>(5);
        assertNull(App.treeIntersection(tree1, tree2));
        // if there is no common values in both trees
        tree2.root = new Node<>(45);
        ArrayList<Integer> emptyList = new ArrayList<>();
        assertEquals( emptyList , App.treeIntersection(tree1, tree2));
        /* ---------------------   implementation   ------------------ */
        Node<Integer> node1 = new Node<>(2);
        Node<Integer> node2 = new Node<>(3);
        Node<Integer> node3 = new Node<>(1, node1, node2);
        Node<Integer> node5 = new Node<>(8);
        Node<Integer> node4 = new Node<>(4, node5, null);
        tree1.root.rightChild = node4;
        tree1.root.leftChild = node3;
        // // // tree 2 // // //
        Node<Integer> node6 = new Node<>(2);
        Node<Integer> node8 = new Node<>(1, node6, null);
        Node<Integer> node9 = new Node<>(44);
        Node<Integer> node10 = new Node<>(4, node9, null);
        tree2.root.rightChild = node10;
        tree2.root.leftChild = node8;
        /* ------------------------------------------------------------- */
        // if there is a duplicated value in tree1 but not in the tree2 (3 shouldn't be add to arr)
        node4.rightChild = new Node(3);
        assertEquals( "[1, 2, 4]" , App.treeIntersection(tree1, tree2).toString());
        // if there is a duplicated value in tree2 inclusive in list1 (4 shouldn't be added twice to the arr)
        node10.rightChild = new Node<>(4);
        assertEquals( "[1, 2, 4]" , App.treeIntersection(tree1, tree2).toString());
    }
}