package ec.app.myApp3;
import ec.*;
import ec.gp.*;
import ec.util.*;

public class ClosestNearbyWaterPatchInLessProductiveZone extends GPNode
{
	public String toString() { return "closest-nearby-water-patch-in-less-productive-zone"; }

	public int expectedChildren() { return 1; }

	public void eval(final EvolutionState state,
				 final int thread,
				 final GPData input,
				 final ADFStack stack,
				 final GPIndividual individual,
				 final Problem problem)
	{
		NetlogoData data1 = ((NetlogoData)(input));
		children[0].eval(state, thread, data1, stack, individual, problem); // potential farm
		StringBuffer potentialFarm = new StringBuffer(data1.netlogoString);
		
		data1.netlogoString = data1.netlogoString.insert(0," min-one-of patches with [ water-source = 1 and num-occupying-farms = 0 and yield < [ yield ] of ");
		
		data1.netlogoString.append(" and distance "); 
		data1.netlogoString.append(potentialFarm);
		data1.netlogoString.append(" <= water-source-distance] [ distance ");
		data1.netlogoString.append(potentialFarm);
		data1.netlogoString.append("]");
		
	}
}