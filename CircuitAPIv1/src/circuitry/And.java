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
    
public class And extends BinaryGate 
{
    public And()
    {
        super.inputGate1 = null;
        super.inputGate2 = null;
    }
    
    /**
     * Gets binary value from Input Gate 1 and 2  
     * @return result of the Gates
     */
    @Override
    public boolean getValue()
    {
   	return (inputGate1.getValue()  && inputGate2.getValue());     
    }

}
    
