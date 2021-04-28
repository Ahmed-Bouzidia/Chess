package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;
import engine.board.Board;
import engine.process.*;
import engine.process.builders.BoardBuilder;
import java.awt.Toolkit;
/**
 * This class represents the main gui of the game
 * @author bouzidia
 *
 */
public class GameGUI extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	private final static Dimension preferredSize = new Dimension(1195,screenSize.height);
	
	private PlayerTopGui playerTop = new PlayerTopGui();
	private PlayerBottomGui playerBottom = new PlayerBottomGui();
	
//	private final static Dimension preferredSize = new Dimension(GameConfig.WINDOW_WIDTH, GameConfig.WINDOW_HEIGHT);
	/**
	 * The board to paint
	 * */
	private Board board;
	
	/**
	 * Manges the postion an movement of the pices on the board
	 * */
    private PiecesManager manager;
    
    /**
     * the game board
     * */
	private GameDisplay dashboard;
	
	public GameGUI(String title) {
		super(title);
		init();
		
	}

	private void init() {

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JTextField textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		
		BoardBuilder boardBuilder = new BoardBuilder();
		this.board = BoardBuilder.buildBoard();
		
		dashboard = new GameDisplay(board);
		contentPane.add(dashboard, BorderLayout.CENTER);
		
		playerTop.setName("Ahmed");
		playerBottom.setName("Messi");
		
		//players informations
		contentPane.add(playerTop,BorderLayout.EAST);
		contentPane.add(playerBottom,BorderLayout.WEST);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.setPreferredSize(preferredSize);
		this.setSize(getPreferredSize());
    	this.setVisible(true);
    	this.setLocationRelativeTo(null);
    	this.setResizable(false);
	}
	

	
	
}
