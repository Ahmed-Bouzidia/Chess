package test;

import engine.board.*;
import config.*;

public class Test {

	
	public static void main(String[] args) {
		Palace topPalace = new Palace(PalaceConfig.TOP_SIDE_PALACE_TOP_BORDER,PalaceConfig.TOP_SIDE_PALACE_BOTTOM_BORDER,
				PalaceConfig.TOP_SIDE_PALACE_RIGHT_BORDER,PalaceConfig.TOP_SIDE_PALACE_LEFT_BORDER);
		
			Side topSide= new Side("top","red",topPalace,SideConfig.TOP_SIDE_TOP_BORDER,SideConfig.TOP_SIDE_BOTTOM_BORDER,
					SideConfig.TOP_SIDE_RIGHT_BORDER,SideConfig.TOP_SIDE_LEFT_BORDER);
		
		
		
		Palace bottomPalace = new Palace(PalaceConfig.BOTTOM_SIDE_PALACE_TOP_BORDER,PalaceConfig.BOTTOM_SIDE_PALACE_BOTTOM_BORDER,
				PalaceConfig.BOTTOM_SIDE_PALACE_RIGHT_BORDER,PalaceConfig.BOTTOM_SIDE_PALACE_LEFT_BORDER);
		
			Side bottomSide= new Side("bottom","black",bottomPalace,SideConfig.BOTTOM_SIDE_TOP_BORDER,SideConfig.BOTTOM_SIDE_BOTTOM_BORDER,
					SideConfig.BOTTOM_SIDE_RIGHT_BORDER,SideConfig.BOTTOM_SIDE_LEFT_BORDER);
			
		
		
		River river = new River(BoardConfig.RIVER_LINE_INDEX);
		
		Board board = new Board(BoardConfig.LINE_COUNT,BoardConfig.COLUMN_COUNT,topSide,bottomSide,river);
		
		System.out.println(board);
		
		Block block = new Block(6,0);
		System.out.println("\n is on top side" + board.isOnTopSide(block));
		System.out.println("\n is on bottom side?" + board.isOnBottomSide(block));
		System.out.println("\n is on river?" + board.isOnRiver(block));
		System.out.println("\n is on bottom palace?" + board.isOnBottomPalace(block));
		System.out.println("\\Pieces color?" + board.getBottomSide().getPiecesColor());
		System.out.println("\\Pieces color?" + board.getTopSide().getPiecesColor());
	}

}
