/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertsort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void testsort(){
        Sort sort=new Sort();
        int [] arr={8,4,23,42,16,15};
        int [] res={4,8,15,16,23,42};
        assertEquals(Arrays.toString(res), Arrays.toString(sort.insertionSort(arr)));
    }
}