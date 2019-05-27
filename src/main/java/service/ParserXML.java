package service;

import entity.Goods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.simple.SimpleLogger;

import javax.xml.bind.*;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ParserXML {
    final static Logger log = LogManager.getLogger(ParserXML.class.getName());

    public static void showXMLStructure(File xmlFile) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(xmlFile));

            JAXBContext context = JAXBContext.newInstance(Goods.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            JAXBElement<Goods> jb = unmarshaller.unmarshal(xmlEventReader, Goods.class);
            Goods goods = jb.getValue();
            log.info(goods.toString());
        } catch (JAXBException | XMLStreamException | FileNotFoundException e) {
            log.error(e.getStackTrace());
        }
    }
}