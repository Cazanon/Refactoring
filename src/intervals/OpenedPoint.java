package intervals;

public class OpenedPoint extends Point{

	OpenedPoint(double value) {
		super(value);
	}

	public boolean lessThan(double value){
		return this.getValue() < value;
	}
	
	public boolean greaterThan(double value){
		return this.getValue() > value;
	}
	
}
