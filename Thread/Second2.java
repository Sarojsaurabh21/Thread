package Thread;

public class Second2 extends Thread
{
 Table1 t;
 Second2(Table1 t)
 {
	 this.t=t;
 }
 public void run()
 {
	 t.multiplicationTable1(3);
 }
}
