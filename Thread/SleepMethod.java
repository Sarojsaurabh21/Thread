package Thread;

public class SleepMethod extends Thread
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
		SleepMethod S=new SleepMethod();
		S.start();
		
		
		

	}

}
