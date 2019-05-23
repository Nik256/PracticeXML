package parsing;

import entity.Good;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ParsingService {
    public void parser() throws FileNotFoundException, XMLStreamException, JAXBException {
        File file = new File("goods.xml");
        // STAX
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(
                new FileInputStream("C:\\Users\\Nikita_Shirobokov\\IdeaProjects\\PracticeXML\\src\\main\\resources\\goods.xml"));

        // JAXBxmlEvent.isStartElement()
        JAXBContext context = JAXBContext.newInstance(Good.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        while(xmlEventReader.hasNext()) {
            XMLEvent xmlEvent = xmlEventReader.peek();
            if(xmlEvent.isStartElement() && xmlEvent.asStartElement().getName().getLocalPart().equals("good")) {
                Good good = unmarshaller.unmarshal(xmlEventReader, Good.class).getValue();
                System.out.println(good);
            }
            xmlEventReader.nextEvent();
        }
    }
}
