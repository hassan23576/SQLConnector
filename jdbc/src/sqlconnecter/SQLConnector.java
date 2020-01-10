package sqlconnecter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLConnector {

	public static void main(String[] args) throws Exception
	{
		
		String url = "jdbc:mysql://localhost:3306/credit_card";
		String user = "root";
		String password = "semp1990";
		String query = "select * from credit_card;";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String mV = "";
		
		while (rs.next()) {
			mV = rs.getString(1) +  "  $ " + rs.getString(2) + " Due Date " + rs.getDate(3) + " Percentage " 
		+ rs.getDouble(4);
		
		 
		
		System.out.println(mV);
		
		

	}
		st.close();
		con.close();

	
		
	}
}

