public class Serial {
	
	public static void main(String args[]) throws InterruptedException {
		Serial t = new Serial();
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
		Thread.sleep(1000);		
	}

	public void testCase2()throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void testCase3()throws InterruptedException {
		Thread.sleep(3000);
	}
	public void testCase4()throws InterruptedException {
		Thread.sleep(4000);
	}
}
