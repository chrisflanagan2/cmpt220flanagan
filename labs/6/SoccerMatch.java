package lab6;
import java.util.Date;

public class SoccerMatch {
	private Date startTime;
	private Date endTime;
	private String location;
	private String home;
	private String visitor;
	private Player[] homePlayers = new Player[11];
	private Player[] visitorPlayers = new Player[11];
	private Goal[] homeGoals = new Goal[10];
	private Goal[] visitorGoals = new Goal[10];
	private int homeGoalCount;
	private int visitorGoalCount;
	
	public SoccerMatch() {
		this.startTime = null;
		this.endTime = null;
		this.location = "";
		this.home = "";
		this.visitor = "";
	}
	public SoccerMatch(Date start, Date end, String location, String home, String visitor) {
		this.startTime = start;
		this.endTime = end;
		this.location = location;
		this.home = home;
		this.visitor = visitor;
		this.homeGoalCount = 0;
		this.visitorGoalCount = 0;
		
	}
	public void addHomePlayer(Player p) {
		homePlayers[homePlayers.length +1] = p;
		
	}
	public void addVisitorPlayer(Player p) {
		visitorPlayers[visitorPlayers.length +1] = p;
	}
	public void addHomeGoal(Goal g) {
		homeGoals[homeGoalCount] = g;
		homeGoalCount++;
	}
	public void addVisitorGoal(Goal g) {
		visitorGoals[visitorGoalCount] = g;
		visitorGoalCount++;
	}
	public Goal[] getHomeGoals() {
		return homeGoals;
	}
	public Goal[] getVisitorGoals() {
		return visitorGoals;
	}
	public String getWinner() {
		if (homeGoalCount > visitorGoalCount) {
			return home;
		}
		if (homeGoalCount < visitorGoalCount) {
			return visitor;
		}
		return "Tie";
	}
	
	
}
