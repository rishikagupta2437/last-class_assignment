
public class Tasks implements Runnable {
	
	int i=1;

	@Override
	public synchronized void run() {
		
		while(i<=1000) {
			System.out.println("Thread name:" +  Thread.currentThread().getName());
			System.out.println(i);
			i++;
		}
			
		
		
	}
	
	

}
