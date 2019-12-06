package Harris_Hanley_Assessment.Assessment;

import java.util.Scanner;
 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SwampArea playSpace = new SwampArea(10, 10);
    	Player myPlayer = new Player();
    	Scanner scan = new Scanner(System.in);
    	
    	while (true) {
    		
    		System.out.println("The dial reads " + playSpace.getExitPointDistance(myPlayer.getPlayerStartingPoint()) + "m");
    		String input = scan.nextLine();
    		
    		if (input.equals("North")) {
    			myPlayer.moveDirection(input);
    			playSpace.getExitPointDistance(myPlayer.getPlayerStartingPoint());
    		}
    		else if (input.equals("South")) {
    			myPlayer.moveDirection(input);
    			playSpace.getExitPointDistance(myPlayer.getPlayerStartingPoint());
    			
    		}
    		else if (input.equals("East")) {
    			myPlayer.moveDirection(input);
    			playSpace.getExitPointDistance(myPlayer.getPlayerStartingPoint());
    		}
    		else if (input.equals("West")) {
    			myPlayer.moveDirection(input);
    			playSpace.getExitPointDistance(myPlayer.getPlayerStartingPoint());
    		}
   
    	}
    	
    }
}
