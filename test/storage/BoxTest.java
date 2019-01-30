/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class BoxTest {

    Shelf s = new Shelf();
    Box b;

    @Test(expected = NullPointerException.class)
    public void testSetName() {
        b.setName("");
    }

    /**
     * Test of setWidth method, of class Box.
     */
    @Test(expected = NullPointerException.class)
    public void testSetWidth() {
        b.setWidth(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWidth2() {
        b = new Box("Name", 0);
        assertEquals(0, b.width);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetName2() {
        b = new Box("", 2);
        assertEquals("", b.name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddBox() {
        s.addBox(null);
    }

    @Test
    public void testSetGoodWidth() {
        b = new Box("X", 10);
        assertEquals(10, b.width);
    }

    @Test
    public void testSetGoodName() {
        b = new Box("X", 10);
        assertEquals("X", b.name);
    }
    
    @Test
    public void testAddGoodBox() {
        s.addBox(new Box("X",10));
    }
    
}
