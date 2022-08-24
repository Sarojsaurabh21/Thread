package Thread;

public class First2 extends Thread
{
	Customer c;
	public First2(Customer c )
	{
		this.c=c;
		
	}
	public void run()
	{
		c.WithDraw(1500);
	}
	

}
