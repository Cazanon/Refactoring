package intervals;

public abstract class Point {
	
	private double value;
	
	Point(double value) {
		this.value = value;
	}

	public abstract boolean lessThan(double value);
	
	public abstract boolean greaterThan(double value);
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
