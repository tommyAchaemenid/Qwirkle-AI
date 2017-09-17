
public class Tile {

	public Tile(Colour c, Shape s){
		
		colour = c;
		shape = s;
		
	}
	
	Colour colour; 
	Shape shape;
	
	
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	
	
}
