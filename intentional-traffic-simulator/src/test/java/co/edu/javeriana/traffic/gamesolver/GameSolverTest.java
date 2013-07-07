package co.edu.javeriana.traffic.gamesolver;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.javeriana.traffic.mitc.util.BimatrixResolverWrapper;
import co.edu.stanford.bimatrix.gamesolver.LHEquilibriumList;
import co.edu.stanford.bimatrix.gamesolver.LHEquilibriumProfile;

public class GameSolverTest {

	private static final Logger logger = LoggerFactory
			.getLogger(GameSolverTest.class);

	@Test
	public void testBimatrixResolver() {

		BimatrixResolverWrapper bw;
		
		
//		[[-0.09, 0.08], [0.09999999999999999, 0.09]]
//		[[-0.01, -0.08], [0.09999999999999999, 0.01]]
						
		double[][] M1 = { { -0.09, 0.08 }, { 0.1, 0.09 } };

		double[][] M2 = { { -0.01, 0.1 }, {-0.08, 0.01 } };

		bw = new BimatrixResolverWrapper(2, 2, M1, M2, 2);
		bw.setPivot(1);

		LHEquilibriumList resultEquilibrium = bw.getSingleLemkeHowson();
		LHEquilibriumProfile equilibriumProfile = resultEquilibrium.iterator()
				.next();

		double initialPayOff = equilibriumProfile.eq_pay1;
		double lostPayOff = equilibriumProfile.eq_pay2;

		logger.debug("Primer payoff {} y {}", initialPayOff, lostPayOff);
	}

}
