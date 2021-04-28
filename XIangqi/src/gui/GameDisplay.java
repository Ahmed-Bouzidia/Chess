package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;
import engine.board.Board;

 
 




/**
 *Display the game Board with pieces
 *@author etudiant_bouzidia
 */
public class GameDisplay extends JPanel {
	private Board board;
	private PaintStrategy paintStrategy = new PaintStrategy();
	
	
	public GameDisplay(Board board) {
		this.board = board;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintStrategy.paint(board,g);
}
}