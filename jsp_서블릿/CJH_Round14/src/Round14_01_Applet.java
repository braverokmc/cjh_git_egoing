
import java.awt.*;
import javax.swing.*;



public class Round14_01_Applet extends JApplet{
	
	private String name;
	private String addr;
	
	public void init(){
		name =this.getParameter("name");   // �ʱ�ȭ �Ű� ���� name�� ���� ȹ���Ѵ�.
		addr =this.getParameter("addr");	// �ʱ�ȭ �Ű� ���� addr �� ���� ȹ���Ѵ�.
	}
	
	
	public void paint(Graphics g){
		
		g.drawString(name, 50, 100);
		g.drawString(addr, 50, 150);
	}
	
	
	
	
	
	

}
