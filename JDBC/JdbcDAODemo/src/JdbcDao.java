
public class JdbcDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDAO dao=new StudentDAO();
		dao.connect();	
//		Student s1=dao.getStudent(2);
//		System.out.println(s1.userName);
		
		Student s2=new Student();
		s2.userid=7;
		s2.userName="Saurav";
			
		dao.addStudent(s2);

	}

}
