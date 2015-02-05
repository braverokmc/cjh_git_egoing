import javax.xml.parsers.*;
import org.w3c.dom.*;

public class GetFirstBookInfo {
	
	public static void main(String[] args) throws Exception{
		
		//Dom �ļ� ����
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder  builder =factory.newDocumentBuilder();
		
		//XML ���� �Ľ��ϱ�
		Document document =builder.parse("xml_two/bml.xml");
		
		
		//ù��° book ������Ʈ  ���� ���
		Element eRoot =(Element)document.getDocumentElement();
//				
//				<title>VB And XML</title>
//		        <author>����ȣ</author>
//		        <publisher>������</publisher>
//		        <price>2000</price>
//		
//		
		Element eBook =(Element)eRoot.getFirstChild();
		Element eTitle =(Element)eBook.getFirstChild();
		Text  tText =(Text)eTitle.getFirstChild();
		String strTitle =tText.getData();
		System.out.println("Title : " + strTitle);
		
		
		
		Element eAuthor =(Element)eTitle.getNextSibling();
		Text  tAuthor =(Text)eAuthor.getFirstChild();
		String strAuthor =tAuthor.getData();
		System.out.println("author : " + strAuthor);
		
		
		Element  ePublisher =(Element)eAuthor.getNextSibling();
		Text tPublisher =(Text)ePublisher.getFirstChild();
		String strPublisher =tPublisher.getData();
		System.out.println("���ǻ� :" + strPublisher);
		
		
		Element ePrice =(Element)ePublisher.getNextSibling();
		Text tPrice =(Text)ePrice.getFirstChild();
		String strPrice =tPrice.getData();
		System.out.println("���� :" + strPrice);
	}
}















