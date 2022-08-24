package Thread;

public class TreadTechanique2 implements Runnable
{
   public void run()
   {
	   System.out.println("This This is the second tequniq to showing threa\"");
   }
	public static void main(String[] args) {
		
		 TreadTechanique2 d =new TreadTechanique2();
		 Thread t=new Thread(d);
		 t.start();

	}
	
}
