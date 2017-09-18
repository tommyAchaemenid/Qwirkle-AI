import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		generateBag();
		createGrid();
		
	    Player karim = new Player(1, "karim", 0, new ArrayList<Tile>());
	    givePlayerTiles(karim, 6);
	    
	    System.out.println(printTiles(karim.currentTiles));
		
	    ArrayList<Integer> indexes = new ArrayList<Integer>();
	    indexes.add(1);
	    indexes.add(2);
	    indexes.add(3);
	    
	    swapTiles(karim, indexes);
	    System.out.println(printTiles(karim.currentTiles));
		
		//  Tile newRandom = giveRandomTile();
	//	grid.get(2).get(2).setColour(newRandom.getColour());
	//	grid.get(2).get(2).setShape(newRandom.getShape());

	    // printGrid();
		
	}
	
	public static ArrayList<Tile> bag = new ArrayList<Tile>();
	public static List<ArrayList<Tile>> grid = new ArrayList<ArrayList<Tile>>();
	
	
	
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
	
	
	public static void createGrid(){
		
		for (int i = 0; i < 100; i ++){	
			
			grid.add(new ArrayList<Tile>());
			
			for (int j = 0; j < 100; j++){
			
						grid.get(i).add(new Tile(null, null));
			}
		}
		
	}
		
	public static void printGrid(){
		
		for (int i = 0; i < 100; i ++){
			for (int j = 0; j < 100; j++){
			
				if (grid.get(i).get(j).getColour() == null){
					System.out.print("empty location, ");
				}
				else {
				 System.out.print(grid.get(i).get(j).getColour().getIdentifier() + " " + grid.get(i).get(j).getShape().getIdentifier() + ", ");
				}
			}
			System.out.println("");
		}
		
	}
	
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
	
	public static Tile giveRandomTile(){
		
		double random =  Math.random()*bag.size();
		return bag.get((int) random);
			
	}
	
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
