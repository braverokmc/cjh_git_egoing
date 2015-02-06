import java.io.*;
import java.util.*;

class Friend implements Serializable{
	private String name;
	private String tel;
	private String addr;
	public Friend() {}
	public Friend(String name, String tel, String addr){
		super();
		this.name=name;
		this.tel =tel;
		this.addr =addr;
		
	}
	public String getName(){	return name;}
	public String getTel(){ return tel; }
	public String getAddr() { return addr; }
	
	public void setName(String name){ this.name = name; }
	public void setTel(String tel) { this.tel =tel; }
	public void setAddr(String addr) { this.addr=addr; }
	
}


public class Round09_Object {
	
	public static void main(String[] args){
		Vector<Friend> vc =new Vector<Friend>();
		Scanner in = new Scanner(System.in);
		ObjectInputStream  f_in = null;
		ObjectOutputStream f_out =null;
		File dir =new File("C:/Users/cyj/Desktop/imsi");
		if(!dir.exists()) dir.mkdir();
		while(true){
			System.out.print("1.친구 추가 2.전체보기 3.파일로 저장 4.불러오기 5.종료 =");
			int dist =in.nextInt();
			in.nextLine();
			switch(dist){
					case 1:
						Friend f =new Friend();
						System.out.print("친구이름=");
						f.setName(in.nextLine());
						System.out.print("친구전화번호=");
						f.setTel(in.nextLine());
						System.out.print("친구집주소=");
						f.setAddr(in.nextLine());
						vc.add(f);
						System.out.println("친구 정보가 추가 되었습니다.");
						break;
					case 2:
						for(Friend obj: vc){
							System.out.println(obj.getName() +  " : ");
							System.out.print(obj.getTel() + " : ");
							System.out.println(obj.getAddr());
						}
						System.out.println("전체 " + vc.size() + "명의 친구!");
						break;
					case 3:
						System.out.print("저장할 파일명 =");
						String filename =in.nextLine();
						try{
							f_out =new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(dir, filename)), 1024));
							f_out.writeObject(vc);
							f_out.close();
							System.out.println("친구 목록이 파일로 잘 저장되었습니다.");
						}catch(IOException e) {}
						break;
					case 4:
						System.out.print("불러올 파일명 = ");
						filename =in.nextLine();
						try{
							File file = new File(dir, filename);
							if(!file.exists()){
								System.out.println("파일이 존재하지 않습니다.");
								 break;
							}
							f_in =new ObjectInputStream(new BufferedInputStream(new FileInputStream(file), 1024));
							
							Object obj=null;
							
							try{
								obj=f_in.readObject();
							}catch(ClassNotFoundException ee){}
							f_in.close();
							vc.clear();
							vc=(Vector)obj;
							System.out.println("친구 목록을 읽어 왔습니다.");
						}catch(IOException e){
							System.out.println(e.getMessage());
						}
						break;
				
					case 5:
						System.out.println("시스템 종료!");
						System.exit(0);
					
					default :
						System.out.println("잘못 입력 하셨습니다.");
			
			}// switch
			System.out.println();
		}//while
		
		
	}
	
	
	
	
}












