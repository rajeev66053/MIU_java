import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class StudentDAO {
	
	String url="jdbc:mysql://localhost:3306/jdbc";
	String uname="root";
	String pass="";
	
	Connection con=null;
	
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,pass);
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public Student getStudent(int userid){
		
		try {
			String query="Select userName from student where userid ="+userid;	
			System.out.println(query);

			Student s=new Student();
			s.userid=userid;			

			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			
			s.userName=name;

			return s;
		} catch(Exception ex) {
			System.out.println(ex);
		}
		return null;
		
	}
	
	public void addStudent(Student s) {
		String query="insert into student values (?,?)";
		PreparedStatement pst;
		try {
			pst=con.prepareStatement(query);
			pst.setInt(1, s.userid);
			pst.setString(2, s.userName);
			pst.executeUpdate();
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}

}
