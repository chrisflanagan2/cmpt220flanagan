package lab6;

public class Goal {
	private int minute;
	private Player player;
	Goal(Player p, int minute){
		this.minute =minute;
		this.player =p;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
