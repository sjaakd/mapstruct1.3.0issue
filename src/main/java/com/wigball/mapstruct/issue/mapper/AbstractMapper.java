package com.wigball.mapstruct.issue.mapper;

import com.wigball.mapstruct.issue.model.SourceClass;
import com.wigball.mapstruct.issue.model.TargetClass;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ObjectFactory;

import static java.lang.Boolean.FALSE;

@Mapper
public abstract class AbstractMapper {

    @Mappings({
            @Mapping(source = "str", target = "aString"),
            @Mapping(source = "sourceClass.anXmlFlag", target = "aFlag"),
            @Mapping(source = "sourceClass.anotherXmlFlag", target = "anotherFlag")
    })
    public abstract TargetClass mapSourceClass(String str, SourceClass sourceClass);

    @ObjectFactory
    protected TargetClass createTargetObject() {
        return new TargetClass("", FALSE, FALSE);
    }
}
