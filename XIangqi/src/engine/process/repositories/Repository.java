package engine.process.repositories;

import engine.board.Block;
import engine.pieces.Piece;

/**
 * @author etudiant_bouzidia
 */
public interface Repository {
	
void register(Piece piece);

Piece getPiece(Block bock);

}