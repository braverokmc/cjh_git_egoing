import java.awt.BorderLayout;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.*;

public class Round09_Text_1  extends JFrame implements  Runnable{
	ServerSocket server =null;
	Socket socket =null;
	
	BufferedReader in=null;
	JTextArea  jt ;
	JScrollPane  jsp;
	
	public Round09_Text_1(){
		setTitle("Server Chatting");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jsp=new JScrollPane(Area());
		
		add(jsp, BorderLayout.CENTER);
		setSize(400, 200);
		setVisible(true);
		
		try{
			connection();
			
			run();
		}catch(IOException e){
			System.out.println(e.getMessage());
			System.out.println("종료 합니다.");
			System.exit(0);
			
		}
		
	
	}
	
	public  JTextArea Area(  ) {	
		jt=new JTextArea();
		jt.setEditable(false);
		return jt; 
	}
	public void connection () throws IOException{
		server = new ServerSocket(12345);
		jt.append("접속 성공");
		socket=server.accept();
		in =new  BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	
	public void run() {
		jt.append("쓰레드 성공");	
		while(true){
				String str ="";
				try{
						str =in.readLine();			
					}catch(IOException e){
						e.getMessage();
						System.exit(0);
					}
				jt.append("\n클라이언트 > " + str);
				int pos =jt.getText().length();
				jt.setCaretPosition(pos);
		}
	}
	

	public static void main(String[] arg){		
		new Round09_Text_1(); 
	}

}
