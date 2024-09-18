/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import stack.Stack;

/**
 *
 * @author sangr
 */
public class StackTest {
    Stack s;
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s = new Stack(new Integer[1]);
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void assertCapacityWhenPassed1ArrayLengthParameter(){
        assertEquals(s.capacity(), 1);
    }
    @Test
    public void assertIsEmpty(){
        assertTrue(s.isEmpty());
    }
    @Test
    public void assertNotEmptyAfterPushingElement(){
        s.push(14);
        assertFalse(s.isEmpty());
    }
    @Test
    public void assertSizeIs1AfterPushingAElement(){
        s.push(14);
        assertEquals(1, s.size());
    }
    @Test
    public void assertCanPullElement(){
        s.push(14);
        assertEquals(14, s.pull());
    }
    @Test
    public void assertSizeIs0AfterPullingElement(){
        s.push(15);
        s.pull();
        assertEquals(0, s.size());
    }
    @Test
    public void assertCanWorkWithFloatingPoints(){
        Stack st = new Stack(new Double[1]);
        st.push(43.54);
        assertEquals(43.54, st.pull());
    }
    
    @Test
    public void testSomething(){
        Integer i[] = {43, 43, 43};
    }
}
