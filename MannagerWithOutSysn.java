package threads;
class shared{
	public synchronized void set() {
		for(int i = 0 ; i <= 500 ; i++) {
			System.out.println(Thread.currentThread().getName()+":" +i);
		}
	}
}
class MyThread1 extends Thread{
	shared s1 = null;
	public MyThread1(shared s1) {
		this.s1 = s1;
		
	}
	public void run() {
		s1.set();
	}
}
class MyThread2 extends Thread{
	shared s1 = null;
	public MyThread2(shared s1) {
		this.s1 = s1;
	}
	public void run() {
		s1.set();
	}
}
public class MannagerWithOutSysn {
 public static void main(String[] args) {
	 shared s1 = new shared();
//	 MyThread1 t1 = new MyThread1(s1);
//	 MyThread2 t2 = new MyThread2(s1);
//	 t1.start();
//	 t2.start();
	 shared s2 = new shared();
	 MyThread1 t1 = new MyThread1(s1);
	 MyThread2 t2 = new MyThread2(s2);
	 t1.start();
	 t2.start();
 }
}
