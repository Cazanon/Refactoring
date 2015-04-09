package intervals;

public class BothOpened extends Interval{

	public BothOpened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		// TODO Auto-generated constructor stub
	}

	public boolean includes(double value){
		return getMinimum() < value && value < getMaximum();
	}

	public boolean intersectsWith(Interval interval) {
        if(this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        if(this.getMaximum() == interval.getMinimum()) {
            return false;
        }
        return this.includes(interval.getMinimum()) || this.includes(interval.getMaximum());
    }
	
}
