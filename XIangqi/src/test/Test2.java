package test;


import engine.process.builders.*;
import engine.board.*;

public class Test2 {
	
	public static void main(String[] args) {

		BoardBuilder boardBuilder = new BoardBuilder();


        Board board;

        board = boardBuilder.buildBoard();
        

		Block block = new Block(6,0);
		System.out.println("\n is on top side" + board.isOnTopSide(block));
		System.out.println("\n is on bottom side?" + board.isOnBottomSide(block));
		System.out.println("\n is on river?" + board.isOnRiver(block));
		System.out.println("\n is on bottom palace?" + board.isOnBottomPalace(block));
		System.out.println("\\Pieces color?" + board.getBottomSide().getPiecesColor());
		System.out.println("\\Pieces color?" + board.getTopSide().getPiecesColor());


}
}