import java.util.Random;

public class Weapon {
	private double damageMult;
	private String name;
	
	
	public Weapon(String type, double damageMult) {
		this.name = type;
		this.damageMult = damageMult;
	}
	
	public double getDamageMult() {
		
		return damageMult;
	}
	public void setDamageMult(double damageMult) {
		this.damageMult = damageMult;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private int diceRoller() {
		Random dice = new Random();
		int diceRoll = dice.nextInt(10)+1;
		return diceRoll;
	}
	public double damage() {
		int roll = diceRoller();
		System.out.println(" Rolled a " + roll + " for damage");
		return roll * damageMult;
	}
	public String attackString(double damage) {
		
		if (name.equalsIgnoreCase("fists")) {
			
			return(" punchs, causing " + damage + " damage!");
		}
		if (name.equalsIgnoreCase("Shank")) {
			
			return(" sneakily shanks, causing " + damage + " damage!");
		}
		if (name.equalsIgnoreCase("Big Stick")){
			
			return(" brutally clubs, causing " + damage + " damage!");
		}	
		if(name.equalsIgnoreCase("Sword")) {
			
			return("triumphantly slashs, causing " + damage + " damage!");
		}
		if (name.equalsIgnoreCase("Guitar Axe")) {
			
			return("chops for " + damage + " damage!");
		}
		if (name.equalsIgnoreCase("Sword Of A Thousand Truths")) {
			
			return("You uterrly disintegrate your enemy, causing " + damage + "damage!");
		}
		return null;
		
	}
	public String toString() {
		return name;
	}
}
