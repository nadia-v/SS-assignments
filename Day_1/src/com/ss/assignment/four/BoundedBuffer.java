/**
 * Assignment Day 4
 */
package com.ss.assignment.four;

import java.util.concurrent.Semaphore;

/**
 * @author nadik
 *
// */
public class BoundedBuffer {

	/**
	 * @param args
	 */
	
	int item; 
	public int maxAvailable = 10;
	static Semaphore semCon = new Semaphore(0); 
  
	static Semaphore semProd = new Semaphore(1);
   
    
    public void get() { 
        try { 
        	semCon.acquire(); 
        } 
        catch (InterruptedException e) { 
            e.printStackTrace();
        } 
 
        System.out.println("Consumer consumed item : " + item); 
        semProd.release(); 
    } 
    
    public void put(int item) { 
        try { 
        	semProd.acquire(); 
        } 
        catch (InterruptedException e) { 
            e.printStackTrace();; 
        } 
        this.item = item; 
  
        System.out.println("Producer produced item : " + item); 
        semCon.release(); 
    } 

	public static void main(String[] args) {
		BoundedBuffer bb = new BoundedBuffer(); 
        new Consumer(bb); 
        new Producer(bb); 

	}

}














