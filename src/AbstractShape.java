import java.awt.Color;

public abstract class AbstractShape implements Shape {

	protected int level;
	protected int maxLevel;
	protected AbstractShape[] children;
	protected Color color;
	
	
	// adds a level to this shape
	@Override
	public boolean addLevel() {
		return false;
	}
	
	// removes a level from this shape
	@Override
	public boolean removeLevel() {
		return false;
	}
	
	// returns the total number of shapes in this shape
	@Override
	public int countShapes() {
		return 0;
	}
}