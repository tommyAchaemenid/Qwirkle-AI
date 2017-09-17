
public class Colour {

	public Colour(int id, String colour){
		
		idColour = id;
		identifier = colour;
		
	}
	
	int idColour;
	String identifier;
	
	
	public int getIdColour() {
		return idColour;
	}
	public void setIdColour(int idColour) {
		this.idColour = idColour;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
}
