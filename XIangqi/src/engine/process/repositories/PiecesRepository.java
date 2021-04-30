package engine.process.repositories;

import engine.board.Block;
import engine.pieces.Piece;

/**
 * This class all pieces used in the game
 * It contains an BlackPiecesRepostory and a RedPiecesRepository
 * This class implements the Repository interface
 * This class use the Singleton pattern
 * @author etudiant
 */

public class PiecesRepository implements Repository {
    private static BlackPiecesRepository blackPiecesRepository= BlackPiecesRepository.getInstance();
    
    private static RedPiecesRepository redPiecesRepository= RedPiecesRepository.getInstance();
	
    private static PiecesRepository piecesInstance = new PiecesRepository();
    
    private PiecesRepository() {}
    
    public static PiecesRepository getInstance() {
		return piecesInstance;
	}
	
    @Override
	public void register(Piece piece) {
		// TODO Auto-generated m
    	String color = piece.getColor();
    	
    	if (color.equals("black")){
    		blackPiecesRepository.register(piece);
    	}
    	else if(color.equals("red")) {
    		redPiecesRepository.register(piece);
    	}

	}

	@Override
	public Piece getPiece(Block block) {
		// TODO Auto-generated method stub
		if(blackPiecesRepository.getPiece(block) != null) {
			return blackPiecesRepository.getPiece(block);
		}
		else {
			if(redPiecesRepository.getPiece(block) != null) {
				return redPiecesRepository.getPiece(block);
			}
					else {
						return null;
					}
		}
	}

}
