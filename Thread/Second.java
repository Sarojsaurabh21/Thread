package Thread;

public class Second extends Thread
{

	 Table t;
	 Second(Table t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.multiplicationTable(2);
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
