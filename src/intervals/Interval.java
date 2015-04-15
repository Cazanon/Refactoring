package intervals;

public class Interval {

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
		return minimum.lessThan(interval.getMinimum()) && maximum.greaterThan(interval.getMaximum());
	}

	public boolean intersectsWith(Interval interval){
		if(minimum.getValue() == interval.getMaximum().getValue()){
			return minimum.included() && interval.getMaximum().included();
		}
		if(maximum.getValue() == interval.getMinimum().getValue()){
			return maximum.included() && interval.getMinimum().included();
		}
		return includes(interval.getMinimum().getValue()) || includes(interval.getMaximum().getValue()); 
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public boolean equals(Object object) {
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
