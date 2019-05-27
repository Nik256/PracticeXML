package service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import entity.Goods;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ConverterXMLJSON {
    public void convertXMLtoJSON(String filePathXML, String filePathJSON) {
        String data = readFileToString(filePathXML);
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        try {
            Goods goods = xmlMapper.readValue(data, Goods.class);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(filePathJSON), goods);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void convertJSONtoXML(String filePathJSON, String filePathXML) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Goods goods = objectMapper.readValue(new File(filePathJSON), Goods.class);
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File(filePathXML), goods);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFileToString(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
