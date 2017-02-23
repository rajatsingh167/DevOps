class MyThread extends Thread
{
	static Thread st;
public void run()// called by JVM / Thread schedular
{
	for(int i=1;i<=10;i++)
	{
		try {
			st.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Child thread");
	//throw new NullPointerException();
	}
}

/*public void start()
{
	System.out.println("From start"); 
	
}*/
}

public class MainThreadDemo {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		
		MyThread m = new MyThread();
		m.start();
		MyThread.st=Thread.currentThread();
		
		
		System.out.println("MainThread");
		
		

	}

}
