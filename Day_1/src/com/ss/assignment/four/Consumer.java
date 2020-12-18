/**
 * Assignment Day 4
 */
package com.ss.assignment.four;

/**
 * @author nadik
 *
 */
public class Consumer implements Runnable {

	/**
	 * @param args
	 */

   	BoundedBuffer bb = new BoundedBuffer(); 
    Consumer(BoundedBuffer bb) { 
        this.bb = bb; 
        new Thread(this, "Consumer").start(); 
    } 
  
    public void run() { 
        for (int i = 0; i < bb.maxAvailable; i++) {
        	bb.get(); 
        }
    } 
}



