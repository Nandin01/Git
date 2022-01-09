/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuitry;

/**
 *
 * @author 20215187
 */
class InputFloat extends Gate implements FloatFunctions{

    FloatArg value;
    
    @Override
    public boolean getValue() {
        return value.getDouble() == 1.0 ;
        
    }

    public void setValue(double value) {
        this.value = new FloatArg(false, value);
    }
    
    @Override
    public FloatArg getFloatValue() {
       return value;
    }
    
}
