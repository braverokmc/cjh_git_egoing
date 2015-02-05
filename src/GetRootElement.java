import javafx.util.BuilderFactory;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class GetRootElement {

	public static void main(String[] args) throws Exception{
	
		DocumentBuilderFactory  buildFactory =  DocumentBuilderFactory.newInstance();
		buildFactory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder   builder =buildFactory.newDocumentBuilder();
		
		
		Document document =builder.parse("xml_two/bml.xml");
		
		
		Element eRoot =document.getDocumentElement();
		Element eBook =(Element)eRoot.getFirstChild();
		Element eTitle=(Element)eBook.getFirstChild();
		
		Text tTitle =(Text)eTitle.getFirstChild();
		
		
		String data =tTitle.getData();
		
		System.out.println(data);
		
		
	}
}
