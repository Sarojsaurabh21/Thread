package Thread;

public class threadeg extends Thread
{
   public void run()
   {
	   System.out.println("hai");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadeg  d=new threadeg ();
		d.start();

	}

}
