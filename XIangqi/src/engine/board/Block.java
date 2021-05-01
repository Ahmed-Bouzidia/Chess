package engine.board;

import engine.pieces.Piece;

public class Block {
	/**
	 *Class that represents a Block(case) its the main element of the board game 
	 *@author etudiant_bouzidia
	 */
	
	private int line;
	private int column;
	
	public Block(int line, int column) {
		this.line = line;
		this.column = column;
	}
	
	public int getLine() {
		return line;
	}
	
	public int getColumn() {
		return column;
	}
	
	@Override
	public String toString() {
		return "Block [line=" + line + ", column=" + column + "]";
	}
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj != null) {
			if (obj instanceof Block) {
				Block block = (Block) obj;
				//Two contacts are equal when they have the same name, number and email.
				
					if (block.getColumn() == column && block.getLine() == line) {
						return true;
					}
				}
			
		}
		return false;
	}

}
