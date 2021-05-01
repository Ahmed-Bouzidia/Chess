package engine.process.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import engine.board.Block;
import engine.pieces.Piece;
import engine.pieces.Roi;
import engine.process.factories.PiecesFactory;

/**
 * This class reperesents the red pieces uses in the game
 * This class implements the Repository interface
 * This class use the Singleton pattern
 * @author etudiant
 */
public class RedPiecesRepository implements Repository {
	
	//private HashMap<Block,Piece> redPieces = new HashMap<Block,Piece>();
	private HashMap<String,Piece> redPiecesName = new HashMap<String,Piece>();
	
	private static List<Piece> redPieces = new ArrayList<Piece>();

	private static RedPiecesRepository instance = new RedPiecesRepository();
	
	
	private RedPiecesRepository() {
		
	} 
	
	public static  RedPiecesRepository getInstance() {
		return instance;
	}
	
	
	/**
	 *Register a piece with it's current position
	 */
	@Override
	public void register(Piece piece) {
		// TODO Auto-generated method stub
		Block piecePosition = piece.getBlock();
	//	this.redPieces.put(piecePosition,piece);
		this.redPieces.add(piece);
		String name = piece.getName();
		this.redPiecesName.put(name, piece);

	}

	/**
	 *method check if there is a piece in the given position
	 *If there is no piece that means the piece does'nt exist 
	 */
	@Override
	public Piece getPiece(Block block) {
		Iterator it =this.redPieces.iterator();
		while(it.hasNext()) {
			Piece currentPiece =(Piece) it.next();
			if(currentPiece.getBlock().equals(block)) {
				//this.redPieces.put(newPosition, currentPiece);
				return currentPiece;
			//	Piece newPiece = currentPiece;
				//redPieces.merge(newPosition, currentPiece, null);
				//this.register(currentPiece);
			}
		}
		return null;
	}
	//public Piece getPiece(Block block) {
		    
		    //redPieces.indexOf(arg0)
			//return redPieces.get(block); // il retourne sa positon
//	}

	public Piece getPiece(String name) {
		Collection<Piece> redPiecesCollection = this.redPiecesName.values();
		//Collection<Block> redPiecesBlock = this.redPieces.keySet();	
		for(Piece currentPiece: redPiecesCollection) {
			if(name.equals(currentPiece.getName())) {
				return currentPiece;
			}
		}
		return null;
	}
	
	public void setPosition(Piece piece,Block newPosition) {
		//this.redPieces.put(newPosition,piece);
		//Collection<Piece> redPiecesCollection = this.redPieces.values();
		/*for(Piece currentPiece: redPiecesCollection) {
			if(piece.equals(currentPiece)) {
				//this.redPieces.put(newPosition, currentPiece);
				currentPiece.setPosition(newPosition);
			//	Piece newPiece = currentPiece;
				//redPieces.merge(newPosition, currentPiece, null);
				//this.register(currentPiece);
			}
		}*/
		Iterator it =this.redPieces.iterator();
		while(it.hasNext()) {
			Piece currentPiece =(Piece) it.next();
			if(piece.equals(currentPiece)) {
				//this.redPieces.put(newPosition, currentPiece);
				currentPiece.setPosition(newPosition);
			//	Piece newPiece = currentPiece;
				//redPieces.merge(newPosition, currentPiece, null);
				//this.register(currentPiece);
			}
		}
	  //this.redPieces.put(newPosition,newPiece);
	}
	
	/*
	public static void main(String[] args) {
		RedPiecesRepository reposit = RedPiecesRepository.getInstance();
		Block block = new Block(0,5);
		Roi topSideRoi= PiecesFactory.createRoi(block, "Roi","red",null);
	 

		reposit.register(topSideRoi);
		
		System.out.println(reposit.getPiece(block).getName());
	}
	*/

}
