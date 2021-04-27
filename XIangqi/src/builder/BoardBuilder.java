package builder;

import board.Board;
import board.Palace;
import board.River;
import board.Side;
import config.BoardConfig;
import config.PalaceConfig;
import config.SideConfig;

/**
 * This class creates an empy gameboard without pieces
 * It use the build pattern
 * All parameters nedded in the compilation  are extracted from the config package
 * @author etudiant_bouzidia
 *
 */
public class BoardBuilder {

public BoardBuilder() {
	
}

public Board buildBoard() {
	Board emptyBoard;
	
	Palace topPalace = new Palace(PalaceConfig.TOP_SIDE_PALACE_TOP_BORDER,PalaceConfig.TOP_SIDE_PALACE_BOTTOM_BORDER,
			PalaceConfig.TOP_SIDE_PALACE_RIGHT_BORDER,PalaceConfig.TOP_SIDE_PALACE_LEFT_BORDER);
	
		Side topSide= new Side("top","red",topPalace,SideConfig.TOP_SIDE_TOP_BORDER,SideConfig.TOP_SIDE_BOTTOM_BORDER,
				SideConfig.TOP_SIDE_RIGHT_BORDER,SideConfig.TOP_SIDE_LEFT_BORDER);
	
	
	
	Palace bottomPalace = new Palace(PalaceConfig.BOTTOM_SIDE_PALACE_TOP_BORDER,PalaceConfig.BOTTOM_SIDE_PALACE_BOTTOM_BORDER,
			PalaceConfig.BOTTOM_SIDE_PALACE_RIGHT_BORDER,PalaceConfig.BOTTOM_SIDE_PALACE_LEFT_BORDER);
	
		Side bottomSide= new Side("bottom","black",bottomPalace,SideConfig.BOTTOM_SIDE_TOP_BORDER,SideConfig.BOTTOM_SIDE_BOTTOM_BORDER,
				SideConfig.BOTTOM_SIDE_RIGHT_BORDER,SideConfig.BOTTOM_SIDE_LEFT_BORDER);
		
	
	
	River river = new River(BoardConfig.RIVER_LINE_INDEX);
	
	emptyBoard= new Board(BoardConfig.LINE_COUNT,BoardConfig.COLUMN_COUNT,topSide,bottomSide,river);

	return emptyBoard;
}

}
