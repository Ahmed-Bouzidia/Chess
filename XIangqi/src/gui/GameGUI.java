package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import engine.board.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

 
import engine.board.Board;
import engine.pieces.Piece;
import engine.process.*;
import engine.process.builders.BoardBuilder;
import engine.process.builders.GameBuilder;
import engine.process.repositories.RedPiecesRepository;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 * This class represents the main gui of the game
 * @author bouzidia
 *
 */
public class GameGUI extends JFrame implements Runnable{
	public boolean modificationOccured = false;
	
	private static final long serialVersionUID = 1L;
	
	private GameGUI instance = this;

	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	private final static Dimension preferredSize = new Dimension(1195,screenSize.height);
	
	private PlayerTopGui playerTop = new PlayerTopGui();
	private PlayerBottomGui playerBottom = new PlayerBottomGui();
	
	
	public JTextField textField = new JTextField();
	
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
		contentPane.add(textField, BorderLayout.SOUTH);
		
		//BoardBuilder boardBuilder = new BoardBuilder();
		this.board = BoardBuilder.buildBoard();
		PiecesManager manager = GameBuilder.buildInitPieces(board);
		
		dashboard = new GameDisplay(board,manager);
		contentPane.add(dashboard, BorderLayout.CENTER);
		dashboard.addMouseListener(new MouseControls());
		
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
	
	private class MouseControls implements MouseListener {

		Piece currentPiece;
		@Override
		//java Graphics ça marche avec les pixels,
		public void mouseClicked(MouseEvent e) {
			/*
			 int x = (e.getX() / 60);//récuperer le pixel sur lequel on a cliqué avec la souris, le x par rapport au JPanel
			
			int y = (e.getY() / 60);//récuperer le pixel sur lequel on a cliqué avec la souris, le y par rapport au JPanel

			
			int clickedLine=y; 
			int clickedColumn=x;
			
			Block currentBlock = board.getBlock(clickedLine, clickedColumn);
			
			//Piece currentPiece = PiecesManager.piecesRepository.getPiece(currentBlock);
			RedPiecesRepository reposit = RedPiecesRepository.getInstance();

			Piece currentPiece = reposit.getPiece(currentBlock);
			
			Block newPos = new Block(clickedLine, clickedColumn + 1);
			
			reposit.setPosition(currentPiece, newPos);
			//reposit.setPosition(, newPos);   
			//manager.moveRightRoi(currentPiece, newPos);
	        //manager.moveRightRoi(currentPiece,board.getBlock(clickedLine, clickedColumn +1));
	        
			String name = currentPiece.getName();
  			
			playerTop.setName(name);
			

		    modificationOccured = true;
			Thread thread = new Thread(instance);
			thread.start();
		*/
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = (e.getX() / 60);//récuperer le pixel sur lequel on a cliqué avec la souris, le x par rapport au JPanel
			
			int y = (e.getY() / 60);//récuperer le pixel sur lequel on a cliqué avec la souris, le y par rapport au JPanel

			
			int clickedLine=y; 
			int clickedColumn=x;
			
			Block currentBlock = board.getBlock(clickedLine, clickedColumn);
			
			//Piece currentPiece = PiecesManager.piecesRepository.getPiece(currentBlock);
			RedPiecesRepository reposit = RedPiecesRepository.getInstance();

			 currentPiece = reposit.getPiece(currentBlock);
			/*
			 * 
			 
			Block newPos = new Block(clickedLine, clickedColumn + 1);
			
			reposit.setPosition(currentPiece, newPos);
			//reposit.setPosition(, newPos);   
			//manager.moveRightRoi(currentPiece, newPos);
	        //manager.moveRightRoi(currentPiece,board.getBlock(clickedLine, clickedColumn +1));
	        
			String name = currentPiece.getName();
  			
			playerTop.setName(name);
		
		*/
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			int x = (e.getX() / 60);//récuperer le pixel sur lequel on a cliqué avec la souris, le x par rapport au JPanel
			
			 int y = (e.getY() / 60);//récuperer le pixel sur lequel on a cliqué avec la souris, le y par rapport au JPanel
			int clickedLine=y; 
			 int clickedColumn=x;
			
			Block newPos = new Block(clickedLine, clickedColumn );
			
			RedPiecesRepository reposit = RedPiecesRepository.getInstance();
			
			reposit.setPosition(currentPiece, newPos);
			
			modificationOccured = true;
			Thread thread = new Thread(instance);
			thread.start();
		}

		@Override
		public void mouseEntered(MouseEvent e) {

		} 

		@Override
		public void mouseExited(MouseEvent e) {

		}
	}

	public void run() {
		while (modificationOccured) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			 dashboard.repaint(); 
			 modificationOccured=false;
		}
	}
		
}
