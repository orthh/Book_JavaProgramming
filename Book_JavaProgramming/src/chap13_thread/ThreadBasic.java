package chap13_thread;

public class ThreadBasic extends Thread{
	int n = 0;

	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			}catch(Exception e) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		ThreadBasic th = new ThreadBasic();
		ThreadBasic th2 = new ThreadBasic();
		th.start();
		th2.start();

	}

}
