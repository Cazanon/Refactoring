package intervals;

public abstract class Interval {

	private Point minimum;
	private Point maximum;
	private Opening opening;

	public Interval(Point minimum, Point maximum, Opening opening) {		
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (maximum.getValue() + minimum.getValue()) / 2;
	}

	public boolean includes(double value){	
		return maximum.greaterThan(value) && minimum.lessThan(value);		
	}

	public boolean includes(Interval interval){	
		
		 
		
		
		
		
		if(minimum.in(interval.getMinimum().getValue()) 		&&
		   minimum.lessThan(interval.getMinimum().getValue())	&&		
		   maximum.in(interval.getMaximum().getValue()) 		&&
		   maximum.greaterThan(interval.getMaximum().getValue())){
			return true;
		}
		return false;
	}

	public abstract boolean intersectsWith(Interval interval);

	@Override
	public String toString() {
		return minimum + "" + maximum;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

	public Point getMinimum() {
		return minimum;
	}

	public void setMinimum(Point minimum) {
		this.minimum = minimum;
	}

	public Point getMaximum() {
		return maximum;
	}

	public void setMaximum(Point maximum) {
		this.maximum = maximum;
	}

	public Opening getOpening() {
		return opening;
	}

	public void setOpening(Opening opening) {
		this.opening = opening;
	}

}
