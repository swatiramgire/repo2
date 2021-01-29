package multithreading;

public class MainThreadDemo {
	public static void main(String[] args)
	{
		Thread details=Thread.currentThread(); // To get current thread information
		System.out.println(details);
		
		details.setName("data"); // To set name of thread
		System.out.println(details.getName()); // To get name of thread
		System.out.println(details);
		
		details.setPriority(3); // To set priority of thread
		System.out.println(details.getPriority()); // To get Priority of thread
		System.out.println(details);
		
		ThreadGroup t=new ThreadGroup("Demo"); // creating object of threadGroup
		System.out.println(t.getName());
		System.out.println(t);
	}
	

}
