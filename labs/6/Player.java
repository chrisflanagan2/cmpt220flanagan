package lab6;

public class Player {
	private String name;
	private int goals;
	private String team;
	
	public Player (){
		this.name = "";
		this.goals = 0;
		this.team = "";
	}
	public Player(String name, int goal, String team) {
		this.name = name;
		this.goals = goal;
		this.team = team;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void addGoal () {
		this.goals++;
	}

}
