package Thread;

public class MultiThread {

	public static void main(String[] args) {
		
		Table t=new Table();
		First f=new First(t);
		f.setName("one");
		
		System.out.println(f.getName());
		f.start();
		
		Second s=new Second(t);
		s.setName("two");
		
		System.out.println(s.getName());
		s.start();

	}

}
