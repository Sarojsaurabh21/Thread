package Thread;

public class MultiThread2 {

	public static void main(String[] args) {
		
		Customer c=new Customer();
		First2 f=new First2(c);
		f.start();
		
		Seconds2 s=new Seconds2(c);
		s.start();
		

	}

}
