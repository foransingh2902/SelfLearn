package jdbcCoding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Note: please use latest jar file, else it won't work
public class DBcoonection1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// import mysql connector jar first
		System.out.println("one");
		String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
		String uname = "root";
		String pwd = "foran";
		try {
			// Class.forName will load the class and the static block
			// of the class loaded will register the driver
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// this one is deprecated
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pwd);
		// this interface is from java.sql
		Statement st = con.createStatement();
		String query = "select * from persons";

		ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
			String cid = rs.getString("PersonID");
				System.out.println(cid + " " + rs.getString(2) + " " + rs.getString(3));

			}
			String insertData = "insert into Persons values (4,'singla','heena','sector 39','chandigarh')";
			// return int -- the number of rows affected
			st.executeUpdate(insertData);
			System.out.println("***********************************");
			ResultSet rs1 = st.executeQuery(query);
			while (rs1.next()) {
				String cid = rs1.getString("PersonID");
				System.out.println(cid + " " + rs1.getString(2) + " " + rs1.getString(3));
			}
			System.out.println("************************************");
			// Prepared Statement
			String pQuery = "insert into Persons values (?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(pQuery);
			pst.setInt(1, 8);
			pst.setString(2, "kumar");
			pst.setString(3, "suresh");
			pst.setString(4, "sector 51");
			pst.setString(5, "sonipat");
			// will also return string
			pst.executeUpdate();
			pst.close();
		st.close();
		con.close();}
		catch (Exception e) {
			// TODO: handle exception
			// System.out.println(e.printStackTrace());
			e.printStackTrace();
		}
	}

}
