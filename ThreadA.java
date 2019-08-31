package TablesbyThread;

public class ThreadA implements Runnable {

	Multiplier mob;

	public ThreadA(Multiplier mob) {
		// TODO Auto-generated constructor stub
		this.mob = mob;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i += 2) {
			try {
				mob.print(i);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
