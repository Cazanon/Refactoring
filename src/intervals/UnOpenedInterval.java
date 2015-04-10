package intervals;

public class UnOpenedInterval extends Interval{

	public UnOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value){
		Point point = new ClosedPoint(value);
		return point.greaterThan(getMinimum()) && point.lessThan(getMaximum());	
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if(this.getMinimum() == interval.getMaximum()) {
			return interval.getOpening() == Opening.LEFT_OPENED || interval.getOpening() == Opening.UNOPENED;
		}
        if(this.getMaximum() == interval.getMinimum()) {
            return interval.getOpening() == Opening.RIGHT_OPENED
                    || interval.getOpening() == Opening.UNOPENED;
        }
        return this.includes(interval.getMinimum().getValue()) || this.includes(interval.getMaximum().getValue());

    }
	
	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getMinimum().getValue());
		boolean maximumIncluded = this.includes(interval.getMaximum().getValue());
		switch (interval.getOpening()) {
		case BOTH_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case LEFT_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case RIGHT_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case UNOPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		default:
			assert false;
			return false;
		}
	}
	
}
