package ec.app.myApp3;
import ec.*;
import ec.gp.*;
import ec.util.*;

public class Nobody extends GPNode
{
	public String toString() { return "nobody"; }

	public int expectedChildren() { return 0; }

	public void eval(final EvolutionState state,
				 final int thread,
				 final GPData input,
				 final ADFStack stack,
				 final GPIndividual individual,
				 final Problem problem)
	{
		NetlogoData rd = ((NetlogoData)(input));
		
		rd.netlogoString = rd.netlogoString.append(" nobody ");
	}
}