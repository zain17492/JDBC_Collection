package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class StudentTable {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","0727");
			Statement st = con.createStatement();
			String s ="create table Author(Author_Id int primary key, First_Name varchar(45),Middle_Name varchar(45),Last_Name varchar(45),Phone_No int)";
		    int i = st.executeUpdate(s);
		
		    System.out.println("N0 of rows affected" + i);
		 
		    System.out.println("Table create succefully");
		    st.close();
		    con.close();
		}
		catch(Exception e) {
			
		}

	}

}