package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.JPanel;
import engine.board.*;
import java.awt.Container;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JTextField;

 
import engine.board.Board;
 
import engine.pieces.Roi;
import engine.process.PiecesManager;

/**
 *Display the game Board with pieces
 *@author etudiant_bouzidia
 */
public class GameDisplay extends JPanel {
	private Board board;
	private PiecesManager manager;
	
	private PaintStrategy paintStrategy = new PaintStrategy();
		
	public GameDisplay(Board board,PiecesManager manager) {
		this.board = board;
		this.manager=manager;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintStrategy.paint(board,g);
		
       //je vais récuperer la postion à partir de RedPiecesRepository
	   //Comment distinguer le roi ? par son nom
		//
		
		Roi roi = manager.getTopSideRoi();
		
		Block position = roi.getBlock();
		int blockSize = 60;

		int y = position.getLine();
		int x = position.getColumn();
		
		g.setColor(Color.YELLOW);
		
		g.drawLine(x * blockSize + blockSize / 2, y * blockSize, x * blockSize, (y + 1) * blockSize);
		g.drawLine(x * blockSize + blockSize / 2, y * blockSize, (x + 1) * blockSize, (y + 1) * blockSize);
		g.drawLine(x * blockSize + blockSize / 2, y * blockSize, x * blockSize + blockSize / 2, (y + 1) * blockSize);
	  
		//end of roi painting
       
}
}