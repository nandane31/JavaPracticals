package assignments;

public class A13_ThreadT1T2 {

	static class T1 extends Thread {

		public void T1_start() {
			
			try {
				Thread.sleep(2000); // Simulating some work
				System.out.println("Thread T1 sleeps for 2000 milisecond.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	static class T2 extends Thread {
		public void T2_start() {

			try {
				Thread.sleep(2000); // Simulating some work
				System.out.println("Thread T2 sleeps for 2000 milisecond.");
			} catch (InterruptedException e) {
				e.printStackTrace();
	
			}
			
		}    
		System.out.println("Thread T1 and T2 has completed its execution.");
	}

	public static void main(String[] args) {
		// Creating a thread instance
		T1 s1 = new T1();
		T2 s2 = new T2();

		// Thread T1 and T2 is in the NEW state after instantiation
		System.out.println("Thread T1 and T2 has been Created.");

		// Thread is now in the RUNNABLE state
		System.out.println("Thread T1 has been started and is in the RUNNABLE state.");


		// Starting the thread
		s1.T1_start(); //calling run method automatically


		try {
			Thread.sleep(1000); // Main thread sleeps for 1 second
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Thread may be in TIMED_WAITING state if it is sleeping
		System.out.println("After sleeping, thread T1 may be in TIMED_WAITING state.");
System.out.println("");










	
		// Thread is now in the RUNNABLE state
		System.out.println("Thread T2 has been started and is in the RUNNABLE state.");
		// Starting the thread
		s2.T2_start(); //calling run method automatically
     
		try {
			Thread.sleep(1000); // Main thread sleeps for 1 second
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Thread may be in TIMED_WAITING state if it is sleeping
		System.out.println("After sleeping, thread T2 may be in TIMED_WAITING state.");

		

		try {
			s1.join(); // Main thread waits for myThread to complete
			System.out.println("Join Thread T1 and T2");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Thread is in TERMINATED state after completion
		System.out.println("Thread T1 and T2 is in the TERMINATED state.");
	}
}
