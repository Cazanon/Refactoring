package intervals;

public class UnOpened extends Interval{

	public UnOpened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		// TODO Auto-generated constructor stub
	}

	public boolean includes(double value){
		return getMinimum() <= value && value <= getMaximum();		
	}

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
	
}
