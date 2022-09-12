package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pt = null;
		try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
         con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","0727");
         pt=con.prepareStatement("insert into Product value(?,?,?,?)");
         pt.setInt(1, 1);
         pt.setString(2, "abc");
         pt.setInt(3, 30);
         pt.setInt(4, 40);
         int i = pt.executeUpdate();
         System.out.println("No of row affected" +i);
		
		}
		catch(Exception e)
		{
			
		}
		finally 
		{
			try {
				if(pt!=null) {
					pt.close();
					pt=null;
				}
		}
			
	
		catch (Exception e) {
			}
			
			try {
				if(con!=null) {
					con.close();
					con=null;
				}
		}
			
	
		catch (Exception e) {
			}
		}
	}

}
