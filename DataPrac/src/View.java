import java.sql.*;
public class View {
	
	public static void main(String arg[]) throws SQLException {
		
		String sql = "SELECT * FROM RECORD";
		
		Statement stmt = DBUtil.getConnection().createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println("Name : " + rs.getString(2));
			System.out.println("Password : " + rs.getString(3));
			
		}
	}

}
