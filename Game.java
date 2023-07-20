import java.io.*;
import java.util.Random;
class Game extends Thread
{
	public void run()
	{
		try{
		Random r = new Random();
		
		for(int i=10;i>=1;i--)
		{
			Thread.sleep(600);
			int x = r.nextInt(10);
			System.out.println(x);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error"+e);
		}
	}
	
	public static void main(String[] args)
	{
		Game g = new Game();
		g.start();
	
	}
}
