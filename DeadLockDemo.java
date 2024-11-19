package multithread;
class booking extends Thread{
	Object train = null;
	Object comp = null;
	
	public Booking (Object train, Object comp) {
		super();
		this.train = train;
		this.comp = comp;
		
	}
	public void run() {
		System.out.println(getName() + "Booking Start");
		synchronized(train) {
			System.out.println(getName() + "Book Train");
			try {
				sleep(100);
				
			} 
			catch(InterruptedException ex){
				ex.printStackTrace();
			}
			synchronized(comp) {
				System.out.println(getName()+"Book comp");
			}
		}
		System.out.println(getName() +"cancel end");
	}
}
class cancel extends Thread{
	Object train = null;
	Object comp = null;
	
	public cancel (Object train, Object comp) {
		super();
		this.train = train;
		this.comp = comp;
		
	}
	public void run() {
		System.out.println(getName() + "canceling Start");
		synchronized(comp) {
			System.out.println(getName() + "cancel comp");
			try {
				sleep(100);
				
			} 
			catch(InterruptedException ex){
				ex.printStackTrace();
			}
			synchronized(comp) {
				System.out.println(getName()+"cancel train");
			}
		}
		System.out.println(getName() +"cancel end");
	}

}
public class DeadLockDemo {
 public static void main(String[] args) {
	 Object train new Object();
	 Object comp = new Object();
	 Booking bk = new Booking(train,comp);
	 
	 
 }
}
