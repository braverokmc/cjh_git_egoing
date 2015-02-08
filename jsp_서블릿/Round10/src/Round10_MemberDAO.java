import java.sql.*;

import javax.servlet.ServletException;


public class Round10_MemberDAO {
	private Connection conn;
	public Round10_MemberDAO() throws ServletException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver exist");
		}catch(ClassNotFoundException ex){
			throw new ServletException("����̹� ����!");
		}
	
		String url ="jdbc:mysql://localhost:3306/web_java?useUnicode=true&characterEncoding=euckr";
		String id ="cjh";
		String pass="1111";
		try{
			conn=DriverManager.getConnection(url, id, pass);
			System.out.println("���� ����");
		}catch(SQLException ex){
			throw new ServletException("���� ����");
		}
			
	}
		
	public boolean registerMember(Round10_MemberDTO   dto ) throws ServletException{
		String query ="insert into Round10_Member values (null, ?, ?, ?)";
		
		try{
			PreparedStatement pstmt =conn.prepareStatement(query);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getTel());
			pstmt.setString(3, dto.getAddr());
			pstmt.executeUpdate();
			pstmt.close();			
		}catch(SQLException ex){
			throw new ServletException("��Ͻ���!");
		}finally{
		
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) throws ServletException{
		new Round10_MemberDAO();
	
	
	
	}
	
}
