import java.sql.*;
import java.util.*;

class DataPrac{
	public static void main(String args[]) throws SQLException {
		Register reg = new Register();
		Scanner sc = new Scanner(System.in);
		Statement stmt = DBUtil.getConnection().createStatement();//get connection 
		
		System.out.println("Enter Name : ");
		reg.setName(sc.next());
		System.out.println("Enter Password : ");
		reg.setPassword(sc.next());
		
		String sql = "INSERT INTO RECORD(name,password) VALUES('"+reg.getName()+"','"+reg.getPassword()+"')";
		//String sql = "INSERT INTO RECORD(name,password) VALUES('Rucha','1234')";
		int rs = stmt.executeUpdate(sql);//return rowcount in int format
		
		
		if(rs > 0)
			System.out.println("Added Successfully");
		else
			System.out.println("Enter correctly");
		
	}
	
}