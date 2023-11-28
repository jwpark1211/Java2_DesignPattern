package solution;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ElementXMLLoader implements FileLoader<solution.Element>{

    @Override
    public List<solution.Element> load(String filePath) {
        System.out.println("file import: "+filePath);
        List<solution.Element> elementList = new ArrayList<>();

        try {
            // org.w3c.dom.Element와 solution.Element의 혼동 방지를 위해 solution. 표기
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();

            NodeList elementNodeList = document.getElementsByTagName("Element");

            for (int i = 0; i < elementNodeList.getLength(); i++) {
                //XML 파일 -> Element 객체로 parsing 
                Element elementElement = (Element) elementNodeList.item(i);
                int number = Integer.parseInt(elementElement.getElementsByTagName("Number").item(0).getTextContent());
                String name = elementElement.getElementsByTagName("Name").item(0).getTextContent();
                String symbol = elementElement.getElementsByTagName("Symbol").item(0).getTextContent();
                double weight = Double.parseDouble(elementElement.getElementsByTagName("Weight").item(0).getTextContent());

                solution.Element element = new solution.Element(number, name, symbol, weight);
                //List에 저장 
                elementList.add(element);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //elementList 반환 
        return elementList;
    }

    
}
