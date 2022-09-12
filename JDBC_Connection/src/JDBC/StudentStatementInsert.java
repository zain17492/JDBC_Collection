package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatementInsert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/test1";
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password", "0727");
		Connection con =DriverManager.getConnection(url,p);
		Statement st = con.createStatement();
		String query = "insert into author value(2,'John','Jane','Milton','9564265431')"; 
		int i = st.executeUpdate(query);
		//boolean t = st.execute("insert into author value(2,'John','Jane','Milton','9564265431')");
		System.out.println("No of rows affected" + i);
	    //System.out.println("Query executed" + t);
	    System.out.println("Row Insert Succefully");
	    st.close();
	    con.close();
		

	}

}
