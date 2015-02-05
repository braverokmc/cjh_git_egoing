import javax.xml.parsers.*;
import org.w3c.dom.*;


public class GetFirstBookKind {
	public static void main(String[] args) throws Exception{
			
		//DOM 파서 생성
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder builder =factory.newDocumentBuilder();
		
		Document document =builder.parse("xml_two/bml.xml");
		
		Element eRoot =document.getDocumentElement();
		
		
		System.out.println(eRoot);
		
		
		Element eBook =(Element)eRoot.getFirstChild();
		String strKind =eBook.getAttribute("kind");
		
		
		System.out.println(strKind);
		
		
	}
}
