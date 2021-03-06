/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jsiwek
 */
public class MultiplyTest {

    public MultiplyTest() {
    }

    @Test
    public void testMultiply0() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "1";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);

    }
     @Test
    public void testMultiply100() {
        System.out.println("multiply");
        String a = "2";
        String b = "4";
        String expResult = "1";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);

    }
     @Test
    public void testMultiply130() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "1";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);

    }

    @Test
    public void testMultiply101() {
        System.out.println("multiply1");
        String a = "2";
        String b = "30";
        String expResult = "6";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
    }
     @Test
    public void testMultiply200() {
        System.out.println("multiply");
        String a = "12";
        String b = "3";
        String expResult = "1";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);

    }
    
    @Test
    public void testMultiply2() {
        System.out.println("multiply2");
        String a = "30";
        String b = "10";
        String expResult = "300";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);

    }

    @Test
    public void testMultiply10() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "6";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply20() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "7";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);
    }

    @Test
    public void testMultiply8()
    {
        String k="2";
        String b="4";
        String sorted ="8";
        String expect=Multiply.multiply(k, b);
        assertEquals(expect,sorted);
    }

    // Removed redundant test, added one, which tests everything that previous tests intended to do (but failed to in
    // sense of actual implementation or their initial conception)

    @Test(expected = NumberFormatException.class)
    public void stringsContainingOnlyLettersShouldRaiseException() {
        System.out.println("Inputting foo and bar into multiply()...");
        String a = "foo";
        String b = "bar";
        Multiply.multiply(a, b);
    }

    @Test(expected = NumberFormatException.class)
    public void stringsContainingHexNumbersShouldRaiseException(){
        System.out.println("Input 2C and F in multiply");
        String a= "2C";
        String b= "F";
        Multiply.multiply(a,b);
    }

}
