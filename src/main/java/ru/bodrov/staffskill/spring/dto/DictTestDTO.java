package ru.bodrov.staffskill.spring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.staffskill.spring.model.DictTestEnt;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class DictTestDTO {

    @Nullable
    private String id;

    @Nullable
    private String nameType;

    public DictTestDTO(final DictTestEnt dictTestEnt){
        if(dictTestEnt==null) return;
        id=dictTestEnt.getId();
        nameType=dictTestEnt.getNameType();
    }

    public DictTestDTO(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
