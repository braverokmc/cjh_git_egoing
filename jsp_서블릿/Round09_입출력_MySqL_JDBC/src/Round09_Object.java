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
			System.out.print("1.ģ�� �߰� 2.��ü���� 3.���Ϸ� ���� 4.�ҷ����� 5.���� =");
			int dist =in.nextInt();
			in.nextLine();
			switch(dist){
					case 1:
						Friend f =new Friend();
						System.out.print("ģ���̸�=");
						f.setName(in.nextLine());
						System.out.print("ģ����ȭ��ȣ=");
						f.setTel(in.nextLine());
						System.out.print("ģ�����ּ�=");
						f.setAddr(in.nextLine());
						vc.add(f);
						System.out.println("ģ�� ������ �߰� �Ǿ����ϴ�.");
						break;
					case 2:
						for(Friend obj: vc){
							System.out.println(obj.getName() +  " : ");
							System.out.print(obj.getTel() + " : ");
							System.out.println(obj.getAddr());
						}
						System.out.println("��ü " + vc.size() + "���� ģ��!");
						break;
					case 3:
						System.out.print("������ ���ϸ� =");
						String filename =in.nextLine();
						try{
							f_out =new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(dir, filename)), 1024));
							f_out.writeObject(vc);
							f_out.close();
							System.out.println("ģ�� ����� ���Ϸ� �� ����Ǿ����ϴ�.");
						}catch(IOException e) {}
						break;
					case 4:
						System.out.print("�ҷ��� ���ϸ� = ");
						filename =in.nextLine();
						try{
							File file = new File(dir, filename);
							if(!file.exists()){
								System.out.println("������ �������� �ʽ��ϴ�.");
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
							System.out.println("ģ�� ����� �о� �Խ��ϴ�.");
						}catch(IOException e){
							System.out.println(e.getMessage());
						}
						break;
				
					case 5:
						System.out.println("�ý��� ����!");
						System.exit(0);
					
					default :
						System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			
			}// switch
			System.out.println();
		}//while
		
		
	}
	
	
	
	
}












