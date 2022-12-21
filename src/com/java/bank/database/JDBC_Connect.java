package com.java.bank.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {
	private Connection connection = null;

	public Connection getConnection() throws SQLException {
		try {
            System.out.println("Loading driver...");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded driver.");

            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/m6", "root", "21512151");
            System.out.println("Successfully connected to database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
		return connection;

	}

}
