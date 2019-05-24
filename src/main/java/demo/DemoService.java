package demo;

import service.ParserXML;
import service.ValidatorXML;

import java.io.File;
import java.net.URL;
import java.util.Objects;

public class DemoService {
    public void execute() {
        File xmlFile = new File(getResource("goods.xml"));
        File xsdFile = new File(getResource("goods.xsd"));

        ValidatorXML validatorXML = new ValidatorXML();
        boolean isValid = validatorXML.validate(xmlFile, xsdFile);
        System.out.printf("goods.xml validation = %b.\n\n", isValid);

        ParserXML parserXML = new ParserXML();
        parserXML.showXMLStructure(xmlFile);
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
