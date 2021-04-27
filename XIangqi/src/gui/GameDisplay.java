package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import config.GameConfig;
import engine.plateau.Block;
import engine.map.Map;
import engine.mobile.Aircraft;
import engine.mobile.Bomb;
import engine.mobile.Enemy;
import engine.mobile.Missile;
import engine.plateau.Plateau;
import engine.process.MobileElementManager;

/**
 * Copyright SEDAMOP - Software Engineering
 * 
 * @author tianxiao.liu@cyu.fr
 *
 */
public class GameDisplay extends JPanel {


	private Plateau plateau;
	
	//private MobileElementManager manager;

	//private PaintStrategy paintStrategy = new PaintStrategy();
	
	public GameDisplay(Plateau plateau) {
		this.plateau = plateau;
		
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

//		paintStrategy.paint(map, g);
		
		int blockSize = GameConfig.BLOCK_SIZE;
		Block[][] blocks = plateau.getBlocks();

		for (int lineIndex = 0; lineIndex < plateau.getLineCount(); lineIndex++) {
			for (int columnIndex = 0; columnIndex < plateau.getColumnCount(); columnIndex++) {
				Block block = blocks[lineIndex][columnIndex];

				if ((lineIndex + columnIndex) % 2 == 0) {
					g.setColor(Color.GRAY);
					g.fillRect(block.getColumn() * blockSize, block.getLine() * blockSize, blockSize, blockSize);
				}
			}
		}

	}

	public Block getBombPosition(int x, int y) {  // x et y sont des pixels
		//retourne la case correspondante à la zone définis par ces pixels 
		int line = y / GameConfig.BLOCK_SIZE;
		int column = x / GameConfig.BLOCK_SIZE;
		//  return map.getBlock(line, column);
	}

}
