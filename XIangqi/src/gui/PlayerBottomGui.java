package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerBottomGui extends JPanel{
	private final Font font = new Font(Font.MONOSPACED, Font.BOLD, 30);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel nameLabel = new JLabel("Player name:");
	private JLabel nameField = new JLabel("");
	
	private JLabel colorLabel = new JLabel("Couleur de piece:");
	private JLabel colorField = new JLabel("");
	
	private JLabel sideLabel = new JLabel("Coté");
	private JLabel sideField = new JLabel("");
	
	private JLabel piecesLabel = new JLabel("Pièces");
	private JLabel piecesField = new JLabel("");
	
	private JLabel lostPiecesLabel = new JLabel("Pièces perdus");
	private JLabel lostPiecesField = new JLabel("");
	
public PlayerBottomGui() {
	init();
}

public void init() {
  
  this.setLayout(new GridLayout(5,2));
  this.add(nameLabel);
  this.add(nameField);
  
  this.add(sideLabel);
  this.add(sideField);
  
  this.add(colorLabel);
  this.add(colorField);
  
  this.add(lostPiecesLabel);
  this.add(lostPiecesField);
  
  this.add(piecesLabel);
  this.add(piecesField);
  
  this.setBackground(Color.BLACK);
  this.setFont(font);
}
public void setName(String name) {
	this.nameField.setText(name);
}

public void setColor(String color) {
	this.colorField.setText(color);
}

public void setSide(String side) {
	this.sideField.setText(side);
}

public void setPieces(String piecesListName) {
	this.piecesField.setText(piecesListName);
}

public void setLostPieces(String piecesListName) {
	this.lostPiecesField.setText(piecesListName);
}

}
