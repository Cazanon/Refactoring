package intervals;

public class RightOpenedInterval extends Interval{

	public RightOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean intersectsWith(Interval interval) {
        if(this.getMinimum() == interval.getMaximum()) {
            return interval.getOpening() == Opening.LEFT_OPENED || interval.getOpening() == Opening.UNOPENED;
        }
        if(this.getMaximum() == interval.getMinimum()) {
            return false;
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
					&& (maximumIncluded);
		case RIGHT_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval.getMaximum());
		case UNOPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded);
		default:
			assert false;
			return false;
		}
	}
	
}
