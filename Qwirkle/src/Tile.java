
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
	
		
		public final static Colour red = new Colour(1, "red");
		public final static Colour orange = new Colour(2, "orange");
		public final static Colour yellow = new Colour(3, "yellow");
		public final static Colour green = new Colour(4, "green");
		public final static Colour blue = new Colour(5, "blue");
		public final static Colour purple = new Colour(6, "purple");
		
		public final static Shape circle = new Shape(1, "circle");
		public final static Shape x = new Shape(2, "x");
		public final static Shape diamond = new Shape(3, "diamond");
		public final static Shape square = new Shape(4, "square");
		public final static Shape star = new Shape(5, "star");
		public final static Shape cross = new Shape(6, "cross");		
		
		public final static Tile tile1 = new Tile(red, circle);
		public final static Tile tile2 = new Tile(red, x);
		public final static Tile tile3 = new Tile(red, diamond);
		public final static Tile tile4 = new Tile(red, square);
		public final static Tile tile5 = new Tile(red, star);
		public final static Tile tile6 = new Tile(red, cross);
		public final static Tile tile7 = new Tile(orange, circle);
		public final static Tile tile8 = new Tile(orange, x);
		public final static Tile tile9 = new Tile(orange, diamond);
		public final static Tile tile10 = new Tile(orange, square);
		public final static Tile tile11 = new Tile(orange, star);
		public final static Tile tile12 = new Tile(orange, cross);
		public final static Tile tile13 = new Tile(yellow, circle);
		public final static Tile tile14 = new Tile(yellow, x);
		public final static Tile tile15 = new Tile(yellow, diamond);
		public final static Tile tile16 = new Tile(yellow, square);
		public final static Tile tile17 = new Tile(yellow, star);
		public final static Tile tile18 = new Tile(yellow, cross);
		public final static Tile tile19 = new Tile(green, circle);
		public final static Tile tile20 = new Tile(green, x);
		public final static Tile tile21 = new Tile(green, diamond);
		public final static Tile tile22 = new Tile(green, square);
		public final static Tile tile23 = new Tile(green, star);
		public final static Tile tile24 = new Tile(green, cross);
		public final static Tile tile25 = new Tile(blue, circle);
		public final static Tile tile26 = new Tile(blue, x);
		public final static Tile tile27 = new Tile(blue, diamond);
		public final static Tile tile28 = new Tile(blue, square);
		public final static Tile tile29 = new Tile(blue, star);
		public final static Tile tile30 = new Tile(blue, cross);
		public final static Tile tile31 = new Tile(purple, circle);
		public final static Tile tile32 = new Tile(purple, x);
		public final static Tile tile33 = new Tile(purple, diamond);
		public final static Tile tile34 = new Tile(purple, square);
		public final static Tile tile35 = new Tile(purple, star);
		public final static Tile tile36 = new Tile(purple, cross);
			
	
}
