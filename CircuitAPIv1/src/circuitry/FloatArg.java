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
public class FloatArg 
{
    // variabels 
    protected boolean isBoolean;
    protected double value;  // the double/floating point
    
    // constructors   ///////////////////
    public FloatArg()
    {
        this.isBoolean = true;
        this.value = -1;
    }
    

    public FloatArg(boolean isBoolean, double dValue)
    {
        this.isBoolean = isBoolean;
        this.value = dValue;
    }


    
    /////////////////////// methods   ///////////////////////////////
    public boolean getBoolean()
    {
        return value == 1.0;
    }
    
    public double getDouble()
    {
        return value;
    }
    
    public void setValue(boolean isBoolean, double dValue)
    {
        this.isBoolean = isBoolean;
        this.value = dValue;
    }
    
}


