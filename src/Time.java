
public class Time {

	private long milliseconds;
	private long seconds = 0;
	private long minutes = 0;
	private long hours = 0;
	private long remainder = 0;
	
	Time(){
		//initialization
	}
	
	Time(long newMilliseconds){
		milliseconds = newMilliseconds;
	}
	
	public long findSeconds() {
		seconds = remainder / 1000;
		return seconds;
	}
	
	public long findMinutes() {
		minutes = remainder / 60000;
		remainder = remainder % 60000;
		return minutes;
	}
	
	public long findHours() {
		hours = milliseconds / 3600000;
		remainder = milliseconds % 3600000;
		return hours;
	}
	
	public void displayTime() {
		System.out.println(findHours() + " hours " + findMinutes() + " minutes " + findSeconds() + " seconds ");
	}
}
