import javax.xml.parsers.*;
import org.w3c.dom.*;

public class GetLastBookPrice {
	
	public static void main(String[] args) throws Exception{
			
		//DOM 파서 생성
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder builder =factory.newDocumentBuilder();
		
		// XML 문서 파싱하기
		Document document =builder.parse("xml_two/bml.xml");
		
		//루트 엘리먼트 참조 얻기
		
		Element eRoot =document.getDocumentElement();
		System.out.println(eRoot);
		
		
		Element eBook =(Element)eRoot.getLastChild();
		System.out.println(eBook);
		
		Element ePrice =(Element)eBook.getLastChild();
		
		System.out.println(ePrice);
		
		Text  tPrice =(Text)ePrice.getFirstChild();
		
		String strPrice=tPrice.getData();
		
		System.out.println(strPrice);
	
	}
}





