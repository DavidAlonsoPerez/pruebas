/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mueble;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class MuebleTest {
    
    public MuebleTest() {
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
     * Test of setTipoMueble method, of class Mueble.
     */
    @Test
    public void testSetTipoMueble() {
        Mueble m1=new Mueble("MESA");
        assertSame(m1.getTipoMueble(),"MESA");
    }
    @Test
    public void testSetTipoMueble2() {
        Mueble m2=new Mueble("SILLA");
        assertSame(m2.getTipoMueble(),"SILLA");
    }
    @Test
    public void testSetTipoMueble3() {
        Mueble m3=new Mueble("ARMARIO");
        assertSame(m3.getTipoMueble(),"ARMARIO");
    }
    
    @Test
    public void testSetTipoMueble4() {
        Mueble m4=new Mueble("OTRO");
        assertSame(m4.getTipoMueble(),"DESCONOCIDO");
    }
    
    @Test
    public void testSetColor() {
        Mueble m5=new Mueble("NEGRO");
        assertSame(m5.getColor(),"NEGRO");
    }
    
    @Test
    public void testSetColor2() {
        Mueble m6=new Mueble("BLANCO");
        assertSame(m6.getColor(),"BLANCO");
    }

    /**
     * Test of getTipoMueble method, of class Mueble.
     */
    @Test
    public void testGetTipoMueble() {
        
        fail("The test case is a prototype.");
    }
    
}
