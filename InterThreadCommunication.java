package threads;

class TestSum extends Thread{
	
	int total = 0;
	@Override
	
	public synchronized void run() {
		for(int i = 0; i<=10;i++) {
			total = total+i;
		}
		notify();
		
		
		
	}
	
}


public class InterThreadCommunication {
	public static void main(String[] args) {
		TestSum ts
	}

}
