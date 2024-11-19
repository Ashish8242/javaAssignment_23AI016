package threads;

class MyFirst extends Thread {
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class ThreadMnanager {
    public static void main(String[] args) { // Fixed the method name
        MyFirst mf = new MyFirst();

        mf.start();
        for (int i = 0; i < 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i); // Improved the output
        }
    }
}
