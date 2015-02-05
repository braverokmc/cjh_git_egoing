import javax.xml.parsers.*;

import org.w3c.dom.*;

public class GetRootElement {

	public static void main(String[] args) throws Exception{
	
		 
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder =factory.newDocumentBuilder();
		
		
		//XML 문서 파싱하기
		Document document = builder.parse("xml_two/bml.xml");
		
		//루트 엘리먼트 참조 얻기
		Element eRoot = document.getDocumentElement(); 
		
		Element eBook =(Element)eRoot.getFirstChild();		
		Element eTitle=(Element)eBook.getFirstChild();
		Text tTitle =(Text)eTitle.getFirstChild();
		String strTitle=tTitle.getData();
		
		//루트 엘리먼트 이름 출력
		System.out.println(strTitle);
		
		
	}
}
