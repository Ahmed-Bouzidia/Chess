package board;

/**
 * Class that represents one side of the game board
 * Side is defined by a piecesColor ,a Palace and blocks that support the Side
 * We have two Sides, they are speared by a River
 * @author etudiant_bouzidia
 */
public class Side{
	
private int topBorderLineIndex;
private int bottomBorderLineIndex;

private int leftBorderColumnIndex;
private int rightBorderColumnIndex; 

/**
 * The color of the pieces that are placed in this side
 * we have only two colors,black and red.
 */
private String piecesColor; 	


/**
 * We have two Side
 * one in the top,another one in the bottom
 */
private String position;


private Palace palace;

/**
 *Side est composé de plusieurs blocks
 */
private Block[][] sideBlocks;



 
/**
 * Consturctor: it creates a new Side of the Board
 * @param positon top or bottom
 * @param piecesColor black or red
 * @param palace an instante of the Palace Class
 * @param bottomBorderLineIndex the index of the line from wich start the Side
 * @param lineEndIndex The index of the line limit of the Side
 * @param leftBorderColumnIndex  The index of the first column of the Side
 * @param rightBorderColumnIndex The index of the Last column of the side
 * @param position 
 */
public Side( String position, String piecesColor,Palace palace,int topBorderLineIndex,int bottomBorderLineIndex,int rightBorderColumnIndex,
		int leftBorderColumnIndex) {
	
    this.position=position;
    this.bottomBorderLineIndex=bottomBorderLineIndex;
    this.leftBorderColumnIndex=leftBorderColumnIndex;
    this.rightBorderColumnIndex=rightBorderColumnIndex;
    this.topBorderLineIndex=topBorderLineIndex;   
    this.piecesColor=piecesColor;
    this.palace=palace;
	}

public String getPiecesColor() {
	return this.piecesColor;
}

public Palace getPalace() {
	return this.palace;
}

public Block[][] getBlocks() {
	return this.sideBlocks;
}

public String toString() {
	String results="\n";
	for(Block[] blockLine: sideBlocks){
		for(Block block: blockLine) {
			results +=block.toString() + " , ";
		}
		results +=" \n";
	}
	return results;
}

/**
 * This method checks either the block parameter is on the side or not
 * @param block : the block to check
 * @return
 */
public boolean isOnSide(Block block) {
	int blockLine=block.getLine();
	return blockLine <= this.bottomBorderLineIndex && blockLine >= this.topBorderLineIndex;
}
public Boolean isOnPalace(Block block) {
	Palace  palace = this.getPalace();
	
	return palace.isOnPalace(block);
}
}
