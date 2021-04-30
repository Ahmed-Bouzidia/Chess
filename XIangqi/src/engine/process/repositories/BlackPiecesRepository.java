package engine.process.repositories;

import java.util.HashMap;

import engine.board.Block;
import engine.pieces.Piece;
import engine.pieces.Roi;
import engine.process.factories.PiecesFactory;

/**
 * This class reperesents the black pieces uses in the game
 * This class implements the Repository interface
 * This class use the Singleton pattern
 * @author etudiant
 */
public class BlackPiecesRepository implements Repository {
	
	private HashMap<Block,Piece> blackPieces = new HashMap<Block,Piece>();
	private HashMap<String,Piece> blackPiecesName = new HashMap<String,Piece>();
	private static BlackPiecesRepository instance= new BlackPiecesRepository();
	
	private  BlackPiecesRepository() {
	}
	
	public static BlackPiecesRepository getInstance() {
		return instance;
	}
	

	/**
	 *Register a piece with it's current position
	 */
	@Override
	public void register(Piece piece) {
		// TODO Auto-generated method stub
		Block piecePosition = piece.getBlock();
		this.blackPieces.put(piecePosition,piece);
		String name = piece.getName();
		this.blackPiecesName.put(name, piece);
	}


	/**
	 *method check if there is a piece in the given position
	 *If there is no piece that means the piece does'nt exist 
	 */
	@Override
	public Piece getPiece(Block block) {
			return blackPieces.get(block); // il retourne sa positon
	}
	
	public Piece getPiece(String name) {
		return blackPiecesName.get(name);
	}
	/*
	public static void main(String[] args) {
		BlackPiecesRepository reposit = BlackPiecesRepository.getInstance();
		Block block = new Block(0,5);
		Roi topSideRoi= PiecesFactory.createRoi(block, "topSideRoi","black",null);
	 

		reposit.register(topSideRoi);
		
		System.out.println(reposit.getPiece(block).getName());
	}
	*/
}
