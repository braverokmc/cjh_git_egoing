import javax.xml.parsers.*;

import org.w3c.dom.*;

public class GetRootElement {

	public static void main(String[] args) throws Exception{
	
		 
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder =factory.newDocumentBuilder();
		
		
		//XML ���� �Ľ��ϱ�
		Document document = builder.parse("xml_two/bml.xml");
		
		//��Ʈ ������Ʈ ���� ���
		Element eRoot = document.getDocumentElement(); 
		
		Element eBook =(Element)eRoot.getFirstChild();		
		Element eTitle=(Element)eBook.getFirstChild();
		Text tTitle =(Text)eTitle.getFirstChild();
		String strTitle=tTitle.getData();
		
		//��Ʈ ������Ʈ �̸� ���
		System.out.println(strTitle);
		
		
	}
}
