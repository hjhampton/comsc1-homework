import java.util.Random;

public class Dice {

	public Random rand = new Random();
	public String name;
	public int value;
	public int output;

	Dice(){
		//initialization
	}

	Dice(String newName, int newValue){
		name = newName;
		value = newValue;
	}

	public int rollDie() {

		output = rand.nextInt(value) + 1;
		return output;
	}
	public void printRoll() {
		System.out.println("You rolled a " + rollDie());
	}

	public void printName() {
		System.out.println("Name: " + name);
	}

	public void printMaxValue() {
		System.out.println("Max Value: " + value);
	}
}
