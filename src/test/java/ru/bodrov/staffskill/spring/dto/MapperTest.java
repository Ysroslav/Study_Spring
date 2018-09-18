package ru.bodrov.staffskill.spring.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.bodrov.staffskill.spring.model.DictTestEnt;

import java.io.IOException;

public class MapperTest {

    @Test
    public void testSerializeJSON() throws JsonProcessingException {
       final DictTestDTO dictTestDTO = new DictTestDTO();
       dictTestDTO.setId("1");
       dictTestDTO.setNameType("My Test");

       final ObjectMapper mapper = new ObjectMapper();
       final String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(dictTestDTO);
       Assert.assertNotNull(json);
       System.out.println(json);
    }

    @Test
    public void testDeserializeJSON() throws IOException{
        final String json = "{\"id\": \"123\", \"nameType\" :\"My Test\" }";
        final ObjectMapper mapper = new ObjectMapper();
        final DictTestDTO dictTestDTO = mapper.readValue(json, DictTestDTO.class);
        Assert.assertNotNull(dictTestDTO);
        Assert.assertNotNull(dictTestDTO.getId());
        Assert.assertNotNull(dictTestDTO.getNameType());
    }

    @Test
    public void testSerializeXML() throws JsonProcessingException{
        final DictTestDTO dictTestDTO = new DictTestDTO();
        dictTestDTO.setId("1");
        dictTestDTO.setNameType("My Test");

        final ObjectMapper mapper = new XmlMapper();
        final String xml = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(dictTestDTO);
        Assert.assertNotNull(xml);
        System.out.println(xml);
    }

    @Test
    public void testDeserializeXML() throws IOException{
        final String json = "<item><id>123</id><nameType>My Test</nameType></item>";
        final XmlMapper mapper = new XmlMapper();
        final DictTestDTO dictTestDTO = mapper.readValue(json, DictTestDTO.class);
        Assert.assertNotNull(dictTestDTO);
        Assert.assertNotNull(dictTestDTO.getId());
        Assert.assertNotNull(dictTestDTO.getNameType());
    }
}
