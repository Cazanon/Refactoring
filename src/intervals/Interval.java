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

	public abstract boolean includes(double value);

	public abstract boolean includes(Interval interval);

	public abstract boolean intersectsWith(Interval interval);

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

	public double getMinimum() {
		return minimum.getValue();
	}

	public void setMinimum(double minimum) {
		this.minimum.setValue(minimum);
	}

	public double getMaximum() {
		return maximum.getValue();
	}

	public void setMaximum(double maximum) {
		this.maximum.setValue(maximum);
	}

	public Opening getOpening() {
		return opening;
	}

	public void setOpening(Opening opening) {
		this.opening = opening;
	}

}
