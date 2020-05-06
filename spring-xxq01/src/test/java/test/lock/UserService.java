package test.lock;

public class UserService implements Runnable {
	Logic logic = new Logic();

	@Override
	public void run() {
		try {
			logic.test(true);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UserService userService = new UserService();
		Thread abc = new Thread(userService);
		Thread abcc = new Thread(userService);
		abc.start();
		abcc.start();
	}
}

class Logic {
	static int i = 0;
	public void test(boolean abc) throws InterruptedException {

		System.out.println("lock-----1");
		synchronized (Logic.class) {
			i++;
			System.out.println("lock-----2");
			System.out.println("i----"+i);
				int j=0;
			while (true) {
				System.out.println("-------lock-----");
				Thread.sleep(1000L);
				j++;
				System.out.println("jjjj" + j);
				if (j==3) {
					break;
				}
			}
		}
	}
}
