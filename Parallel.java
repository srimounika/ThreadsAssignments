
public class Parallel {
	public static void main(String args[]) throws InterruptedException {
		Runnable task1 = () -> {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Exception ::"+e.getMessage());
			}
		};
		
		Runnable task2 = () -> {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println("Exception ::"+e.getMessage());
			}
		};
		
		
		Runnable task3 = () -> {
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				System.out.println("Exception ::"+e.getMessage());
			}
		};
		
		Runnable task4 = () -> {
			try {
					Thread.sleep(4000);
				}
			catch(InterruptedException e) {
				System.out.println("Exception ::"+e.getMessage());
			}
		};
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Start!");
		Thread thread1 = new Thread(task1);
		thread1.start();
		Thread thread2 = new Thread(task2);
		thread2.start();
		Thread thread3 = new Thread(task3);
		thread3.start();
		Thread thread4 = new Thread(task4);
		thread4.start();
		thread4.join();
		System.out.println("Done!");
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: "+((endTime- startTime)/1000 )+" sec" );
		
	}
	
}
