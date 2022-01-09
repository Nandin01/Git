/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitry;

/**
 *
 * @author 20215199
 */
public class BinaryGate extends Gate
{
        //attributes
    protected Gate inputGate1;   // perhaps we can make these into objects
    protected Gate inputGate2;   // perhaps we can make these into objects
    
    
    //constructors
    public BinaryGate()
    {
        this.inputGate1 = null;
        this.inputGate2 = null;
    }
    
    //public UnaryGate(Input left, Input right)
    //{
        //this.leftInput = left;
        //this.rightInput = right;
    //}
    
    
    /**
     * Creates connection to Input1
     * @param gate gate of the Input1
     */
    public void connectInput1(Gate gate)
    {
        this.inputGate1 = gate;
    }
    
    /**
     * Creates connection to Input2
     * @param gate gate of the Input2
     */
    public void connectInput2(Gate gate)
    {
        this.inputGate2 = gate;
    }
    
    /**
     * Gets the value from gates
     * @return result
     */
    public boolean getValue()
    {
        return false;
    }
    
    
}
