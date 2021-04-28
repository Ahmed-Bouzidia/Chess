package engine.board;

/**
 * The main class of the game
 * All elements of this package are added to this element
 * All elemnts of this package repose on this element
 * @author etudiant
 */
public class Board {
private Side topSide; 
private Side bottomSide;
private River river;

private Block[][] blocks;
private int lineCount;
private int columnCount;


/**
 * @param lineCount total number of line
 * @param columnCount total number of column
 * @param topSide the top Side
 * @param bottomSide the bottom side
 * @param river a river
 */
public Board(int lineCount, int columnCount,Side topSide,Side bottomSide,River river) {
	this.lineCount = lineCount;
	this.columnCount = columnCount;
	this.topSide=topSide;
	this.bottomSide=bottomSide;
	this.river=river;
	blocks = new Block[lineCount][columnCount];

	for (int lineIndex = 0; lineIndex < lineCount; lineIndex++) {
		for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
			blocks[lineIndex][columnIndex] = new Block(lineIndex, columnIndex);
		}
	}
}

public Boolean isOnTopSide(Block block) {
	return this.topSide.isOnSide(block);
}

public Boolean isOnBottomSide(Block block) {
//	return this.bottomSide.isOnBottomSide(block);
	return this.bottomSide.isOnSide(block);
}

public Boolean isOnRiver(Block block) {
	return this.river.isOnRiver(block);
}

public Boolean isOnTopPalace(Block block) {
	Palace palace= this.topSide.getPalace();
	return palace.isOnPalace(block);	
}

public Boolean isOnBottomPalace(Block block) {
	Palace palace= this.bottomSide.getPalace();
	return palace.isOnPalace(block);	
}
public Side getTopSide() {
	return this.topSide;
}
public Side getBottomSide() {
	return this.bottomSide;
}
}
