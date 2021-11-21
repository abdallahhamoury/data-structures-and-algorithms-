package hashtable;
import org.junit.jupiter.api.Test;
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
    void hashMap() {
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
}