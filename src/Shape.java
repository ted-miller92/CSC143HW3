import java.awt.Graphics;

public interface Shape {
	
	// draws a shape
	void draw(Graphics g);
	
	// adds a level to this shape
	boolean addLevel();
	
	// removes a level from this shape
	boolean removeLevel();
	
	// returns the total number of shapes in this shape
	int countShapes();
	
	// modifies the shape in an interesting way given a range 0-100 (slider)
	void update(int value);
}
