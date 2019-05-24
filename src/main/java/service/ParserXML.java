package service;

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

public class ParserXML {
    public void showXMLStructure(File xmlFile) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(xmlFile));

            JAXBContext context = JAXBContext.newInstance(Good.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.peek();

                if (xmlEvent.isStartElement() && xmlEvent.asStartElement().getName().getLocalPart().equals("good")) {
                    Good good = unmarshaller.unmarshal(xmlEventReader, Good.class).getValue();
                    System.out.println("\t" + good);
                } else if (xmlEvent.isStartElement() || xmlEvent.isEndElement()) {
                    System.out.println(xmlEvent.toString());
                }
                xmlEventReader.nextEvent();
            }
        } catch (JAXBException | XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
