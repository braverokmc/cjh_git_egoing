package Study_one;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class GetRootElement {

	public static void main(String[] arg) throws Exception{
		
		//DOM �ļ� ����
		DocumentBuilderFactory  factory = DocumentBuilderFactory.newInstance();	
		DocumentBuilder builder =factory.newDocumentBuilder();
		
		//XML ���� �Ľ��ϱ�
		Document document =builder.parse("xml_two/bml.xml");
		
		
		//��Ʈ ������Ʈ ���� ���
		Element eRoot =document.getDocumentElement();
		
		
		Element eBook =(Element)eRoot.getFirstChild();		
		
		
		//��Ʈ ������Ʈ �̸� ���
		System.out.println(eBook);
		
		
		
		
	
	}
}
