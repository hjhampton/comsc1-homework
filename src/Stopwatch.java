
public class Stopwatch {

	private long startTime = 0;
	private long endTime = 0;
	private long elapsed = 0;
	
	public long startTimer() {
		startTime = System.currentTimeMillis();
		return startTime;
	}
	
	public long endTimer() {
		endTime = System.currentTimeMillis();
		return endTime;
	}
	
	public void calculateElapsed() {
		elapsed = endTime - startTime;
		System.out.println(elapsed + " milliseconds");
		System.out.println(elapsed / 1000 + " seconds");
	}
	
	public void countToTen() {
		startTimer();
		
		if (System.currentTimeMillis() == startTimer() + 10000) {
			
	endTimer();
		}
	}
}
