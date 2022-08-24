package Thread;

public class Seconds2 extends Thread
{
	Customer c;
	Seconds2(Customer c)
	{
		this.c=c;
		
	}
	public void run()
	{
		c.deposite(20000);
	}

}
