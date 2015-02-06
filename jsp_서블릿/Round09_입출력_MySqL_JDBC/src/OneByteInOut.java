
import java.io.*;
import java.nio.Buffer;
import java.net.*;


public class OneByteInOut {

	public static void main(String[] args) throws IOException{
	
		
		FileOutputStream  fos1 =new FileOutputStream(FileDescriptor.out);
		BufferedOutputStream bos1 =new BufferedOutputStream(fos1, 1024);
		DataOutputStream  dos1 =new DataOutputStream(bos1);
		dos1.write(null);
		
		File file2=new File("파일이름");
		FileOutputStream fos2=new FileOutputStream(file2, false);
		BufferedOutputStream bos2 =new BufferedOutputStream(fos2, 1024);
		DataOutputStream dos=new DataOutputStream(bos2);
		bos2.write(null);
		
		Socket soc3 =new Socket("localhsot", 83234);
		BufferedOutputStream bos3 =new BufferedOutputStream(soc3.getOutputStream(), 1024);
		DataOutputStream dos3 =new DataOutputStream(bos3);
		dos3.write(null);
		
		FileInputStream fis4 =new FileInputStream(FileDescriptor.in);
		BufferedInputStream bis4 =new BufferedInputStream(fis4, 1024);
		DataInputStream dis4 = new DataInputStream(bis4);
		dis4.read();
		
		Socket soc5 =new Socket("localhost", 4323);
		BufferedInputStream bos5= new  BufferedInputStream(soc5.getInputStream(), 3213);
		DataInputStream da=new  DataInputStream(bos5);
		
		
		
		
		
	}
}











