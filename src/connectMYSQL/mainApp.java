/**
 * 
 */
package connectMYSQL;

import java.sql.*;


/**
 * @author macbookpromd102
 *
 */
public class mainApp {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Connection conn = null;
		String url = "jdbc:mysql://localhost/loki";
		String user = "root";
		String pass = "";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connected");
		}catch(Exception ex){
			System.err.println("Cannot connect to server");
			System.exit(1);
		}
		if(conn != null){
			try{
				conn.close();
				System.out.println("Disconnected");
			}catch(Exception e){
				/*ignore close errors*/	
			}
			
		}
	}

}
