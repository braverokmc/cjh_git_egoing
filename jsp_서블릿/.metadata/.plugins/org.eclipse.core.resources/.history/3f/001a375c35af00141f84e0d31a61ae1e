import java.sql.*;

import javax.servlet.ServletException;


public class Round10_MemberDAO {
	private Connection conn;
	public Round10_MemberDAO() throws ServletException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver exist");
		}catch(ClassNotFoundException ex){
			throw new ServletException("드라이버 오류!");
		}
	
		String url ="jdbc:mysql://localhost:3306/web_java?useUnicode=true&characterEncoding=euckr";
		String id ="cjh";
		String pass="1111";
		try{
			conn=DriverManager.getConnection(url, id, pass);
			System.out.println("접속 성공");
		}catch(SQLException ex){
			throw new ServletException("접속 오류");
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
			throw new ServletException("등록실패!");
		}finally{
		
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) throws ServletException{
		new Round10_MemberDAO();
	
	
	
	}
	
}
