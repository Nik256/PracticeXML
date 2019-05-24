package service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import entity.Goods;

import java.io.File;
import java.io.IOException;

public class ConverterXMLJSON {
    public void convertXMLtoJSON(String data) {
        //XmlMapper xmlMapper = new XmlMapper();
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        Goods goods = null;
        try {
            goods = xmlMapper.readValue(data, Goods.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(goods);
//        try {
//            JsonNode jsonNode = xmlMapper.readTree(data.getBytes());
//            ObjectMapper objectMapper = new ObjectMapper();
//            String value = objectMapper.writeValueAsString(jsonNode);
//            objectMapper.writeValue(new File("src/main/resources/goods.json"), value);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void convertJSONtoXML(String data) {
        ObjectMapper objectMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();
        try {
            JsonNode tree = objectMapper.readTree(data);
            String jsonAsXml = xmlMapper.writer().withRootName("goods").writeValueAsString(tree);
            System.out.println(jsonAsXml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
