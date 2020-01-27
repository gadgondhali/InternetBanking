import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class LogIn {
	public static void main(String args[]) throws SQLException {
		String name,password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Password : ");
		password = sc.next();
		
		Statement stmt = DBUtil.getConnection().createStatement();
		String sql = "SELECT * FROM RECORD WHERE NAME = '"+name+"' AND PASSWORD = '"+password+"'";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		Welcome w = new Welcome();
		
		if(rs.next()) {
			w.welcome(name);
		}
		else {
			System.out.println("Login Failed:(");
		}
		
		
		
	}

}
