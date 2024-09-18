/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import expressionsolver.UnitGroup;
import expressionsolver.operators.Minus;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Niraj Sangroula
 */
public class UnitGroupTest {

    public UnitGroupTest() {
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

//     TODO add test methods here.
//     The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void hello() {}
    @Test
    public void testSingleUnitGroup() {
        UnitGroup u = new UnitGroup("33", true);
        assertEquals(33.0, u.unit().value());
    }

    @Test
    
    public void testCanCreateUnitGroups() {
        UnitGroup u = new UnitGroup("33-14", true);
        u.createUnitGroups();
        assertTrue(u.hasUnitGroups());
        assertEquals(2, u.unitGroups.size());
        final UnitGroup firstVar = u.unitGroups.get(0);
        assertEquals("33", firstVar.expression);
        final UnitGroup secondVar = u.unitGroups.get(1);
        assertEquals("14", secondVar.expression);
        assertTrue(firstVar.presymbol.canUse('+'));
        assertTrue(secondVar.presymbol.canUse('-'));
        assertEquals("33", secondVar.preceedingUnitGroup.expression);
        assertEquals(null, secondVar.succeedingUnitGroup);
        assertEquals("14", firstVar.succeedingUnitGroup.expression);
    }
    
    @Test
    public void testCanCreateMultipleUnitGroupsThan2(){
        UnitGroup u = new UnitGroup("33+14-86", true);
        u.createUnitGroups();
        assertEquals(3, u.unitGroups.size());
        assertEquals("33", u.unitGroups.get(0).expression);
        assertEquals("14", u.unitGroups.get(1).expression);
        assertEquals("86", u.unitGroups.get(2).expression);
        assertEquals("33", u.unitGroups.get(1).preceedingUnitGroup.expression);
        assertEquals("14", u.unitGroups.get(2).preceedingUnitGroup.expression);
        assertEquals(null, u.unitGroups.get(0).preceedingUnitGroup);
        assertEquals("14", u.unitGroups.get(0).succeedingUnitGroup.expression);
        assertEquals("86", u.unitGroups.get(1).succeedingUnitGroup.expression);
        assertEquals(null, u.unitGroups.get(2).succeedingUnitGroup);
        assertFalse(u.unitGroups.get(2).hasSuceedingUnitGroup());
        assertTrue(u.unitGroups.get(0).presymbol.canUse('+'));
        assertTrue(u.unitGroups.get(1).presymbol.canUse('+'));
        assertTrue(u.unitGroups.get(2).presymbol.canUse('-'));
        
    }

    @Test
    public void testOperateOnUnitOfUnitGroups() {
        UnitGroup u = new UnitGroup("33+14", true);
        u.createUnitGroups();
        u.operateOnUnitsOfUnitGroups();
    }

    @Test
    public void testOperateOnUnitOfUnitGroupsInMultiple() {
        UnitGroup u = new UnitGroup("33+14+43+6565+6565456+645555", true);
        u.createUnitGroups();
        u.operateOnUnitsOfUnitGroups();
        assertEquals(new Double(33+14+43+6565+6565456+645555), u.unit().value());
    }

    @Test
    public void testDoubleUnitGroup() {
        UnitGroup u = new UnitGroup("1000+1784", true);
        assertEquals(2784.0, u.unit().value());
    }
    
    @Test
    public void testOnDifferentUnitGroups(){
        UnitGroup u = new UnitGroup("3+2+1", true);
        assertEquals(new Double(3+2+1), u.unit().value());
        UnitGroup v = new UnitGroup("1+10+20", true);
        assertEquals(new Double(1+10+20), v.unit().value());        
    }
    
    @Test
    public void testOnDifferentOperator(){
        UnitGroup u = new UnitGroup("1-3", true);
        assertEquals(new Double(1-3), u.unit().value());        
    }
    
    @Test
    public void testOnMultipleOperators(){
        UnitGroup u = new UnitGroup("43-43-4", true);
        assertEquals(new Double(-4), u.unit().value());          
    }
    
    @Test
    public void testUnitGroupsSorter(){
        UnitGroup u = new UnitGroup("3-2+1/43-44", true);
        u.createUnitGroups();
        u.sortUnitGroups();
        ArrayList<UnitGroup> unitGroups = u.unitGroups;
        assertTrue(unitGroups.get(0).presymbol.canUse('/'));
        assertTrue(unitGroups.get(1).presymbol.canUse('+'));
        assertTrue(unitGroups.get(2).presymbol.canUse('+'));
        assertTrue(unitGroups.get(3).presymbol.canUse('-'));
        assertTrue(unitGroups.get(3).presymbol.canUse('-'));
        assertEquals(5, unitGroups.size());
    }
    
    @Test
    public void testResults(){
        UnitGroup u = new UnitGroup("-43+3", true);
        assertEquals(new Double(-43+3), u.unit().value()); //here
        UnitGroup u1 = new UnitGroup("42-33+23", true);
        assertEquals(new Double(42-33+23), u1.unit().value());
        UnitGroup u2 = new UnitGroup("-42-33-23", true);
        assertEquals(new Double(-42-33-23), u2.unit().value());
        UnitGroup u3 = new UnitGroup("43/3*3", true);
        assertEquals((double)43/3*3, u3.unit().value());
    }
    @Test
    public void testExtraordinary(){
        UnitGroup u4 = new UnitGroup("15-10+6-2", true);
        assertEquals(new Double(15-10+6-2), u4.unit().value());
    }
    
    @Test
    public void stupidAmericanTests(){
        UnitGroup u4 = new UnitGroup("15*4334-10+6/43+433-2", true);
        assertEquals(15*4334-10+(double)6/43+433-2, u4.unit().value());        
    }
    
    @Test
    public void testGivenNegativeTwoNumbers(){
        UnitGroup u4 = new UnitGroup("-4-4", true);
        assertEquals((double)-4-4, u4.unit().value());    
    }
}