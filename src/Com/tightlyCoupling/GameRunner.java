package Com.tightlyCoupling;

//import lunchapplication.MarioGame;
import lunchapplication.Pacman;

public class GameRunner 
{
	/*
	private MarioGame gm;
	
	public GameRunner(MarioGame gm)
	{
		this.gm = gm;
	}

	public void setGm(MarioGame gm) 
	{
		this.gm = gm;
	}
	
	public void run()
	{
		gm.up();
		gm.down();
		gm.left();
		gm.right();
	}  
	*/
	
	private Pacman mn;
	
	/*public GameRunner(Pacman mn)
	{
		this.mn= mn;
	}
	*/
	public void setGm( Pacman mn) 
	{
		this.mn = mn;
	}
	
	public void run()
	{
		mn.up();
		mn.down();
		mn.left();
		mn.right();
	}    

}
