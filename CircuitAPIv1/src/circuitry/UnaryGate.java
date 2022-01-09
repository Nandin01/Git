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
/**
 *
 * @author 20215199
 */
public class UnaryGate extends Gate
{
    //attributes
    protected Gate inputGate;   // perhaps we can make these into objects
    
    //constructors
    public UnaryGate()
    { 
    }
    
    //public UnaryGate(Gate left)
    //{
        //this.leftInput = left;
    //}
    
    
    // methods /////////////////////////
    public void connectInput(Gate gate)
    {
        this.inputGate = gate;
    }
    

    public boolean getValue()
    {
        return false;
    }
    
}
