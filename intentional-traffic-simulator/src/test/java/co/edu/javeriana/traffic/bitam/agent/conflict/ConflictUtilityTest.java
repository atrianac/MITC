package co.edu.javeriana.traffic.bitam.agent.conflict;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictUtility;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.guards.ResolveConflictByGameTheory;
import co.edu.javeriana.traffic.mitc.util.Constants;
import co.edu.stanford.bimatrix.gamesolver.LHEquilibriumList;

/**
 * <p>
 * Clase de utilidad para probar la clase {@link ConflictUtility}
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class ConflictUtilityTest {
	
	static final Logger logger = LoggerFactory
			.getLogger(ConflictUtilityTest.class);

	@Test
	public void testCalculateBeat() {

		// Los factores de intencionalidad y benevolencia se obtiene
		int intentionValue = 5;
		int benevolenceValue = 2;

		Double beat = ConflictUtility.calculateBid(Constants.INITIAL_CREDIT,
				intentionValue, benevolenceValue);

		Assert.assertEquals(intentionValue*benevolenceValue/Constants.INITIAL_CREDIT, beat);
	}
	
	@Test
	public void calculateEquilibriumTest() {
		ConflictData cdInit = new ConflictData();
		ConflictData cd = new ConflictData();
		
		cdInit.setBid(0.09);
		cd.setBid(0.01);
		
		LHEquilibriumList ls = ResolveConflictByGameTheory.calculateEquilibrium(cdInit, cd);
		Assert.assertNotNull(ls);
	}

}
