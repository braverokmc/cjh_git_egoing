
import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

import java.io.*;
import java.net.Socket;

public class ChatClient extends JFrame implements ActionListener{
	
	BufferedReader  in=null;
	BufferedWriter out= null;
	Socket  socket= null;
	Receive getMessage ;
	JScrollPane jspn;
	
	JTextField  setMessage;
	
	public ChatClient(){
		setTitle("클라이언트 채팅 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getMessage = new Receive();
		getMessage.setEditable(false);
		Thread th = new Thread(getMessage);
		jspn = new JScrollPane(getMessage);
		
		add(jspn, BorderLayout.CENTER);
		
		setMessage =new JTextField();
		setMessage.addActionListener(this);
		add(setMessage, BorderLayout.SOUTH);
		
		setSize(400, 200);
		setVisible(true);
		try{
			connection();
			
		}catch(IOException e){
			errorMessage(e.getMessage());
		}		
		th.start();

	}
	
	private void connection() throws IOException{
		socket =new Socket("localhost", 9999);
		System.out.println("접속성공");
		in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	
	private  void errorMessage(String string){
		System.out.println(string);
		System.exit(0);
	}
	
	private class Receive extends JTextArea implements Runnable{
		public void run() {
				String message ="";
			while(true){
				try{	
					message =in.readLine();
				}catch(IOException e){
					errorMessage(e.getMessage());
				}
				getMessage.append("\n" + message);
				int pos =getMessage.getText().length();
				getMessage.setCaretPosition(pos);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==setMessage){
					String message =setMessage.getText();
				try{
					out.write("클라이언트 > " + message + "\n");
					out.flush();
					getMessage.append("\n 클라이언트 >" + message);
					int pos =getMessage.getText().length();
					getMessage.setCaretPosition(pos);
					setMessage.setText(null);
				}catch(IOException e1){
					errorMessage(e1.getMessage());
				}
				
			}
			
	}
	
	public static void main(String[] args){
				new ChatClient();
	}
}






