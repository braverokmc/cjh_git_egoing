import javax.xml.parsers.*;
import org.w3c.dom.*;

public class ModifyFirstBook {

	public static void main(String[] args) throws Exception{
	
		//DOM 파서 생성
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder builder =factory.newDocumentBuilder();
		
		
		//XML 문서 파싱하기
		Document document =builder.parse("xml_two/bml.xml");
		
		//루트 엘리먼트 참조 얻기
		Element eRoot =document.getDocumentElement();
		
		Element eBook =(Element)eRoot.getFirstChild();
		Element eTitle =(Element)eBook.getFirstChild();
		Text tTitle =(Text)eTitle.getFirstChild();
		tTitle.setData("성공을 위한 열쇠");
		System.out.println("수정 후 제목 : "+ tTitle.getData());
		
		eBook.setAttribute("kind", "강남콩");
		System.out.println("수정후 종류 :" + eBook.getAttribute("kind"));
		
		
		
	}
}



























