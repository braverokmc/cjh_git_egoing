import java.io.*;
public class FileInOut {

	public static void main(String[] args) throws IOException{
		
		
		File  file = new File("C:/Users/cyj/Desktop/�� JAVA.hwp" );
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream  dis = new DataInputStream(bis);
		
		
		String string ="";
		
		while(dis.read()!=-1){
			
			string =dis.readLine();
			
			System.out.println(string);
			
			
		}
		
		
		
		
	}
	
	
	
	
}
