/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuitry;

/**
 *
 * @author 20215187
 */
public class Gte extends BinaryGate {

    @Override
    /**
    *
    * Gets the values from 
    */
    public boolean getValue() {
        FloatArg b1 = null, b2 = null;
        if (this.inputGate1 instanceof FloatFunctions){
           b1 = ((FloatFunctions)inputGate1).getFloatValue();
        }
        else {
            double value = inputGate1.getValue() ? 1.0 : 0.0 ;
            b1 = new FloatArg(false, value);
                    
        }
        if (this.inputGate2 instanceof FloatFunctions) {
            b2 = ((FloatFunctions)inputGate2).getFloatValue();
        }
        else{   
            double value = inputGate2.getValue() ? 1.0 : 0.0 ;
            b2 = new FloatArg(false, value);
        }
        return b1.getDouble() >= b2.getDouble();
    }

  
   
}
