import javax.xml.parsers.*;
public class CreateDOMParser {
	public static void main(String[] args) throws Exception{
		//DOM �ļ� ���� ����
		DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
		
		factory.setIgnoringElementContentWhitespace(true);
		factory.setValidating(true);
		factory.setNamespaceAware(true);
		
		//DOM �ļ� ����
		DocumentBuilder parser =factory.newDocumentBuilder();
		System.out.println("DOM �ļ� ��ü ���� ����");
			
	}
}
