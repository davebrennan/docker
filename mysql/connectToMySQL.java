import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToMySQL {


	public static void main(String args[])  throws Exception //static method  
	{ 
		try{  
			System.out.println("Begginging MySQL");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Connecting to MySQL");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:13306/test_db","root","secret");
			
			System.out.println("Creating Statment");
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from user_details");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}  



}
