import java.io.*;
import java.net.Socket;

import jdk.internal.util.xml.impl.Input;

public class OutputSteamWr {

	public static void main(String[] args) throws IOException{
	
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw =new BufferedWriter(osw);
		PrintWriter  pw =new PrintWriter(bw);
		pw.println();
		
		Socket soc=new Socket();
		OutputStreamWriter osw1 =new OutputStreamWriter(soc.getOutputStream());
		BufferedWriter bw1 =new BufferedWriter(osw1);
		PrintWriter pw1 = new PrintWriter(bw);
		pw.println();
		
		///  2 바이트 입력
		
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr);
		br1.readLine();
		
		File file = new File("파일이름");
		FileReader fr=new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		
		Socket socc= new Socket();
		InputStreamReader isrr =new InputStreamReader(socc.getInputStream());
		BufferedReader bre = new BufferedReader(isrr);
		br.readLine();
		
		
		
		
	}
}






