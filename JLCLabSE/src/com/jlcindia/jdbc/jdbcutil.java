package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcutil {

	static 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");	
		}
   catch(ClassNotFoundException e)		
		{
	     System.out.println(e);
		}
	}
	/*public static Connection getOracleConnection() throws SQLException {
		// TODO Auto-generated method stub
    String url="jdbc:oracle:thin:@localhost:1521:XE";
    Connection con=DriverManager.getConnection(url, "system","system");
     return con; 
	}*/
	public static Connection getMySQLConnection () throws SQLException
	{
		
		String url="jdbc:mysql://localhost:3306/student";
		Connection con=DriverManager.getConnection(url, "root", "root");
		return con;
	}
	public static void cleanup(Statement st,Connection con)
	{
	 try {
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();

	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	}
	public static void cleanup(ResultSet rs,Statement st,Connection con)
	{
	 try {
		 if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();

	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }

	}}
