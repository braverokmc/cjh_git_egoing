import java.io.*;
import java.net.*;
import java.util.*;

public class Round09_Text_in {
	
	public static void main(String[] arg){
		ServerSocket server =null;
		BufferedReader in = null;
		try{
			server =new ServerSocket(12345);
			System.out.println("Server Ready...");
			while(true){
				Socket  s = server.accept();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				while(true){
					String str = in.readLine();
					if(str.equals("."))break;
					System.out.println("전송된 데이터 :" + str);		
				}
				System.out.println("연결 종료 =" + s);
				
			}
			
		}catch(IOException e){
			System.err.println("Error =" + e);
		}
	}
	
}
