package Harris_Hanley_Assessment.Assessment;

import java.util.Random;

public class Player {
	
	private int playerStartPoint;
		
	public Player() {
		
		Random rand = new Random();
		
		//this.playerStartPoint = SwampArea.swampArea[i][j];
		this.playerStartPoint = rand.nextInt(100);
	}
	
	
	public int getPlayerStartingPoint() {
		
		return this.playerStartPoint;
	}
	
	//not functional
	public int moveDirection(String direction) {
		
		int d = 0;
		Random rand = new Random();
		
		switch (direction) {
		
			case "North":
				d = rand.nextInt(10);
				this.playerStartPoint += d;
				break;
				
			case "South":
				d = rand.nextInt(10);
				this.playerStartPoint += d;
				break;
				
			case "East":
				d = rand.nextInt(10);
				this.playerStartPoint += d;
				break;
			
			case "West":
				d = rand.nextInt(10);
				this.playerStartPoint += d;
				break;
					
		}
		return this.playerStartPoint;
	}
		
}
