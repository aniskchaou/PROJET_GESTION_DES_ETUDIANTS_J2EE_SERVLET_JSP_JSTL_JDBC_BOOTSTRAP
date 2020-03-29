package connectionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

	public static Connection connection;
	
	
	static {
		try {
			//charger driver
			Class.forName("com.mysql.jdbc.Driver");
			//creer une connexion
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/SERVLET_JSP_JSTL","root","root");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getConnection() {
		return connection;
	}
	
	
	
}
