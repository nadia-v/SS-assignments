/**
 * Assignment Day 4
 */
package com.ss.assignment.four;

/**
 * @author nadik
 *
 */
public class Producer implements Runnable {

	/**
	 * @param args
	 */

	BoundedBuffer bb = new BoundedBuffer(); 
	Producer(BoundedBuffer bb) { 
	    this.bb = bb; 
	    new Thread(this, "Producer").start(); 
    } 
  
    public void run() { 
        for (int i = 0; i < bb.maxAvailable; i++) {
        	bb.put(i); 
        }
    } 
}


