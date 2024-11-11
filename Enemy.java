
public class Enemy {
	private double hp;
	private int doubloons;
	private Weapon weapon;
	private String name;

	public Enemy(double hp, int doubloons, Weapon weapon, String name) {
		this.hp = hp;
		this.doubloons = doubloons;
		this.weapon = weapon; // new Weapon("Fists", 1);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void damageDone(double damage) {

		hp = hp - damage;
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

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
