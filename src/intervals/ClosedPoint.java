package intervals;

public class ClosedPoint extends Point{

	ClosedPoint(double value) {
		super(value);
	}

	public boolean lessThan(double value){
		return this.getValue() <= value;
	}
	
	public boolean greaterThan(double value){
		return this.getValue() >= value;
	}
	
	@Override
	public String toString(){
		return "["+this.getValue()+" ";
	}
	
}
