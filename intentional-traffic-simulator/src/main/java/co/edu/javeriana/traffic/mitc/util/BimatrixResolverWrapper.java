/**
 * 
 */
package co.edu.javeriana.traffic.mitc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.stanford.bimatrix.gamesolver.BimatrixGame;
import co.edu.stanford.bimatrix.gamesolver.LHEquilibriumList;
import co.edu.stanford.bimatrix.gamesolver.LHEquilibriumProfile;
import co.edu.stanford.bimatrix.gamesolver.LemkeHowson3;
import co.edu.stanford.bimatrix.gamesolver.MatrixUtilities;
import co.edu.stanford.bimatrix.gamesolver.NormalFormTable2;

/**
 * 
 * <p>
 * Clase que encapsula la resolución de un juego
 * </p>
 * 
 * @aut hor <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 * 
 */
public class BimatrixResolverWrapper {

	private static final Logger logger = LoggerFactory
			.getLogger(BimatrixResolverWrapper.class);

	private double[][] M1;

	private double[][] M2;

	private int M;

	private int N;

	private int game_type;

	private NormalFormTable2 NFT;
	
	private int pivot;

	public BimatrixResolverWrapper(int M, int N, double[][] M1, double[][] M2,
			int game_type) {

		boolean dimToBig = false;

		if ((M > 30) || (N > 30)) {
			dimToBig = true;
		}

		this.M = M;
		this.N = N;
		this.M1 = M1;
		this.game_type = game_type;

		if (this.game_type == 0) {
			this.M2 = MatrixUtilities.scalarTimes(M1, -1.0D);
		} else {
			if (this.game_type == 1) {
				this.M2 = MatrixUtilities.transpose(M1);
			} else {
				this.M2 = M2;
			}
		}
		
		this.NFT = new NormalFormTable2(this.M, this.N, this.game_type,
				dimToBig);
		
		this.NFT.setGameType(game_type);
		this.NFT.updateCellsFromArrays(M1, M2);
	}

	/**
	 * <p>
	 * Obtiene el equilibrio por el algoritmo Lemke Howson
	 * </p>
	 */
	public LHEquilibriumList getSingleLemkeHowson() {

		long t = System.currentTimeMillis();

		BimatrixGame game = this.NFT.getGame();
		BimatrixGame.ReducedGame rdcd_game = game.getReducedGame();

		LemkeHowson3 LH3 = new LemkeHowson3(game.getReducedGame());
		
		LH3.setPivot(pivot);
		LHEquilibriumProfile prof = LH3.get_lemke_howson_single();
		t = System.currentTimeMillis() - t;

		if (prof == null) {
			return null;
		}

		LHEquilibriumList ALEP = new LHEquilibriumList();
		ALEP.add(prof);
		ALEP.addBackStrictDom(game.A, game.B, rdcd_game.map1, rdcd_game.map2,
				this.M, this.N);

		long f = System.currentTimeMillis();
		
		logger.info(
				"Lemke-Howson Results:\nDimension: \t" + this.M + " x "
						+ this.N + "\n" + "Time:      \t" + t + "ms" + "\n"
						+ "Equilibria:\t" + ALEP.size() + "\n\n"
						+ "Strictly Dominated Strategies:\n"
						+ rdcd_game.domStrats.toString() + "\n\n"
						+ "************************"
						+ "\n**** Simple Readout ****"
						+ "\n************************\n\n"
						+ ALEP.toReducedString());

		logger.info("LH frame time = " + (System.currentTimeMillis() - f));

		return ALEP;
	}

	/**
	 * @return the m1
	 */
	public double[][] getM1() {
		return M1;
	}

	/**
	 * @param m1
	 *            the m1 to set
	 */
	public void setM1(double[][] m1) {
		M1 = m1;
	}

	/**
	 * @return the m
	 */
	public int getM() {
		return M;
	}

	/**
	 * @param m
	 *            the m to set
	 */
	public void setM(int m) {
		M = m;
	}

	/**
	 * @return the n
	 */
	public int getN() {
		return N;
	}

	/**
	 * @param n
	 *            the n to set
	 */
	public void setN(int n) {
		N = n;
	}

	/**
	 * @return the game_type
	 */
	public int getGame_type() {
		return game_type;
	}

	/**
	 * @param game_type
	 *            the game_type to set
	 */
	public void setGame_type(int game_type) {
		this.game_type = game_type;
	}

	/**
	 * @return the m2
	 */
	public double[][] getM2() {
		return M2;
	}

	/**
	 * @return the pivot
	 */
	public int getPivot() {
		return pivot;
	}

	/**
	 * @param pivot the pivot to set
	 */
	public void setPivot(int pivot) {
		this.pivot = pivot;
	}
}
