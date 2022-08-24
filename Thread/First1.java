package Thread;

public class First1 extends Thread
{
	Table1 t;
	public First1(Table1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.multiplicationTable1(2);
	}

}
