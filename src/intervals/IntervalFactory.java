package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening) {
		case BOTH_OPENED:
			return new BothOpenedInterval(minimum,maximum,opening);
		case LEFT_OPENED:
			return new LeftOpenedInterval(minimum,maximum,opening);
		case RIGHT_OPENED:
			return new RightOpenedInterval(minimum,maximum,opening);
		case UNOPENED:
			return new UnOpenedInterval(minimum,maximum,opening);
		default:
			return null;
		}
	}
}
