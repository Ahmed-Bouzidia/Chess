package engine.board;

/**
 * River divide the board game on into parts
 * It's situated on the line 6 AND column[from 0 to 10]
 * @author etudiant_bouzidia
 */
public class River {
	/**
	 * Riviere se trouve sur plusieur BLock
	 */
	private int riverLineIndex;
	private Block[][] riverBlocks;
	
	/**
	 * Constructor: creates a new River instance
	 * @param riverLineIndex: the line on wich the River is.
	 */
	public River(int riverLineIndex) {
		this.riverLineIndex=riverLineIndex;
		initBlocks();
	}
	
	public void initBlocks(){
		this.riverBlocks= null;
	}
	
	public void setBlocks(Block[][] riverBlocks) {
		this.riverBlocks=riverBlocks;
	}
	public Block[][] getBlocks() {
		return this.riverBlocks;
	}
	public Boolean isOnRiver(Block block) {
		int blockLineIndex = block.getLine();
		return (blockLineIndex == this.riverLineIndex); 
	}
	public int getRiverLineIndex() {
		return riverLineIndex;
	}
}
