package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter starting amount: ");
		int startAmount = in.nextInt();
		
		System.out.println("Enter win chance: ");
		double winChance = in.nextDouble();
		
		System.out.println("Enter win limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("Enter total simulations: ");
		int totalSimulations = in.nextInt();
		
		int initialStartAmount = startAmount;
		int numberOfLoops = 0;
		
		for(int i = 0; i < totalSimulations; i++)
		{
		
			
			
			
		while ((startAmount > 0) && (startAmount < winLimit))
		{
			
		double mathRandom = Math.random();
		
		if (mathRandom < winChance)
		{
			int gain = 1;
			startAmount++;
		}
		else 
		{
			int lose = -1;
			startAmount--;
		}
		numberOfLoops++;
		}
		
		
		
		System.out.println("Simulation: "+(i+1)+" "+numberOfLoops+" ");
	
		numberOfLoops = 0;
		startAmount = initialStartAmount;
		
		
		
		} //for loop 
	
	}

}
