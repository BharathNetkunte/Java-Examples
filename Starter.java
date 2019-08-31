package TablesbyThread;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiplier mob = new Multiplier();
		ThreadA tA = new ThreadA(mob);
		ThreadB tB = new ThreadB(mob);

		Thread T1 = new Thread(tA);
		Thread T2 = new Thread(tB);

		T1.start();
		T2.start();

	}

}
