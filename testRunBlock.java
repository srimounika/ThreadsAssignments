public class testRunBlock {
	public static void main(String ar[]) {
		int testCase[] = {1,2,3};
		String testData[] = {"a","b","c","d","e"};
		String selectedTrb[] = {testCase[0]+testData[0],testCase[0]+testData[1]};// 1a, 1b
		Thread t[] = new Thread[selectedTrb.length];
		long startTime = System.currentTimeMillis();
		for(int i = 0; i< selectedTrb.length;i++) {
			t[i] = new Task(selectedTrb[i]);
			t[i].start();
		}
		long endTime = System.currentTimeMillis();
		long wait = ((endTime- startTime)/1000);
		System.out.println("Time Taken : "+wait+" sec");
	}
}

class Task extends Thread{
	private String name;
	Task(String name){
		this.name = name;
	}
	public void run() {
		System.out.println("Name is : "+name);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Exception ocurred: "+e.getMessage());
		}
	}
}