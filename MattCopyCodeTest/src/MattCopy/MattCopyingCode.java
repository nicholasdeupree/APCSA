package MattCopy;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class MattCopyingCode {
	private static int score = 0,t=0;
	private static boolean test = true;
	private static String c;
	public static void main(String[] args) throws InterruptedException
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("This is a program to see if you are copying Nick's code.\nYou will be asked a series of questions.\nGood Luck.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Question 1:\nDo you put your curley brackets in\nA. right after the method\nOr\nB. On the next Line");
		c = kb.next();
		if(c.equalsIgnoreCase("A")) {
			System.out.println("You chose what I wouldn't do! Good Job.");
		}
		else if (c.equalsIgnoreCase("B")) {
			score++;
			System.out.println("You chose what I would do!");
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Question 2:\nDo you initialize you prefer to initialize your variables all on one line or on separate lines?\nAnswer with \"One\" or \"Separate\"");
		c = kb.next();
		if(c.equalsIgnoreCase("Separate")) {
			System.out.println("You chose what I wouldn't do! Good Job.");
		}
		else if (c.equalsIgnoreCase("One")) {
			score++;
			System.out.println("You chose what I would do!");
		}
		TimeUnit.SECONDS.sleep(1);
		
		do
		{
			System.out.println("How many times in one class do you look at Nick's computer monitor?\nAnswer with the average number for class");
			t = kb.nextInt();
			if(t <= 0)
			{
				System.out.println("That is an incorrect answer");
			}
			else 
			{
				System.out.println("Thank you for your input.");
				test=false;
				if(t < 5 && t>0) 
				{
					score++;
				}
				else if (t>5 && t<10)
				{
					score+=2;
				}
				else if(t>10)
				{
					score+=3;
				}
			}
		}while(test==true);
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Calculating final score");
		int x = (int) (Math.random()*10+5);
		while (x>=0) 
		{
			System.out.print(".");
			TimeUnit.SECONDS.sleep(1);
			x--;
		}
		System.out.println();
		if(score >= 2)
		{
			System.out.println("You copy Nick's code");
		}
		else
		{
			System.out.println("It's uncertain, You probably copy Nick's Code");
		}
	}
}
