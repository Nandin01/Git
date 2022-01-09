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

public class Or extends BinaryGate 
{
    public Or()
    {
        super.inputGate1 = null;
        super.inputGate2 = null;
    }
    
    @Override
    public boolean getValue()
    {
   	return inputGate1.getValue() || inputGate2.getValue();    
    }
}
