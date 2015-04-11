package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening) {
		case BOTH_OPENED:
			return new Interval(new OpenedPoint(minimum),new OpenedPoint(maximum),opening);
		case LEFT_OPENED:
			return new Interval(new OpenedPoint(minimum),new ClosedPoint(maximum),opening);
		case RIGHT_OPENED:
			return new Interval(new ClosedPoint(minimum),new OpenedPoint(maximum),opening);
		case UNOPENED:
			return new Interval(new ClosedPoint(minimum),new ClosedPoint(maximum),opening);
		default:
			return null;
		}
	}
}
