
public class Time {
	private int hours, mins;
	public Time(int h, int m) {
		hours = h; 
		mins=m;
	}
	private int toMins() {
		if(hours<=12) {
			return (hours*60)+mins;
		}
		else {
			return (((hours-12)*60)*2)+mins;
		}
	}
	public boolean lessThan(Time t) {
		if(this.hours > t.hours) {
			return false;
		}
		else {
			if(this.mins > t.mins)
				return false;
		}
		return true;
	}
	public int elapsedSince(Time t) {
		int t1 = this.toMins();
		int t2 = t.toMins();
		if(t2>t1) {
			
		}
	}
	public void toString() {
		System.out.println("Hours since ")
	}
}
