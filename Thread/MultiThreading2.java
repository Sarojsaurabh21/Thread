package Thread;

public class MultiThreading2 {

	public static void main(String[] args) {//this eg is multithreading example 
		
		Table1 t=new Table1();
		First1 f= new First1(t);
		f.start();
		f.setName("one");
		
		System.out.println(f.getName());
		Second2 s=new Second2(t);
		
		s.start();
		s.setName("two");
		System.out.println(s.getName());
		
	}

}
