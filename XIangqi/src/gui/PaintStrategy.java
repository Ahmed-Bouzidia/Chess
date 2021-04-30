package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import engine.board.Block;
import engine.board.Board;


public class PaintStrategy {
	
/**
 * This method paint the board game
 * @param board the game board the praint
 * This component is constant(doesn't change while the games is running)
 */
public void paint(Board board,Graphics g) {
	
int	 blockSize =60;
Color color;
Color palaceColor=Color.GREEN;

	Block[][] blocks = board.getBlocks();
	int lineIndex=0;
    //paint the topSide
	for (lineIndex = 0; lineIndex <=board.getTopSide().getBottomBorderLineIndex(); lineIndex++) {
		for (int columnIndex = 0; columnIndex <= board.getTopSide().getRightBorderColumnIndex(); columnIndex++) {
			Block block = blocks[lineIndex][columnIndex];			
			if(board.getTopSide().getPiecesColor().equals("black")) {
				color = Color.black;
				palaceColor=Color.red;
			}
			else {
				color= Color.red;
				palaceColor=Color.black;
			}
			
			if ((lineIndex + columnIndex) % 2 == 0) {		
				g.setColor(color);
				g.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize);
			}
				
		}
	}
	//paint the top palace
	int x=board.getTopSide().getPalace().getLeftBorderColumnIndex();
	int y =board.getTopSide().getPalace().getTopBorderLineIndex();
	int a=board.getTopSide().getPalace().getRightBorderColumnIndex();
	int b=board.getTopSide().getPalace().getBottomBorderLineIndex();
	g.setColor(palaceColor);
	//dessiner la croix
	g.drawLine(x * blockSize , y * blockSize , a * blockSize + blockSize , b * blockSize + blockSize );
	g.drawLine(x * blockSize , b * blockSize  + blockSize , a * blockSize + blockSize , y * blockSize);
	//dessiner les bordures
	g.drawRect(x * blockSize, y * blockSize , 5 * blockSize , 4 * blockSize); 
	
	//paint the river
	lineIndex = board.getRiver().getRiverLineIndex();
	for(int columnIndex = 0; columnIndex < board.getColumnCount(); columnIndex++) {
		Block block = blocks[lineIndex][columnIndex];
		g.setColor(Color.blue);
		g.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize);
	}
	
	//paint the bottom side
	for (lineIndex = board.getBottomSide().getTopBorderLineIndex(); lineIndex <=board.getBottomSide().getBottomBorderLineIndex(); lineIndex++) {
		for (int columnIndex = 0; columnIndex <= board.getBottomSide().getRightBorderColumnIndex(); columnIndex++) {
			Block block = blocks[lineIndex][columnIndex];
			if(board.getBottomSide().getPiecesColor().equals("black")) {
				color = Color.black;
				palaceColor=Color.red;
			}
			else {
				color= Color.red;
				palaceColor=Color.black;
			}
			
			if ((lineIndex + columnIndex) % 2 == 0) {		
				g.setColor(color);
				g.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize);
			}
				
		}
	}
	//paint the bottom palace
	 x=board.getBottomSide().getPalace().getLeftBorderColumnIndex();
	 y =board.getBottomSide().getPalace().getTopBorderLineIndex();
	 a=board.getBottomSide().getPalace().getRightBorderColumnIndex();
	 b=board.getBottomSide().getPalace().getBottomBorderLineIndex();
	g.setColor(palaceColor);
	//dessiner la croix
	g.drawLine(x * blockSize , y * blockSize , a * blockSize + blockSize , b * blockSize + blockSize );
	g.drawLine(x * blockSize , b * blockSize  + blockSize , a * blockSize + blockSize , y * blockSize);
	//dessiner les bordures
	g.drawRect(x * blockSize, y * blockSize , 5 * blockSize , 4 * blockSize); 

}
}
