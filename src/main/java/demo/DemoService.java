package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.ConverterXMLJSON;
import service.ParserXML;
import service.ValidatorXML;

import java.io.File;
import java.net.URL;
import java.util.Objects;

public class DemoService {
    final static Logger log = LogManager.getLogger(DemoService.class.getName());

    public void execute() {
        File xml = new File("src/main/resources/goods.xml");
        ParserXML.showXMLStructure(xml);

        File xsd = new File("src/main/resources/goods.xsd");
        log.info("XML is valid? " + ValidatorXML.validate(xml, xsd));

        File json = new File("src/main/resources/converted/goods.json");
        ConverterXMLJSON.convertXMLtoJSON(xml.getPath(), json.getPath());
        ConverterXMLJSON.convertJSONtoXML(json.getPath(), "src/main/resources/converted/goods.xml");
    }

    private String getResource(String filename) {
        URL resource = getClass().getClassLoader().getResource(filename);
        try {
            Objects.requireNonNull(resource);
        } catch (NullPointerException e) {
            System.out.println(filename + " not found");
        }
        return resource.getFile();
    }
}
