package intervals;

public class OpenedPoint extends Point{

	OpenedPoint(double value) {
		super(value);
	}
	
	@Override
	public boolean lessThan(double value){
		return this.getValue() < value;
	}
	
	@Override
	public boolean greaterThan(double value){
		return this.getValue() > value;
	}

	@Override
	public boolean greaterThan(Point point) {
		return point.greaterThan(this);
	}

	@Override
	public boolean lessThan(Point point) {
		return point.lessThan(this);
	}

	@Override
	public boolean lessThan(ClosedPoint point) {
		return this.getValue() >= point.getValue();
	}

	@Override
	public boolean greaterThan(ClosedPoint point) {
		return this.getValue() <= point.getValue();
	}

	@Override
	public boolean lessThan(OpenedPoint point) {
		return this.getValue() >= point.getValue();
	}

	@Override
	public boolean greaterThan(OpenedPoint point) {
		return this.getValue() <= point.getValue();
	}

	@Override
	public boolean included() {
		return false;
	}
	
}
