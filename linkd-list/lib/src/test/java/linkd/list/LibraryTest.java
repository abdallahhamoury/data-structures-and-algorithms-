/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkd.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LibraryTest {
    LinksList myListForTest  = new LinksList();

    @Test
    public void testEmptyList() {
        String msg = myListForTest.toString();
        assertEquals("NULL", msg);
    }

    @Test
    public void testInsert() {

        myListForTest.insert("abdallah");
        String msg = myListForTest.toString();
        assertEquals("{abdallah}--->NULL", msg);

    }

    @Test
    public void testTrueInclude() {
        myListForTest.insert("abdallah");
        boolean msg = myListForTest.includse("abdallah");
        assertTrue(msg);

    }

    @Test
    public void testFalseInclude() {

        myListForTest.insert("abdallah");
        boolean msg = myListForTest.includse("aaaaa");
        assertFalse(msg);

    }

    @Test
    public void testAllList() {
        myListForTest.insert("a");
        myListForTest.insert("b");
        myListForTest.insert("c");
        String msg = myListForTest.toString();
        assertEquals("{c}--->{b}--->{a}--->NULL", msg);

    }

    @Test
    public void testAppend() {
        myListForTest.insert("a");
        myListForTest.insert("b");
        myListForTest.insert("c");
        myListForTest.append("endValue");
        String msg = myListForTest.toString();
        assertEquals("{c}--->{b}--->{a}--->{endValue}--->NULL", msg);
    }



    @Test
    public void testInsertBefore() {
        myListForTest.insert("a");
        myListForTest.insert("b");
        myListForTest.insert("c");

        myListForTest.insertBefore("b", "befor");
        String msg = myListForTest.toString();
        assertEquals("{c}--->{befor}--->{b}--->{a}--->NULL", msg);

        myListForTest.insertBefore("c", "befor2");
        String msg2 = myListForTest.toString();
        System.out.println(msg2);
        assertEquals("{befor2}--->{c}--->{befor}--->{b}--->{a}--->NULL", msg2);

    }


    @Test
    public void testInsertAfter() {
        myListForTest.insert("a");
        myListForTest.insert("b");
        myListForTest.insert("c");


        myListForTest.insertAfter("b", "after");
        String msg = myListForTest.toString();
        assertEquals("{c}--->{b}--->{after}--->{a}--->NULL", msg);

        myListForTest.insertAfter("c", "after2");
        String msg2 = myListForTest.toString();
        System.out.println(msg2);
        assertEquals("{c}--->{after2}--->{b}--->{after}--->{a}--->NULL", msg2);
    }

    @Test
    public void testKth() {

        myListForTest.insert("a");
        myListForTest.insert("b");
        myListForTest.insert("c");

        String msg = myListForTest.kthFromEnd(2);
        assertEquals("The value of indix 2 from the tail =c", msg);
    }

    @Test
    public void testKthGreaterThanTheList() {
        myListForTest.insert("a");
        myListForTest.insert("b");
        myListForTest.insert("c");

        String msg = myListForTest.kthFromEnd(4);
        assertEquals("the input number cant be biger then  Linkedlist", msg);
    }
//
    @Test
    public void testKthSmallerThanTheList() {

        myListForTest.insert("a");
        myListForTest.insert("b");
        myListForTest.insert("c");

        String msg = myListForTest.kthFromEnd(-1);
        assertEquals("number can't be less than 0", msg);
    }
//
    @Test
    public void testKthIndexOfOne() {
        myListForTest.insert("a");
        String msg = myListForTest.kthFromEnd(0);
        assertEquals("The value of indix 0 from the tail =a", msg);
    }

    @Test
    public void testZip() {
        LinksList myListForTest = new LinksList();
        LinksList myListForTest2 = new LinksList();
        myListForTest.insert("a1");
        myListForTest.insert("b1");
        myListForTest2.insert("a2");
        myListForTest2.insert("b2");

        LinksList test = LinksList.ziplists(myListForTest, myListForTest2);
        assertTrue(test.includse("a1"));
        assertTrue(test.includse("a2"));
        assertTrue(test.includse("b1"));
        assertTrue(test.includse("b2"));

        String msg =test.toString();
        assertEquals("{b1}--->{b2}--->{a1}--->{a2}--->NULL", msg);
    }
}
