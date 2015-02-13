
import java.awt.*;
import javax.swing.*;



public class Round14_01_Applet extends JApplet{
	
	private String name;
	private String addr;
	
	public void init(){
		name =this.getParameter("name");   // 초기화 매개 변수 name의 값을 획득한다.
		addr =this.getParameter("addr");	// 초기화 매개 변수 addr 의 값을 획득한다.
	}
	
	
	public void paint(Graphics g){
		
		g.drawString(name, 50, 100);
		g.drawString(addr, 50, 150);
	}
	
	
	
	
	
	

}
