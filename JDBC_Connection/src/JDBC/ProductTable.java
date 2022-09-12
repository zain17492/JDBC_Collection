package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class ProductTable {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","0727");
			Statement st = con.createStatement();
			String s ="create table Product(product_Id int primary key, product_name varchar(45),quantity int, rate int)";
		    int i = st.executeUpdate(s);
		    boolean t = st.execute("create table std1(product_Id int primary key, product_name varchar(45),quantity int)");
		    System.out.println("N0 of rows affected" + i);
		    System.out.println("Query executed" + t);
		    System.out.println("Table create succefully");
		    st.close();
		    con.close();
		}
		catch(Exception e) {
			
		}

	}

}
