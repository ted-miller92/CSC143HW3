import java.awt.Color;
import java.awt.Graphics;

public class HShape extends AbstractShape {
	
	public HShape() {	// take some parameters (like size)
		level = 1;
		maxLevel = 6;
		color = Color.green;
		children = new AbstractShape[7];
		// set the level, maxLevel, in abstract shape 
	}
	
	public void draw(Graphics g) {
		
	}
	
	public void update(int value) {
		
	}
}
