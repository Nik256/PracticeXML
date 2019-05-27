package demo;

import service.ConverterXMLJSON;
import service.ParserXML;
import service.ValidatorXML;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class DemoService {
    public void execute() {
        File xmlFile = new File(getResource("goods.xml"));
        File xsdFile = new File(getResource("goods.xsd"));

        ConverterXMLJSON converter = new ConverterXMLJSON();
        converter.convertXMLtoJSON(xmlFile.getPath(), "src/main/resources/goods.json");
        converter.convertJSONtoXML("src/main/resources/goods.json", "goods.xml");
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
