import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class g2 {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Random ra=new Random();
		
		int x=ra.nextInt(51);
		System.out.println("GUESS A NUMBER Between (1-50)");
		for(int i=0;i<3;i++)
		{
			int a=scr.nextInt();
		if (a==x)
		{
			System.out.println("WOOHOOO! YOUR GUESS IS CORRECT YOU WON THE GAME");
			break;
		}
		else if(a>x) {
			System.out.println("OPPSIE wrong answer Guess a smaller number");
		}
		else {
			System.out.println("OPPSIE wrong answer Guess a larger number");
		}
	}
		System.out.println("Press 0 to restart");
		if((scr.nextInt())==0)
		{
			x=ra.nextInt(51);
			System.out.println("GUESS A NUMBER Between (1-50)");
			for(int i=0;i<3;i++)
			{
				int a=scr.nextInt();
			if (a==x)
			{
				System.out.println("WOOHOOO! YOUR GUESS IS CORRECT YOU WON THE GAME");
				break;
			}
			else if(a>x) {
				System.out.println("OPPSIE wrong answer Guess a smaller number");
			}
			else {
				System.out.println("OPPSIE wrong answer Guess a larger number");
			}
		}
			System.out.println("Press 0 to restart");
		}
		}

}
