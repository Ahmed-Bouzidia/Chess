package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;

import config.GameConfig;
import engine.plateau.Plateau;

/**
 * This class represents the main gui of the game
 * @author bouzidia
 *
 */
public class MainGUI extends JFrame{
	private final static Dimension preferredSize = new Dimension(GameConfig.WINDOW_WIDTH, GameConfig.WINDOW_HEIGHT);

	private Plateau plateau = new Plateau(1,1);

	private GameDisplay dashboard;
	
	public MainGUI(String title) {
		super(title);
		init();
	}

	private void init() {

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());


		JTextField textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		
		dashboard = new GameDisplay(plateau);

		contentPane.add(dashboard, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//pack();
		setVisible(true);
	//	setPreferredSize(preferredSize);
		//setResizable(false);
	}

	
	
}
