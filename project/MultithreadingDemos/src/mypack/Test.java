package mypack;


class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Child thread");
	}
}
public class Test {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
		Thread t=new Thread(new MyThread());
		t.start();

	}

}
