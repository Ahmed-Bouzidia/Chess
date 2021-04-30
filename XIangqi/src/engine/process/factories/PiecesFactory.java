package engine.process.factories;

import engine.board.Block;
import engine.pieces.MovementArea;
import engine.pieces.*;
/**
 * This class uses the simple factory pattern
 * It creates instance of the classes contained in the pieces pacage
 * @author etudiant_bouzidia
 */
public class PiecesFactory {
	
public static Bombarde creatBombarde(Block block, String name, String color, MovementArea movementArea) {
	return new Bombarde(block,name,color,movementArea);
}

public static  Chariot createChariot(Block block, String name, String color, MovementArea movementArea) {
	return new Chariot(block,name,color,movementArea);
}

public static Cheval createCheval(Block block, String name, String color, MovementArea movementArea) {
	return new Cheval(block,name,color,movementArea);
}

public static Elephant createElephant(Block block, String name, String color, MovementArea movementArea) {
	return new Elephant(block,name,color,movementArea);
}

public static Garde createGarde(Block block, String name, String color, MovementArea movementArea) {
	return new Garde(block,name,color,movementArea);
}

public static Roi createRoi(Block block, String name, String color, MovementArea movementArea) {
	return new Roi(block,name,color,movementArea);
}

public static Soldat createSoldat(Block block, String name, String color, MovementArea movementArea) {
	return new Soldat(block,name,color,movementArea);
}

}
