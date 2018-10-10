import java.util.Random;
import java.util.Scanner;

public class DiceRolllerApp {

	public static int randomRollDice(int rollDiceno)//method which takes no of sides from user
	{
		Random rand = new Random();
		
		int d= rand.nextInt(rollDiceno)+1;//random number generator add 1 so we dont get zero 
		return d;
	
		
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to the Grand Circus Casino!");
		char c='y';
		int x,e,s=0;
		do
		{
			s++;//counter for each roll
		System.out.println("How many sides should each dice have? ");
		Scanner scr = new Scanner(System.in);
		int noOfSides= scr.nextInt();
		System.out.println("Roll "+s);

		
			x= randomRollDice(noOfSides);//method call for dice no 1 
			 System.out.println(x);
			 
			e= randomRollDice(noOfSides);//method call for dice no 2 
	         System.out.println(e);
	         if(x==1 &&e==1)
	         {
	        	 System.out.println("Snake eyes");
	         }
	         else if (x==6 && e==6)
	         {
	        	 System.out.println("box cars");
	         }
	         
		System.out.println("Roll again? (y/n)");
	      c = scr.next().charAt(0);
	
		}while(c=='y');
		
	}

}
