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

	@Override
	public boolean greaterThan(Point value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lessThan(Point value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lessThan(ClosedPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean greaterThan(ClosedPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lessThan(OpenedPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean greaterThan(OpenedPoint point) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
