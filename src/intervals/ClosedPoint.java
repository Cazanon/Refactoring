package intervals;

public class ClosedPoint extends Point{

	ClosedPoint(double value) {
		super(value);
	}

	public boolean lessThan(Point point){
		return this.getValue() <= point.getValue();
	}
	
	public boolean greaterThan(Point point){
		return this.getValue() >= point.getValue();
	}
	
}
