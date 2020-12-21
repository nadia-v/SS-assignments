/**
 * 
 */
package com.ss.assignment.weekendone;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author nadik
 *
 */
public class SampleSingleton {

	/**
	 * @param args
	 * 
	 * Fixed Singleton
	 */
	

	private static Connection conn = null;
	
	volatile public static SampleSingleton instance = null;
	
	private SampleSingleton() {	
	}
	
	public static SampleSingleton getInstance() {
		synchronized (instance) {
			if (instance == null) {
				instance = new SampleSingleton();
			}
		}
		return instance;
	}
	
	public static void databaseQuery(BigDecimal input) {
		try {
			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
		
			BigDecimal x = BigDecimal.ZERO;
			while(rs.next()) {
				x = input.multiply(new BigDecimal(rs.getInt(1)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
}


