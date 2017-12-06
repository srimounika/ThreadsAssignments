

public class Parallel2 {
	public static void main(String args[]) throws InterruptedException {
		Runnable task1 = () -> {
			System.out.println("Start 1 ");
			try {
				Thread.sleep(1000);
				System.out.println("End 1");
			}
			catch(InterruptedException e) {
				System.out.println("Exception ::"+e.getMessage());
			}
		};
		
		Runnable task2 = () -> {
			System.out.println("Start 2");
			try {
				Thread.sleep(2000);
				System.out.println("End 2");
			}
			catch(InterruptedException e) {
				System.out.println("Exception ::"+e.getMessage());
			}
		};
		
		
		Runnable task3 = () -> {
			System.out.println("Start 3");
			try {
				Thread.sleep(3000);
				System.out.println("End 3");
			}
			catch(InterruptedException e) {
				System.out.println("Exception ::"+e.getMessage());
			}
		};
		
		Runnable task4 = () -> {
			System.out.println("Start 4");
			try {
					Thread.sleep(4000);
					System.out.println("End 4");
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
