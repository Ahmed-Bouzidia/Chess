package engine.board;

/**
 * This class represents a palace
 * It's situated on the column [3,7] and line: [0,3] OR[9,12]
 * @author etudiant_bouzidia
 */
public class Palace {
	/**
	 * Palace se trouve sur plusieur BLock
	 */
	private Block[][] palaceBlocks;
	
	private int topBorderLineIndex;
	private int bottomBorderLineIndex;
	
	private int leftBorderColumnIndex;
	private int rightBorderColumnIndex; 

	/**
	 * @param borderTop the top border line index of the palace
	 * @param borderBottom the bottom border line index of the palace
	 * @param borderRight the right border column index of the palace
	 * @param borderLeft the left border column index of the palace
	 */
	public Palace(int borderTop,int borderBottom,int borderRight,int borderLeft) {
		this.topBorderLineIndex=borderTop;
		this.bottomBorderLineIndex=borderBottom;
		this.rightBorderColumnIndex=borderRight;
		this.leftBorderColumnIndex=borderLeft;
		initBlocks();
	}
	public void initBlocks(){
		this.palaceBlocks= null;
	}
	
	public void setBlocks(Block[][]palaceBlocks) {
		this.palaceBlocks=palaceBlocks;
	}
	
	public Block[][] getBlocks(){
		return palaceBlocks;
	}
	
	public boolean isOnPalace(Block block) {
		int blockLine=block.getLine();
		int blockColumn=block.getColumn();
		Boolean result;
		
        result =(blockLine <= this.bottomBorderLineIndex) && (blockLine >= this.topBorderLineIndex) && (blockColumn <= this.rightBorderColumnIndex)
				&& (blockColumn >= this.leftBorderColumnIndex);

        return result;
	}

public String toString() {
	String results="\n";
	for(Block[] blockLine: palaceBlocks){
		for(Block block: blockLine) {
			results +=block.toString() + " , ";
		}
		results +=" \n";
	}
	return results;
}
	
	public  int getTopBorderLineIndex() {
		return topBorderLineIndex;
	}
	
	public  int getBottomBorderLineIndex() {
		return  bottomBorderLineIndex;
	}
	
	public  int getLeftBorderColumnIndex(){
		return leftBorderColumnIndex;
	}
	
	public  int getRightBorderColumnIndex(){ 
		return rightBorderColumnIndex;
	}
}

