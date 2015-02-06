
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.JFrame;
public class Round09_Text_Out2 {	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Socket socket = null;
		PrintWriter out= null;
		try{
			socket=new Socket(InetAddress.getByName("localhost"), 12345);
			out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			
		}catch(IOException ee){}
		
		while(true){
			System.out.println("전송할 문구(종료는 '.') = " );
			String str= in.nextLine();
			out.println(str);
			out.flush();
			if(str.trim().equals(".")){
				System.exit(-1);
				break;
			}
		
		}
		
		out.close();
		
		try{
			socket.close();
			System.exit(-1);
		}catch(IOException e){}
		
		
		
	}


}
