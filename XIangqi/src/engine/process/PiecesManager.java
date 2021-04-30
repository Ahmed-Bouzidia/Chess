package engine.process;


import engine.board.Block;
import engine.board.*;
import engine.pieces.*;
import engine.process.*;
import engine.process.repositories.BlackPiecesRepository;
import engine.process.repositories.PiecesRepository;
import engine.process.repositories.RedPiecesRepository;

/**
 * This class manages the pieces
 * Pour l'instant je gere le Roi du coté en haut uniquement
 * @author etudiant
 */
public class PiecesManager {
	private static BlackPiecesRepository blackPiecesRepository =  BlackPiecesRepository.getInstance();
	public static RedPiecesRepository redPiecesRepository = RedPiecesRepository.getInstance();
	public static PiecesRepository piecesRepository = PiecesRepository.getInstance();
	/**
	 * An empty board
	 * */
	Board board;
	
	public PiecesManager(Board board) {
		this.board=board;
	}
	
	Board getBoard() {
	     return this.board;
	}
	
	public void moveRightRoi(Piece piece,Block block) {
		redPiecesRepository.setPosition(piece, block);
	}
	
	public Roi getTopSideRoi(){
		Roi roi;
		
			roi =(Roi) redPiecesRepository.getPiece("topSideRoi");
		return roi;
	}
	//je veux changer la position d'une piece rouge 
	
	
}
