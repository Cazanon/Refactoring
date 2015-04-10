package intervals;

public class Point {
	
	private double value;
	
	Point(double value) {
		this.value = value;
	}

	public boolean lessThan(double value){
		return this.value < value;
	}
	
	public boolean greaterThan(double value){
		return this.value > value;
	}
	
	public boolean lessOrEqualsThan(double value){
		return this.value <= value;
	}
	
	public boolean greaterEqualsThan(double value){
		return this.value >= value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
