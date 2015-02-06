import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.*;

public class Round09_Text_in2 extends JFrame{
	static JTextArea   ja ;
	JScrollPane  jsp;
	
	public  Round09_Text_in2(){

		setTitle("���� â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ja=new JTextArea();
		jsp =new JScrollPane(ja);
		
		add(ja);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void position(){
		int pos=ja.getText().length();
		ja.setCaretPosition(pos);
		
	}
	
	
	public static void main(String[] args){
		ServerSocket server =null;
		BufferedReader in=null;
		
		new Round09_Text_in2();
		try{
			server=new ServerSocket(12345);
			ja.append("Server Ready...\n");
			position();
			
			
			
			while(true){
				
				Socket s =server.accept();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				while(true){
					String str =in.readLine();
					if(str.equals("."))break;
					ja.append("\n���۵� ������: " + str );;	
					position();
				}
				ja.append("���� ���� :" + s);
				//System.out.println("���� ���� :" + s);
			}	
			
		}catch(IOException e){
			System.err.println("Error =" + e);
			System.exit(0);
		}
		
	
	}

	

}



