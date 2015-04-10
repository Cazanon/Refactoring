package intervals;

public class BothOpenedInterval extends Interval{

	public BothOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value){
		Point point = new OpenedPoint(value);
		return point.greaterThan(getMinimum()) && point.lessThan(getMaximum());
	}

	@Override
	public boolean intersectsWith(Interval interval) {
        if(this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        if(this.getMaximum() == interval.getMinimum()) {
            return false;
        }
        return this.includes(interval.getMinimum()) || this.includes(interval.getMaximum());
    }
	
	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getMinimum());
		boolean maximumIncluded = this.includes(interval.getMaximum());
		switch (interval.getOpening()) {
		case BOTH_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case LEFT_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded);
		case RIGHT_OPENED:
			return (minimumIncluded)
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case UNOPENED:
			return (minimumIncluded) && (maximumIncluded);
		default:
			assert false;
			return false;
		}
	}
	
}
