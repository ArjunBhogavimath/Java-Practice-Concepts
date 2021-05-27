package Thread;
/*//by using runnable inteface
public class Ex implements Runnable {
	public void run() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Ex e = new Ex();
		Thread t1 = new Thread(e);
		t1.start();
		
	}

}*/

//by using thread class
public class Ex extends Thread {
	public void run() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		Ex t1 = new Ex();;
		t1.start();
		
	}

}
