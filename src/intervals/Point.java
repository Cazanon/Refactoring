package intervals;

public abstract class Point {
	
	private double value;
	
	Point(double value) {
		this.value = value;
	}

	public abstract boolean lessThan(double value);
	public abstract boolean greaterThan(double value);

	public abstract boolean lessThan(Point point);
	public abstract boolean greaterThan(Point point);
	
	public abstract boolean lessThan(ClosedPoint point);
	public abstract boolean greaterThan(ClosedPoint point);
	
	public abstract boolean lessThan(OpenedPoint point);
	public abstract boolean greaterThan(OpenedPoint point);
	
	public abstract boolean included();
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
