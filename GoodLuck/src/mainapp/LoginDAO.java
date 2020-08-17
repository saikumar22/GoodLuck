package mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
	public boolean validate(LoginPojo loginpojo) throws ClassNotFoundException, SQLException {
		String Username = loginpojo.getUsername();
		String Password = loginpojo.getPassword();

			ConnectionManager con = new ConnectionManager();
			Statement st  = con.getConnection().createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM USERDETAILS");
			while(rs.next()) {
				if(Username.equals(rs.getString("USERNAME")) && Password.equals("PASSWORD")){
					con.getConnection().close();
					return true;
				}
				else
				{
					con.getConnection().close();
					return true;
				}
			}
			
			return false;
		}


}
