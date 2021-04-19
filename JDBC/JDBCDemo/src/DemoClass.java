import java.sql.*;
public class DemoClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/jdbc";//:jdbs:dbms:database name
		String uname="root";
		String pass="";
		String query="SELECT userName FROM student WHERE userid=3";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		
//		fetching first row username data
//		Statement st=con.createStatement();
//		ResultSet rs=st.executeQuery(query);
//		rs.next();
//		String name=rs.getString("userName");
//		System.out.println(name);
//		st.close();
//		con.close();
		
		
//		fetching first row  data
//		String query1="SELECT * FROM student";
//		Statement st=con.createStatement();
//		ResultSet rs1=st.executeQuery(query1);		
//		String userData="";
//		while(rs1.next()) {
//			userData=rs1.getInt(1)+ ": "+rs1.getString(2);
//			System.out.println(userData);
//		}
//		st.close();
//		con.close();
		
//		insert with create statement
//		int userid=5;
//		String username="Mohan";
//		String query2="Insert into student values ("+userid+",'"+username+"')";
//		Statement st=con.createStatement();
//		int count=st.executeUpdate(query2);		
//		System.out.println(count+ "  rows affected.");
//		st.close();
//		con.close();
		

//		insert with prepareStatement
		int userId=6;
		String userName="Ram";
		String query3="Insert into student values (?,?)";		
		PreparedStatement pst=con.prepareStatement(query3);
		pst.setInt(1, userId);
		pst.setString(2, userName);
		int count=pst.executeUpdate();		
		System.out.println(count+ "  rows affected.");		
		pst.close();
		con.close();

	}

}
