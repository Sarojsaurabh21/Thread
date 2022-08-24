package Thread;

public class JoinMethod extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hai");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		JoinMethod d=new JoinMethod();
		d.setName("First");
		System.out.println(d.getName());
		d.start();
		
		try
		{
			d.join();
		}
		catch(Exception e)
		{
			
		}
		
		 JoinMethod  d1=new  JoinMethod ();
		 d1.setName("Second");
		 System.out.println(d1.getName());
		 d1.start();
		
		

	}

}
