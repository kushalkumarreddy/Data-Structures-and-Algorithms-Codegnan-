package java8;

public class MyRunnable {
	//implements Runnable
	
//		@Override
//		public void run() {
//			for(int i=0;i<=10;i++) {
//				System.out.println("Seetha thread");
//			}
//		}
		
		public static void main(String[] args) {
			
			//using lambda
			Runnable r=() -> {
				for(int i=0;i<=10;i++) {
					System.out.println("Seetha thread");
				}
			};
			
//			MyRunnable mr = new MyRunnable();
			
			Thread t = new Thread(r);
			t.start();
			
			for(int i=0;i<=10;i++) {
				System.out.println("Rama thread");
			}
			
		}

}
