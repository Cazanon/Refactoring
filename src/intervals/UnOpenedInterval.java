package intervals;

public class UnOpenedInterval extends Interval{

	public UnOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean includes(double value){
		return getMinimum() <= value && value <= getMaximum();		
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
