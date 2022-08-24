package Thread;

public class Multithreading extends Thread
{
	public void run()
	{
		for(int i=0; i<5;i++)
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
		 Multithreading M=new  Multithreading ();
		 M.setName("First");
		 System.out.println(M.getName());
		 M.start();
		
		 
		 Multithreading M1=new  Multithreading ();
		 M1.setName("second");
		 System.out.println(M1.getName());
		 M1.start();
		
		
	}

}
