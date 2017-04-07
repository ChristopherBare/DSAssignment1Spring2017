/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment1spring2017;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christopher1
 */
public class ArrayBagTest {

    public ArrayBagTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class ArrayBag.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String element = "String";
        ArrayBag<String> instance = new ArrayBag<>();
        instance.add(element);
        assertEquals(instance.contains(element), true);

    }

    /**
     * Test of remove method, of class ArrayBag.
     * You know the drill. 
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        ArrayBag<String> instance = new ArrayBag<>();
        String element = "String 1";
        String element2 = "String 2";
        instance.add(element);
        instance.add(element2);
        instance.remove();
        assertEquals(instance.size(), 1);
        instance.remove();
        assertEquals(instance.size(), 0);
        assertTrue(instance.isEmpty());

    }

    /**
     * Test of contains method, of class ArrayBag.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object target = null;
        ArrayBag instance = new ArrayBag();
        boolean expResult = false;
        boolean result = instance.contains(target);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEmpty method, of class ArrayBag.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayBag instance = new ArrayBag();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class ArrayBag.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayBag instance = new ArrayBag();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class LinkedStack.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayBag<String> instance = new ArrayBag<>();
        String element = "";
        instance.add(element);
        String expResult = "ArrayBag{" + "bag=" + Arrays.toString(instance.getBag()) 
                + ", top=" + instance.getTop() + ", Nope=" + instance.getNope() + "}"; 
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    

}
