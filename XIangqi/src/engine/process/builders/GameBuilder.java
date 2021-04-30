package engine.process.builders;

import engine.board.Board;
import engine.board.*;
import engine.pieces.*;
import engine.process.factories.*;
import engine.process.repositories.BlackPiecesRepository;
import engine.process.repositories.PiecesRepository;
import engine.process.repositories.RedPiecesRepository;
import engine.process.PiecesManager;

/**
 * Build the game,without players yet
 * @author etudiant
 */
public class GameBuilder {
	static BlackPiecesRepository blackPiecesRepository =  BlackPiecesRepository.getInstance();
	static RedPiecesRepository redPiecesRepository = RedPiecesRepository.getInstance();
	static PiecesRepository piecesRepository = PiecesRepository.getInstance();
	
	public static PiecesManager buildInitPieces(Board board) {
	    
		PiecesManager manager = new PiecesManager(board);
		
		intializeTopSideRoi(board, manager);
		intializeTopSideChariot(board, manager);
		return manager;
	}
	
	private static void intializeTopSideRoi(Board board, PiecesManager manager){
		Block block = board.getBlock(0,5);
		Roi topSideRoi= PiecesFactory.createRoi(block, "topSideRoi","red",null);
		redPiecesRepository.register(topSideRoi);
		
	}

	private static void intializeTopSideChariot(Board board, PiecesManager manager){
		Block block = board.getBlock(0,0);
		Chariot topSideLeftChariot= PiecesFactory.createChariot(block, "topSideLeftChariot","red",null);
		redPiecesRepository.register(topSideLeftChariot);	
	}
	/*
	public static void main(String[] args) {
		Board board = BoardBuilder.buildBoard();
		PiecesManager manager= GameBuilder.buildInitPieces(board);
		
		RedPiecesRepository reposit = RedPiecesRepository.getInstance();
		
		Block block = new Block(0,5);
		Roi topSideRoi= PiecesFactory.createRoi(block, "Roi","red",null);
	 

		reposit.register(topSideRoi);
		
		System.out.println(reposit.getPiece(block).getName());
	}
*/
}
