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
        File jsonFile = new File(getResource("goods.json"));

//        ValidatorXML validatorXML = new ValidatorXML();
//        boolean isValid = validatorXML.validate(xmlFile, xsdFile);
//        System.out.printf("goods.xml validation = %b.\n\n", isValid);
//
//        ParserXML parserXML = new ParserXML();
//        parserXML.showXMLStructure(xmlFile);

        String data = readFileToString(xmlFile.getPath());
        ConverterXMLJSON converter = new ConverterXMLJSON();
        converter.convertXMLtoJSON(data);
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


    private static String readFileToString(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
