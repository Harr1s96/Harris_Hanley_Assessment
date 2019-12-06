package Harris_Hanley_Assessment.Assessment;

import java.util.Random;

public class SwampArea {
	
	 private int[][] swampArea;
	 
	 //created after submission
	 private int exitPoint;
	
	public SwampArea(int i, int j) {
		
		this.swampArea = new int[i][j];
		
		int index = 0;
		
		for (int x = 0; x < this.swampArea.length; x++) {
			
			for (int y = 0; y < this.swampArea[x].length; y++) {
				
				this.swampArea[x][y] = index++;				
			}
		}
	}
	
	//created after submission
	public int getExitPoint() {
		
		Random rand = new Random();
		
		return this.exitPoint = rand.nextInt(100);
	}
	
	public double getExitPointDistance(int num) {
		
//		if (randVal == 0) {
//			this.getExitPointDistance(num);
//		}
		
		double distance = 0.0;
		
		for (int i = 0; i < this.swampArea.length; i++) {
			
			for (int j = 0; j < this.swampArea[i].length; j++) {
				
				if (this.swampArea[i][j] == this.exitPoint) {
					
					for (int k = 0; k < this.swampArea.length; k++) {
						
						for (int l = 0; l < this.swampArea[k].length; l++) {
							
							if (this.swampArea[k][l] == num) {
								
								double x = i - k;
								double y = j - l;
								
								distance = Math.hypot(x, y);
							}
						}
					}	
				}
			}
			
		}
		return distance;

	}
}
	
//		public double getNewDistance(int num) {
//			
//			for (int i = 0; i < SwampArea.swampArea.length; i++) {
//				
//				for (int j = 0; j < SwampArea.swampArea[i].length; j++) {
//					
//					if (SwampArea.swampArea[i][j] == num) {
//						
//						
//						
//					}
//				}
//			}
//			
//			
//		}
	
	
	
//	public int getDistance(int i, int j) {
//		
//		int coords = 0;
//		
//		coords = this.swampArea[i][j];
//		
//		coords = (String) val;
//		
//		return coords;
//	}
	
