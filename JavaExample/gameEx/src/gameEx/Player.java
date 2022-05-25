package gameEx;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		this.level = new BegginerLevel();
		this.level.showLevel();
	}
	
	public PlayerLevel getLevel() {
		return this.level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevel();
	}
	
	public void play(int count) {
		this.level.go(count);
	}
}
