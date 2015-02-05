import javax.xml.parsers.*;
import org.w3c.dom.*;

public class GetFirstBookInfo {
	
	public static void main(String[] args) throws Exception{
		
		//Dom 파서 생성
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder  builder =factory.newDocumentBuilder();
		
		//XML 문서 파싱하기
		Document document =builder.parse("xml_two/bml.xml");
		
		
		//첫번째 book 엘리먼트  정보 얻기
		Element eRoot =(Element)document.getDocumentElement();
//				
//				<title>VB And XML</title>
//		        <author>최준호</author>
//		        <publisher>프리렉</publisher>
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
		System.out.println("출판사 :" + strPublisher);
		
		
		Element ePrice =(Element)ePublisher.getNextSibling();
		Text tPrice =(Text)ePrice.getFirstChild();
		String strPrice =tPrice.getData();
		System.out.println("가격 :" + strPrice);
	}
}















