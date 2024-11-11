
public class TheWizard {
	private double hp;
	private int doubloons;
	private int luck;
	private Weapon weapon;
	
public TheWizard() {
	this.hp = 100;
	this.doubloons = 0;
	this.luck = 10;
	this.weapon = new Weapon("Fists", 1);
}

public void damageDone(int roll, String weapon) {
	double damage = 0;
//	if (weapon.equals("Fists")) {
//		damage = roll;
//		System.out.println("You land a punch, causing " + damage + "damage!");
//	}
//	if (weapon.equals("Shank")) {
//		damage = roll * 1.5;
//		System.out.println("You sneakily shank your enemy, causing " + damage + "damage!");
//	}
//	if (weapon.equals("Big Stick")){
//		damage = roll * 1.75;
//		System.out.println("You brutally club your enemy, causing " + damage + "damage!");
//	}	
//	if(weapon.equals("Sword")) {
//		damage = roll * 2;
//		System.out.println("You triumphantly slash your enemy, causing " + damage + "damage!");
//	}
//	if (weapon.equals("GuitarAxe")) {
//		damage = roll * 3;
//		System.out.println("You chop your enemy for " + damage + "damage!");
//	}
//	if (weapon.equals("Sword Of A Thousand Truths")) {
//		damage = roll * 1000000;
//		System.out.println("You utterly disintegrate your enemy, causing " + damage + "damage!");
//	}
//	
	this.hp = hp - damage;
}

public double getHp() {
	return hp;
}

public void setHp(int hp) {
	this.hp = hp;
}

public int getDoubloons() {
	return doubloons;
}

public void setDoubloons(int doubloons) {
	this.doubloons = doubloons;
}

public int getLuck() {
	return luck;
}

public void setLuck(int luck) {
	this.luck = luck;
}

public Weapon getWeapon() {
	return weapon;
}

public void setWeapon(Weapon weapon) {
	this.weapon = weapon;
}
public void damageDone(double damage) {

	hp =  hp - damage;
}
}
