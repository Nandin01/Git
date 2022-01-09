/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package circuitryTest;

import circuitry.Circuit;
import circuitry.CustomBinaryOperation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20215191
 */
public class CircuitTest {
    
    public CircuitTest() {
    }

    /** 
     * Create a circuit to evaluate x1 and x2 and then
     * verify that its result is false for input (false, true) and
     * it is true for input (true, true).
     */
    @Test
    public void testX1andX2() {
        // make the circuit       
	Circuit c = new Circuit();
        
        c.addInput("X1");
        c.addInput("X2");
        c.addAndGate("and");
        
        c.connect("and", "X1", 1);
        c.connect("and", "X2", 2);
        
        c.setOutputGate("and");
        
        // test the circuit for different inputs        
 	c.setInputValue("X1", false);
	c.setInputValue("X2", true);
        
        assertEquals(false, c.run());      
        
        c.setInputValue("X1", true);
        c.setInputValue("X2", true);
        
        assertEquals(true, c.run());          
    }
    
        /** 
     * Create a circuit to evaluate (x1 and x2) or x3 and then
     * verify that its result is false for input (false, true, false) and
     * it is true for input (false, false, true).
     */
   
 
    @Test
    public void testX1andX2orX3() {
        // make the circuit        
	Circuit c = new Circuit();
        
        c.addInput("X1");
        c.addInput("X2");
        c.addInput("X3");
        c.addAndGate("and");
        c.addOrGate("or");
        
        c.connect("and", "X1", 1);
        c.connect("and", "X2", 2);
        c.connect("or", "and", 1);
        c.connect("or", "X3", 2);
        
        c.setOutputGate("or");
        
        // test the circuit for different inputs        
        c.setInputValue("X1", false);
        c.setInputValue("X2", true);
        c.setInputValue("X3", false);
        assertEquals(false, c.run());  
        
        c.setInputValue("X1", true);
        c.setInputValue("X2", false);
        c.setInputValue("X3", true);
        assertEquals(true, c.run());      	  
    }

        /** 
     * Create a circuit to evaluate (x1 or not(x1)) and then
     * verify that its result is true for all values of x1.
     */
    @Test
    public void testAlwaysTrue() {
        // make the circuit   
	Circuit c = new Circuit();
        
        c.addInput("X1");
        c.addNotGate("not");
        c.addOrGate("or");
        
        c.connect("or", "not", 1);
        c.connect("or", "X1", 2);
        c.connect("not", "X1", 1);
        
        c.setOutputGate("or");
        
        // test the circuit for different inputs
        c.setInputValue("X1", true);
        assertEquals(true, c.run());             
        c.setInputValue("X1", false);     
        assertEquals(true, c.run());      	 
    } 
    
    @Test
    public void testX1orX2xorX3(){
        Circuit c = new Circuit();
        
        c.addInput("X1");
        c.addInput("X2");
        c.addInput("X3");
        
        c.addOrGate("or");
        
        c.addCustomBinaryGate(new CustomBinaryOperation() {
            @Override
            public boolean doOperation(boolean op1, boolean op2) {
                return op1 ^ op2;
            }
        }, "xor");
        
        c.connect("xor", "or", 1);
        c.connect("xor", "X3", 2);
        c.connect("or", "X1", 1);
        c.connect("or", "X2", 2);
        
        c.setOutputGate("xor");
        
        c.setInputValue("X1", true);
        c.setInputValue("X2", true);
        c.setInputValue("X3", true);
        assertEquals(false, c.run());
        
        c.setInputValue("X1", true);
        c.setInputValue("X2", true);
        c.setInputValue("X3", false);
        assertEquals(true, c.run());
        
        c.setInputValue("X1", true);
        c.setInputValue("X2", false);
        c.setInputValue("X3", true);
        assertEquals(false, c.run());

    }
    
    @Test
    public void testCustomGate(){
        
    }
    @Test
    public void testGte() {
      // make the circuit   
	Circuit c = new Circuit();
        
        c.addInput("X1");
        c.addInput("X2");
        c.addGteGate("Gte");

        c.connect("Gte", "X1", 1);
        c.connect("Gte", "X2", 2);
        
        
        c.setOutputGate("Gte");
        
        // test the circuit for different inputs
        c.setInputValue("X1", 0.7);
        c.setInputValue("X2", 0.3);
        assertEquals(true, c.run());             
        
    }
}
