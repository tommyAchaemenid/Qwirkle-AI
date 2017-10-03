import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		generateBag();
		createGrid();
		
		
		// testing validity
		/*grid.get(1).get(1).setColour(Tile.tile1.getColour());
		grid.get(1).get(1).setShape(Tile.tile1.getShape());
		grid.get(1).get(2).setColour(Tile.tile2.getColour());
		grid.get(1).get(2).setShape(Tile.tile2.getShape());
		grid.get(1).get(3).setColour(Tile.tile3.getColour());
		grid.get(1).get(3).setShape(Tile.tile3.getShape());
		//grid.get(2).get(3).setColour(Tile.tile21.getColour());
		//grid.get(2).get(3).setShape(Tile.tile21.getShape());
		grid.get(3).get(3).setColour(Tile.tile27.getColour());
		grid.get(3).get(3).setShape(Tile.tile27.getShape());
		
		if (isValidCheck(Tile.tile21, 2, 3)){
			System.out.println("Valid location");
		}
		else {
			System.out.println("invalid location");
		}
		*/
		
	    // testing ordering 
		/*
		Player human1 = new Player(1, "human1", 5, new ArrayList<Tile>());
		Player human2 = new Player(2, "human2", 7, new ArrayList<Tile>());
		Player human3 = new Player(2, "human3", 9, new ArrayList<Tile>());
		
		players.add(human1);
		players.add(human2);
		players.add(human3);
		
		givePlayerTiles(human1, 6);
		givePlayerTiles(human2, 6);
		givePlayerTiles(human3, 6);
		
		System.out.println(players.get(0).getPlayerName());
		System.out.println(printTiles(human1.getCurrentTiles()));
		System.out.println(players.get(1).getPlayerName());
		System.out.println(printTiles(human2.getCurrentTiles()));
		System.out.println(players.get(2).getPlayerName());
		System.out.println(printTiles(human3.getCurrentTiles()));
	
		assignOrder();
		
		System.out.println("");
		System.out.println(players.get(0).getPlayerName());
		System.out.println(players.get(1).getPlayerName());
		System.out.println(players.get(2).getPlayerName()); */
		
		// testing end turn
	/*	printCurrentPlayer();
		endTurn();
		printCurrentPlayer();
		endTurn();
		printCurrentPlayer();
		endTurn();
		printCurrentPlayer();
		endTurn();
		printCurrentPlayer();
		endTurn();
		printCurrentPlayer();
		endTurn();
		printCurrentPlayer();  */
		
		//testing giving tiles and swapping tiles
	  /*  Player karim = new Player(1, "karim", 0, new ArrayList<Tile>());
	    givePlayerTiles(karim, 6);
	    
	    System.out.println(printTiles(karim.currentTiles));
		
	    ArrayList<Integer> indexes = new ArrayList<Integer>();
	    indexes.add(1);
	    indexes.add(2);
	    indexes.add(3);
	    
	    swapTiles(karim, indexes);
	    System.out.println(printTiles(karim.currentTiles));
	    */
		
		// testing giving random tiles
	/*	Tile newRandom = giveRandomTile();
		grid.get(2).get(2).setColour(newRandom.getColour());
		grid.get(2).get(2).setShape(newRandom.getShape()); */

	  //  printGrid();
		
	}
	
	public static ArrayList<Tile> bag = new ArrayList<Tile>();
	public static List<ArrayList<Tile>> grid = new ArrayList<ArrayList<Tile>>();
	public static ArrayList<Player> players = new ArrayList<Player>();
	public static int currentTurn = 0;
	
	// blah blah hhgkdhkgjhdfgfgdfgd
	// method to assign who plays first based initially on who has the best possible combo and if they have the same score then by who was added first to the list of players
	public static void assignOrder(){
		int b=3;
		int[] scores = new int[players.size()]; 	
		
		for (int i = 0; i < players.size(); i++){
			
			int maxColourCombo = 0;
			int maxShapeCombo = 0; 
			
			for (int j = 0; j < 6; j++){
				
				int currentColourCombo = 0;
				int currentShapeCombo = 0;
				
				for (int k = 0; k < 6; k++){
						
								if (players.get(i).getCurrentTiles().get(j).getColour().getIdColour() == players.get(i).getCurrentTiles().get(k).getColour().getIdColour()){
									currentColourCombo++;
								}
								if (players.get(i).getCurrentTiles().get(j).getShape().getIdShape() == players.get(i).getCurrentTiles().get(k).getShape().getIdShape()){
									currentShapeCombo++;						
								}
								if(players.get(i).getCurrentTiles().get(j).getColour().getIdColour() == players.get(i).getCurrentTiles().get(k).getColour().getIdColour() &&
										players.get(i).getCurrentTiles().get(j).getShape().getIdShape() == players.get(i).getCurrentTiles().get(k).getShape().getIdShape()){
									currentColourCombo--;
									currentShapeCombo--;
								}
										
				}
				
				if ( currentColourCombo > maxColourCombo){
					maxColourCombo = currentColourCombo + 1;
				}
				if ( currentShapeCombo > maxShapeCombo){
					maxShapeCombo = currentShapeCombo + 1;
				}
							
			}
			
			if(maxColourCombo >= maxShapeCombo){
				scores[i] = maxColourCombo;
			}
			else{
				scores[i] = maxShapeCombo;
			}
			
		}

		ArrayList<Player> buffer = new ArrayList<Player>();
			
		for(int a = 0; a < players.size(); a++){
			
			int max = 0; 
			int maxIndex = 0;
			
			for(int b = 0; b < players.size(); b++){
						
				if(scores[b] > max){
					max = scores[b];
					maxIndex = b;
				}
					
			}
			
			buffer.add(players.get(maxIndex));
			scores[maxIndex] = -1;
		}
		
		for(int g = 0; g < buffer.size(); g++){
			players.remove(0);	
		}
		
		for(int x = 0; x < buffer.size(); x++){
			players.add(buffer.get(x));
		}
	}
	
	// method that takes in a tile and its row and column and outputs if it the place you want to add it to is valid or not by boolean
	public static boolean isValidCheck(Tile inputTile, int row, int column){
		
		if (grid.get(row).get(column).getColour() != null){
			
			return false;
		}
		
		int checkRowPlus = row;
		int checkRowMinus = row;
		int checkColumnPlus = column;
		int checkColumnMinus = column;
		
		while (grid.get(checkRowPlus + 1).get(column).getColour() != null){
			
			if (grid.get(checkRowPlus + 1).get(column).getColour().getIdColour() == inputTile.getColour().getIdColour() &&
					grid.get(checkRowPlus + 1).get(column).getShape().getIdShape() == inputTile.getShape().getIdShape()){
				return false;
			}
			else{
				checkRowPlus++;
			}
		}
		
		while (grid.get(checkRowMinus - 1).get(column).getColour() != null){
			
			if (grid.get(checkRowMinus - 1).get(column).getColour().getIdColour() == inputTile.getColour().getIdColour() && 
					grid.get(checkRowMinus - 1).get(column).getShape().getIdShape() == inputTile.getShape().getIdShape()){
				return false;
			}
			else{
				checkRowMinus--;
			}
		}
		
		while (grid.get(row).get(checkColumnPlus + 1).getColour() != null){
			
			if (grid.get(row).get(checkColumnPlus + 1).getColour().getIdColour() == inputTile.getColour().getIdColour() &&
					grid.get(row).get(checkColumnPlus + 1).getShape().getIdShape() == inputTile.getShape().getIdShape()){
				return false;
			}
			else{
				checkColumnPlus++;
			}
		}
		
		while (grid.get(row).get(checkColumnMinus - 1).getColour() != null){
			
			if (grid.get(row).get(checkColumnMinus - 1).getColour().getIdColour() == inputTile.getColour().getIdColour() &&
					grid.get(row).get(checkColumnMinus - 1).getShape().getIdShape() == inputTile.getShape().getIdShape()){
				return false;
			}
			else{
				checkColumnMinus--;
			}
		}
			
		return true;
	}
	
	// method that prints who the current player is in the command line
	public static void printCurrentPlayer(){
		
		System.out.println("Current player: " + players.get(currentTurn).getPlayerName());
		
	}
		
	// method that returns the current player so that you can perform functions on him
	public static Player currentPlayer(){
	
		return players.get(currentTurn);
		
	}
	
	// method that ends the turn of the current player and moves the current turn to the next in the list
	public static void endTurn(){
	
		if (currentTurn == players.size() - 1){
		   
			currentTurn = 0;
		}
		else { 
			currentTurn++;
		}
	}
	
	// method that allows you to swap a players tiles with random tiles in the bag it takes the player and a list of the indices of the tiles it wants to swap as input, list must be in order from smallest to largest
	public static void swapTiles(Player player, ArrayList<Integer> indexesOfTiles){
		
		ArrayList<Tile> buffer = new ArrayList<Tile>();
		
		if(indexesOfTiles.size() > player.currentTiles.size() || indexesOfTiles.size() > bag.size()){
			
		}
		else {
			
			for (int i = 0; i < indexesOfTiles.size(); i++){
				
				buffer.add(player.currentTiles.get(indexesOfTiles.get(i)));
				
			}
			
			for (int i = 0; i < indexesOfTiles.size(); i++){
				
				player.currentTiles.remove(indexesOfTiles.get(i) - i);
				
			}
			
			for (int i = 0; i < indexesOfTiles.size(); i++){
	
				player.currentTiles.add(giveRandomTile());
	
			}
			
			for (int i = 0; i < buffer.size(); i++){
				
				bag.add(buffer.get(i));
	
			}
			
		}
		
	}
	
	// method that gives a player the amount of tiles you specify and if there is not enough the bag it gives the remainder 
	public static void givePlayerTiles(Player player, int numberOfTiles){
				
		if(numberOfTiles <= bag.size()){
			
			for (int i = 0; i < numberOfTiles; i++){
			
				player.currentTiles.add(giveRandomTile());
				
			}
			
		}
		else {
			
			for (int i = 0; i < bag.size(); i++){
				
				player.currentTiles.add(giveRandomTile());
				
			}
			
		}
		
	}
	
	// method that creates a 100 by 100 grid of null tiles 
	public static void createGrid(){
		
		for (int i = 0; i < 100; i ++){	
			
			grid.add(new ArrayList<Tile>());
			
			for (int j = 0; j < 100; j++){
			
						grid.get(i).add(new Tile(null, null));
			}
		}
		
	}
	
	// method that prints the grid contents and if a space is empty it prints empty location
	public static void printGrid(){
		
		for (int i = 0; i < 100; i ++){
			for (int j = 0; j < 100; j++){
			
				if (grid.get(i).get(j).getColour() == null){
					System.out.print("empty location, ");
				}
				else {
					String toPrint = new String();
					toPrint = grid.get(i).get(j).getColour().getIdentifier() + " " + grid.get(i).get(j).getShape().getIdentifier() + ", ";
					int length = toPrint.length();
					for (int k = 0; k < (16 - length); k++){
						toPrint = toPrint + " ";
					}
				    System.out.print(toPrint);
				}
			}
			System.out.println("");
		}
		
	}
	
	// method that creates the "bag" which contains 3 of each tile
	public static void generateBag(){
		
		for (int i = 0; i < 3; i++){
			
			bag.add(Tile.tile1);
			bag.add(Tile.tile2);
			bag.add(Tile.tile3);
			bag.add(Tile.tile4);
			bag.add(Tile.tile5);
			bag.add(Tile.tile6);
			bag.add(Tile.tile7);
			bag.add(Tile.tile8);
			bag.add(Tile.tile9);
			bag.add(Tile.tile10);
			bag.add(Tile.tile11);
			bag.add(Tile.tile12);
			bag.add(Tile.tile13);
			bag.add(Tile.tile14);
			bag.add(Tile.tile15);
			bag.add(Tile.tile16);
			bag.add(Tile.tile17);
			bag.add(Tile.tile18);
			bag.add(Tile.tile19);
			bag.add(Tile.tile20);
			bag.add(Tile.tile21);
			bag.add(Tile.tile22);
			bag.add(Tile.tile23);
			bag.add(Tile.tile24);
			bag.add(Tile.tile25);
			bag.add(Tile.tile26);
			bag.add(Tile.tile27);
			bag.add(Tile.tile28);
			bag.add(Tile.tile29);
			bag.add(Tile.tile30);
			bag.add(Tile.tile31);
			bag.add(Tile.tile32);
			bag.add(Tile.tile33);
			bag.add(Tile.tile34);
			bag.add(Tile.tile35);
			bag.add(Tile.tile36);
			
		}				
	}
	
	// method that returns a random tile from the bag
	public static Tile giveRandomTile(){
		
		double random =  Math.random()*bag.size();
		return bag.get((int) random);
			
	}
	
	// method that returns a string representing all the tiles in a given arraylist
	public static String printTiles(ArrayList<Tile> tiles){
		
		if(tiles.size() == 0){		
			return "empty arraylist";
		}
		
		String print = new String();
		print = "( " + tiles.get(0).getColour().getIdentifier() + " " + tiles.get(0).getShape().getIdentifier();
		
		for(int i = 1; i < tiles.size(); i++){
	     
			print = print + ", " + tiles.get(i).getColour().getIdentifier() + " " + tiles.get(i).getShape().getIdentifier();
		}
		
		return print + " )";	
	}
	

}


