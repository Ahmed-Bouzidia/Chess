package engine.board;

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
}
