package DAO;

import java.sql.*;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
			try {
				return DriverManager.getConnection("jdbc:mysql://localhost/bdpessoa","root","");
			
			}
			
		catch(SQLException e){
			throw new RuntimeException();
			
		}
	}
}
