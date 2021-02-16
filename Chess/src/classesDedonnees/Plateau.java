package classesDedonnees;

import java.util.HashMap;
/**
 * @author bouzidia
 * this class represent a "Plateau" its the main table of the game on which "pio" move
 * @version 27-01-2021
 */
public class Plateau {
	
	/**
	 *@author bouzidia
	 *riviere is an instance of the class "Riviere"
	 *it separate the opposite parts of the "Plateau"
	 */
	private Riviere riviere;
	
	/**
	 * @author bouzidia
	 * cases is an ArrayList of Case: int contains all "case" of the "Plateau",of the game
	 */
	private ArrayList<Case> cases;
	
	/**
	 * @author bouzidia
	 * palaisRouge : is an instance of the class "Palais" it represent the part colored on yellow in the specification document
	 */
	private Palais palaisRouge;
	
	/**
	 * @author bouzidia
	 * palaisNoir is an instance of the class "Palais" it represent the second part of the Palais which also colored in yellow
	 * We have to add this attribut to the UML
	 */
	private Palais palaisNoir;
	
	 /**
	 * pions is HashMap of Pions, key of the map  is the name of the pion and the value is it's position  
	 */
	private HashMap<Pion> pions; // liste des pions, key = nom de pions , value = position private /**
	
	/**
	 *Plateau is a constructor : it creates a new Plateau with all components  
	 */
	public Plateau() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @author bouzidia
	 * axeX is a method proposed by Salim
	 * 
	 */
	void axeX() {
		
	}
	
	/**
	 * @author bouzidia
	 * axeY is a method proposed by Salim
	 */
	void axeY() {
		
	}

}
