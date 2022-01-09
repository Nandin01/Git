/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuitry;

/**
 *
 * @author 20215191
 */
public class CustomBinaryGate extends BinaryGate{
    
    private CustomBinaryOperation operation;

    @Override
    public boolean getValue() {
        boolean v1 = this.inputGate1.getValue();
        boolean v2 = this.inputGate2.getValue();
        return operation.doOperation(v1, v2);
    }
    
    public void defineCustomOperation(CustomBinaryOperation operation){
        this.operation = operation;
    }
    
}
