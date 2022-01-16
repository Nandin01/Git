package circuitry;

public class Xor extends BinaryGate 
{
    @Override
    public boolean getValue()
    {
	return !(inputGate1.getValue() ^ inputGate2.getValue());
    }

}

