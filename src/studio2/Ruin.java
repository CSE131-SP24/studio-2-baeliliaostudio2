package studio2;

import java.util.Scanner;

public class Ruin 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money do you have: ");
		double startAmount = in.nextDouble();
		
		System.out.println("What's the probability that you win: ");
		double winChance = in.nextDouble();
		
		System.out.println("How much money for a successful day: ");
		double winLimit = in.nextDouble();
		
		double gamble = 1.00;
		int losses = 0;
		int days = 0;
		int rounds = 0;
	
		for (days = 0; days < 500; days++)
		{
			double currentAmount = startAmount;
			while (currentAmount >= 1.00 && currentAmount < winLimit)
			{
				double x = Math.random();
				rounds++;
				
				if (x <= winChance)
				{
					currentAmount++;
				}
				else
				{
					currentAmount--;
					losses++;
				}
			if (currentAmount == 0.00)
				{
				System.out.println("Simulation " + days + ": " + "LOSE");
				}
			else
				{
				System.out.println("Simulation " + days + ": " + "WIN");
				}
			}
		}
		System.out.println("Total Simulations: " + days);
		System.out.println("You've lost " + losses + " times.");
	}
}
		
