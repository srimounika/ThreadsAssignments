public class Serial2 {
	
	public static void main(String args[]) throws InterruptedException {
		Serial2 t = new Serial2();
		System.out.println("Start!");
		long startTime = System.currentTimeMillis();
		t.testCase1();
		t.testCase2();
		t.testCase3();
		t.testCase4();
		long endTime = System.currentTimeMillis();
		long wait = ((endTime- startTime)/1000);
		System.out.println("End!");
		System.out.println("Time Taken : "+wait+" sec" );
	}
	
	public void testCase1() throws InterruptedException{
		System.out.println("Start 1");
		Thread.sleep(1000);
		System.out.println("End 1");
	}

	public void testCase2()throws InterruptedException {
		System.out.println("Start 2");
		Thread.sleep(2000);
		System.out.println("End 2");
	}
	
	public void testCase3()throws InterruptedException {
		System.out.println("Start 3");
		Thread.sleep(3000);
		System.out.println("End 3");
	}
	public void testCase4()throws InterruptedException {
		System.out.println("Start 4");
		Thread.sleep(4000);
		System.out.println("End 4");
	}
}
