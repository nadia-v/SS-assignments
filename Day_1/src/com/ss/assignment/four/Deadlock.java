/**
 * Assignment Day 4
 */
package com.ss.assignment.four;

/**
 * @author nadik
 *
 */
public class Deadlock {

	/**
	 * @param args
	 * 
	 *  Multithread deadlock
	 */
	
	static String s1;
	static String s2;
	
	// Thread 1
	private static class Thread1 extends Thread {
		public void run() {
			try {
				synchronized (s1) { 
					Thread.sleep(50);
					synchronized (s2) {
						System.out.println(s2);
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
		
	// Thread 2
	private static class Thread2 extends Thread {
		public void run() {
			try {
				synchronized (s2) { 
					Thread.sleep(50);
					synchronized (s1) {
						System.out.println(s1);
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		s1 = args[0];
		s2 = args[1];
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		
		System.out.println("DeadLock");
	}
}
	

		

