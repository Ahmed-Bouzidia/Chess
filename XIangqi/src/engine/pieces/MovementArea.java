package engine.pieces;

import java.util.List;
import engine.board.*;

/**
 * This class represents the area of the game board allowed to a piece
 * It's composed of a list of Blocks on wich the piece can be putted
 * @author etudiant_bouzidia
 */
public class MovementArea {
	private List<Block> movementArea= null;
	private Block currentBlock;
	
	
	/**
	 * Construct a MovementArea for the current block
	 * @param currentBlock the block from wich we will calculate the movement area
	 */
	public MovementArea(Block currentBlock) {
		this.currentBlock=currentBlock;
	}
	
	public void setMovementArea(List<Block> movementArea) {
		this.movementArea=movementArea;
	}
	
	public List<Block> getMovementArea() {
		return this.movementArea;
	}
}
