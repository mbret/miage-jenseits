package Game;

import java.util.HashMap;
import java.util.Map;

import Areas.Area;
import Areas.ExcavationArea;
import Areas.TouristicArea;

public class Board {

	private PiecesStack piecesStack;
	private Area areas[];
	private Piece currentPiece;
	private int distances[][];
	
	public Board(){
		this.piecesStack = new PiecesStack();
		this.areas = new Area[12];
		
	}
	
	/**
	 * Initialization of areas
	 */
	public void initAreas(){
		
		Area londres = new TouristicArea(0,"Londres");
		Area paris = new TouristicArea(1,"Paris");
		Area berlin = new TouristicArea(2,"Berlin");
		Area rome = new TouristicArea(3,"Rome");
		Area vienne = new TouristicArea(4,"Vienne");
		Area varsovie = new TouristicArea(5,"Varsovie");
		Area moscou = new TouristicArea(6,"Moscou");
		
		Area grece = new ExcavationArea(7,"Grece","Orange");
		Area crete = new ExcavationArea(8,"Crete","Violet");
		Area egypte = new ExcavationArea(9,"Egypte","Jaune");
		Area palestine = new ExcavationArea(10,"Palestine","Vert");
		Area mesopotamie = new ExcavationArea(11,"Mesopotamie","Bleu");
		
		
		areas[0] = londres;
		areas[1] = paris;
		areas[2] = berlin;
		areas[3] = rome;
		areas[4] = vienne;
		areas[5] = varsovie;
		areas[6] = moscou;
		areas[7] = grece;
		areas[8] = crete;
		areas[9] = egypte;
		areas[10] = palestine;
		areas[11] = mesopotamie;
		
	}
	
	/**
	 *  Initialization of the distances
	 */
	public void initDistances(){
		
		this.distances = new int[][]{
				{0,1,1,2,2,2,3,3,3,4,4,4},	// londres
				{1,0,1,1,1,2,3,2,2,3,3,3},	// paris
				{1,1,0,2,2,1,2,2,3,3,4,4},	// berlin
				{2,1,2,0,1,2,3,1,1,2,2,2},	// rome
				{2,1,1,2,0,1,2,2,2,3,3,3},  // vienne
				{2,2,2,1,1,0,1,1,2,3,3,2},	// varsovie
				{3,3,3,2,2,1,0,2,3,4,4,3},	// moscou
				{3,2,1,2,2,1,2,0,1,2,2,1},	// grece
				{3,2,1,3,2,2,3,1,0,1,1,2},	// crete
				{4,3,2,4,3,3,4,2,1,0,1,2},	// egypte
				{4,3,4,4,3,3,4,2,1,1,0,1},	// palestine	
				{4,3,2,3,3,2,3,1,2,2,1,0},	// mesopotamie
				};
		
	}
	
	
	


	
}
