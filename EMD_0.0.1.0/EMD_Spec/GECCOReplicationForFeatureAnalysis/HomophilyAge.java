/**
* Evolutionary Model Discovery
* Implemented as part of Chathika Gunaratne's PhD dissertation work
* @author Chathika Gunaratne <chathikagunaratne@gmail.com> , <chathika@knights.ucf.edu>
* @date Dec 2016
*
*	@Copyright Notice:
*	This program is free software: you can redistribute it and/or modify
*   it under the terms of the GNU General Public License as published by
*   the Free Software Foundation, either version 3 of the License, or
*   (at your option) any later version.
*
*   This program is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*   GNU General Public License for more details.
*
*   You should have received a copy of the GNU General Public License
*   along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package GECCOReplicationForFeatureAnalysis;
import ec.*;
import ec.gp.*;
import ec.util.*;
import java.util.*;

public class HomophilyAge extends GPNode {
	public String toString() {
		return "HomophilyAge";
	}

	public int expectedChildren() {
		return 0;
	}
	
	public void eval(final EvolutionState state, final int thread, final GPData input, final ADFStack stack,
			final GPIndividual individual, final Problem problem) {
		NetlogoData data = ((NetlogoData)(input));
			
		data.netlogoString.append(" ((abs ([age] of myself -  ifelse-value (count households in-radius water-source-distance != 0) [mean [age] of households in-radius water-source-distance] [0])) / (0.0001 + max [age] of households) )");
		data.logicString.append("<HomophilyAge>");
	}
}