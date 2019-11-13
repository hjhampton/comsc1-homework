//used https://www.mathsisfun.com/numbers/percentage-change.html
//for help with the math

public class Stock {

	private double yesterdayPrice = 0;
	private double currentPrice = 0;
	private double change = 0;
	
	Stock(){
		//initializtion
	}
	
	Stock(double closingPrice, double price){
		
		yesterdayPrice = closingPrice;
		currentPrice = price;	
	}
	
	public void getStockInfo() {
		System.out.println("Closing Price: " + yesterdayPrice);
		System.out.println("Current Price: " + currentPrice);
	}
	
	public double calculatePercentChange() {
		double difference = (yesterdayPrice - currentPrice);
		double percent = ((difference / yesterdayPrice) * 100);
		return percent;
	}
	
}
