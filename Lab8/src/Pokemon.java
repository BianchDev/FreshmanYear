
public class Pokemon {
	
	private String name;
	private double weight;
	private int hp;
	private int attack;
	private int speed;
	
	public Pokemon(String name, double weight, int hp, int attack, int speed) {
		
		this.name = name;
		this.weight = weight;
		this.hp = hp;
		this.attack = attack;
		this.speed = speed;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public int getSpeed() {
		return this.speed;
	}

}
