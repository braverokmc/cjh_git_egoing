import javax.xml.parsers.*;
import org.w3c.dom.*;

public class ModifyFirstBook {

	public static void main(String[] args) throws Exception{
	
		//DOM �ļ� ����
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder builder =factory.newDocumentBuilder();
		
		
		//XML ���� �Ľ��ϱ�
		Document document =builder.parse("xml_two/bml.xml");
		
		//��Ʈ ������Ʈ ���� ���
		Element eRoot =document.getDocumentElement();
		
		Element eBook =(Element)eRoot.getFirstChild();
		Element eTitle =(Element)eBook.getFirstChild();
		Text tTitle =(Text)eTitle.getFirstChild();
		tTitle.setData("������ ���� ����");
		System.out.println("���� �� ���� : "+ tTitle.getData());
		
		eBook.setAttribute("kind", "������");
		System.out.println("������ ���� :" + eBook.getAttribute("kind"));
		
		
		
	}
}



























