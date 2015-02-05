import java.io.*;
import java.net.*;
import java.util.*;

public class Round09_Text_Out {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		Socket socket =null;
		PrintWriter out =null;
		try{
			socket = new Socket(InetAddress.getByName("122.36.151.129"), 12345);
			out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			System.out.println("연결 성공");
		}catch(IOException e){}
		
		while(true){
			System.out.print("전송할 문구(종료는 '.') =");
			String str =in.nextLine();
			out.println(str);
			out.flush();
			if(str.trim().equals("."))break;
		}
		
		out.close();
		
		try{
			socket.close();
		}catch(IOException e){}
			
	}
}
