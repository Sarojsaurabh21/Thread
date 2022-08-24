package Thread;

public class Customer {  //Cusrtomer ,first2,seconds2,multithreading2  make file
	int amount=10000;
	private int deposite;
	public synchronized void WithDraw(int amount)
	{
		System.out.println("less amount wait for deposite");
		try
		{
			wait();//wait methed release the luck
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		double Withdraw=this.amount-amount;
		System.out.println("The withdraw amount is="+Withdraw);
	}
	public synchronized void deposite(int amount)
	{
		deposite=this.amount+amount;
		System.out.println("the amount deposite="+deposite);
		notify();
	}

}
