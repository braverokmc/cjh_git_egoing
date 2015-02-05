import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.xml.internal.ws.resources.ClientMessages;

public class ChatServer extends JFrame implements ActionListener{
	BufferedReader in=null;
	BufferedWriter out=null;
	Socket socket=null;
	ServerSocket severSocket =null;
	
	JTextField serverMessage ;
	
	JScrollPane spane;
	Receiver clinetMessage;
	
	public ChatServer(){
		setTitle("서버 채팅 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		
		clinetMessage = new Receiver();
		clinetMessage.setEditable(false);
		Thread t = new Thread(clinetMessage);
		
		serverMessage = new JTextField();
		serverMessage.addActionListener(this);
		
		
		spane =new JScrollPane(clinetMessage);
		add(spane, BorderLayout.CENTER);
		add(serverMessage, BorderLayout.SOUTH);
		setSize(400, 200);
		setVisible(true);
		
		try{
			setupConnection();
			
		}catch(IOException e){
			handleError(e.getMessage());
		}
		t.start();
	}
	
	private void setupConnection() throws IOException{
		severSocket =new ServerSocket(9999);
		socket=severSocket.accept();
		System.out.println("연결됨");
		in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	
	private static void handleError(String string){
		System.out.println(string);
		System.exit(0);
	}
	
	
	
	
	private class Receiver extends JTextArea implements Runnable{
		public void run(){
			String inputMessage=null;
			while(true){
				try{
					inputMessage= in.readLine();
				}catch(IOException e){
					handleError(e.getMessage());
				}
				clinetMessage.append("\n" + inputMessage);
				int pos =clinetMessage.getText().length();
				clinetMessage.setCaretPosition(pos);
			}
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==serverMessage){
			String outputMessage =serverMessage.getText();
			try{
				out.write("서버 > " + outputMessage + "\n" );
				out.flush();
				clinetMessage.append("\n서버 > " + outputMessage);
				int pos =clinetMessage.getText().length();
				clinetMessage.setCaretPosition(pos);
				serverMessage.setText(null);
			}catch(IOException e1){
				handleError(e1.getMessage());
			}
		}
	}
	
	
	public static void main(String[] arg){
		new ChatServer();
	}
	
}
