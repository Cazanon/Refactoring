package intervals;

public abstract class Point {
	
	private double value;
	
	Point(double value) {
		this.value = value;
	}

	public abstract boolean lessThan(Point value);
	
	public abstract boolean greaterThan(Point value);
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
