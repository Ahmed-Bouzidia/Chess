package engine.pieces;

import engine.board.*;

/**
 * This class represents a Piece of the Xiangqi
 * @author etudiant
 */
public abstract class Piece {
	private String name;
	private Block position;
	private boolean eliminated=false;
	private String color;
	private MovementArea movementArea;
	
	
	/**
	 * Default constructor,creates a Piece with the following parameters
	 * @param block : the block on wich the Piece is placed
	 * @param name the name of the Piece
	 * @param color the color of the piece
	 * @param movementArea list of blocks on which the piece can move
	 */
	public Piece(Block block,String name,String color,MovementArea movementArea) {
		this.position=block;
		this.name=name;
		this.color=color;
		this.movementArea=movementArea;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Block getBlock() {
		return this.position;
	}
	
	public void setPosition(Block block) {
		this.position=block;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setElimanation(Boolean eliminated) {
		this.eliminated=eliminated;
	}
	
	public MovementArea getMoveemntArea() {
		return this.movementArea;
	}
	
	/**
	 * @param movementArea the movement area changes every time that the piece change position
	 */
	public void setMovementArea(MovementArea movementArea) {
		this.movementArea=movementArea;
	}
	public String getColor() {
		return this.color;
	}
	public boolean isEliminated() {
		return this.eliminated;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj != null) {
			if (obj instanceof Piece) {
				Piece piece = (Piece) obj;
				//Two contacts are equal when they have the same name, number and email.
				if (piece.getName() != null && piece.getBlock() != null
						&& piece.getColor() != null) {
					if (piece.getName().equals(name)
							&& piece.getBlock().equals(position)
							 ) {
						return true;
					}
				}
			}
		}
		return false;
	}

	
}
