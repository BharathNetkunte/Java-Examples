package TablesbyThread;

public class ThreadB implements Runnable {

	Multiplier mob;

	public ThreadB(Multiplier mob) {
		// TODO Auto-generated constructor stub
		this.mob = mob;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 10; i += 2) {
			try {
				mob.print(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
