import java.sql.*;
import java.util.*;

public class Round09_JDBC {
	
	public static void main(String[] args){
			
		Scanner sc =new Scanner(System.in);
		try{
			Class cls=Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 있다.");
			cls.newInstance();
			System.out.println("인스턴스 생성");
		}catch(ClassNotFoundException e){
		}catch(InstantiationException e1){
		}catch(IllegalAccessException e2){ }
		
		Connection conn=null;
		ResultSet rs=null;
		Statement stmt=null;
		PreparedStatement pstmt =null;
		
		String  url, id, pass ,query ;
		url ="jdbc:mysql://localhost:3306/web_java?useUnicode=true&characterEncoding=euckr";
		id ="cjh";
		pass="1111";
		try{
			conn=DriverManager.getConnection(url, id, pass);
			System.out.println("접속 성공");
			query="drop table my_data";
			stmt=conn.createStatement();
			stmt.execute(query);
			stmt.close();
		
			System.out.println("my_data 삭제");
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		
		try{
			query="create table my_data (num int primary key auto_increment, name varchar(20) not null, age int)";
			stmt=conn.createStatement();
			stmt.execute(query);
			stmt.close();
			System.out.println("my_data 생성");
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		up: while(true){
			System.out.println("1.데이터 추가 2. 전체 출력, 3.종료 =");
			
			int dist =sc.nextInt();
			sc.nextLine();
			switch(dist){
				case 1:
					System.out.print("이름 =");
					String name =sc.nextLine();
					System.out.print("나이 =");
					int age =sc.nextInt();
				//	sc.nextLine();
					query="insert into my_data value(null, ?, ?)";
					try{
						pstmt=conn.prepareStatement(query);
						pstmt.setString(1, name);
						pstmt.setInt(2, age);
						int res_int=pstmt.executeUpdate();
						if(res_int > 0)
							System.out.println("정상적으로 추가 되었습니다.");
						else
							System.out.println("추가에 실패 ");
						pstmt.close();
					}catch(SQLException ee){
						System.out.println(ee.getMessage());
					}
					
					break;
				case 2:
					query ="select * from my_data";
					try{
						
						stmt =conn.createStatement();
						rs =stmt.executeQuery(query);
						while(rs.next()){
							int n=rs.getInt("num");
							String na=rs.getString("name");
							int a=rs.getInt("age");
							System.out.println(n + " : " +  na + " :  " + a );
						}
							
						rs.close();
						stmt.close();
					}catch(SQLException e){
						System.out.println(e.getMessage());
					}
					
					break;
				case 3:
					System.out.println("프로그램 종료!");
					break up;
					
				default :
					System.out.println("잘못 입력 했다");
					break;
			}
			System.out.println();
		}
		try{
			if(conn!= null && !conn.isClosed())
				conn.close();
			conn =null;
		}catch(SQLException e){}
		
	}
}







