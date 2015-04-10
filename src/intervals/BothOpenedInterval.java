package intervals;

public class BothOpenedInterval extends Interval{

	public BothOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean intersectsWith(Interval interval) {
        if(this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        if(this.getMaximum() == interval.getMinimum()) {
            return false;
        }
        return this.includes(interval.getMinimum().getValue()) || this.includes(interval.getMaximum().getValue());
    }

}
