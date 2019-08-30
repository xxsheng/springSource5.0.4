package test.thread;

public class WaitTest2 {
	public static void main(String[] args) {
		String abc = new String("abc");
		ThreadA t1 = new ThreadA("t1");
		System.out.println(t1.hashCode());
		synchronized(t1) {
			try {
				// 启动“线程t1”
				System.out.println(Thread.currentThread().getName()+" start t1");
				t1.start();
				// 主线程等待t1通过notify()唤醒。
				System.out.println("挂起主线程");

				System.out.println("线程t1的状态是:"+t1.isAlive());
				System.out.println("线程ti得状态时："+Thread.currentThread().getState());

				Thread.sleep(3000);

				t1.wait();  //  不是使t1线程等待，而是让拥有t1这个对象的主线程等待

				System.out.println("挂起主线程后面的输出");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
class ThreadA extends Thread {
	public ThreadA(String name) {
		super(name);
	}

	public void run() {
		synchronized (this) {
			try {
				System.out.println(this.hashCode()+"---------------ThreadA");
				System.out.println("ThreadA得状态" + Thread.currentThread().getState());
				Thread.sleep(10000); //  使当前线阻塞 1 s确保在主线程wait()之前t1没有执行完并退出
			} catch (Exception e) {
				e.printStackTrace();
			}
			//System.out.println(Thread.currentThread().getName()+" call notify()");
			// 唤醒当前的wait线程
			//this.notify();
		}
	}
}