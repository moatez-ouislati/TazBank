/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moate
 */

import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;


public class javaconnect {
	Connection conn = null;
	
	public static Connection ConnectDb() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\moate\\OneDrive\\Bureau\\my projects\\ERP-banque\\bank.db");
                        System.out.println("Connection to SQLite has been established.");

			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
				
		}
                return null;
	}
/*}*/
public static void main(String[] args) {
		Connection conn = ConnectDb();
		// Do some database operations...
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

