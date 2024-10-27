package Com.tightlyCoupling;

//import lunchapplication.MarioGame;
import lunchapplication.Pacman;

public class LunchTightlyCoupling 
{
	public static void main(String args[])
	{
		//For Mario game
		//MarioGame game = new MarioGame();
		
		//For Pacman game
		Pacman game = new Pacman();
		
		//For Constructor injection
		//GameRunner runner = new GameRunner(game);
		
		//For Setter injection
		GameRunner runner = new GameRunner();
		runner.setGm(game);
		runner.run();
	}

}
