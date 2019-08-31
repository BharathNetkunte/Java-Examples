package TablesbyThread;

public class Multiplier {

	volatile boolean isThread2allowed = false;

	public boolean isThread2allowed() {
		return isThread2allowed;
	}

	public void setThread2allowed(boolean isThread2allowed) {
		this.isThread2allowed = isThread2allowed;
	}

	int count = 1;

	synchronized public void print(int i) throws InterruptedException {
		if (count == 1 && Thread.currentThread().getName().equals("Thread-1")) {
			System.out.println("First Wait" + " " + Thread.currentThread().getName());
			wait();
		}

		while (!((Thread.currentThread().getName().equals("Thread-1") && (isThread2allowed == true))
				|| (Thread.currentThread().getName().equals("Thread-0") && (isThread2allowed == false)))) {
			
			wait();

		}
		System.out.println(Thread.currentThread().getName() + " " + 2 * i);

		count++;
		if (Thread.currentThread().getName().equals("Thread-0") && isThread2allowed == false) {
			isThread2allowed = true;
		}

		if (Thread.currentThread().getName().equals("Thread-1") && isThread2allowed == true) {
			isThread2allowed = false;

		}

		notify();

	}
}
