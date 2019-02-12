package com.wigball.mapstruct.issue.mapper;

import com.wigball.mapstruct.issue.model.SourceClass;
import com.wigball.mapstruct.issue.model.TargetClass;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import static java.lang.Boolean.FALSE;
import static org.mapstruct.NullValueMappingStrategy.RETURN_DEFAULT;

@Mapper
public abstract class GreatMapper {

    public static final GreatMapper MAPPER = Mappers.getMapper(GreatMapper.class);

    @Mappings({
            @Mapping(source = "str", target = "name"),
            @Mapping(source = "sourceClass.anXmlFlag", target = "oneFlag", defaultValue = "false"),
            @Mapping(source = "sourceClass.anotherXmlFlag", target = "anotherFlag", defaultValue = "false")
    })
    @BeanMapping(nullValueMappingStrategy = RETURN_DEFAULT)
    public abstract TargetClass mapSourceClass(String str, SourceClass sourceClass);

    @ObjectFactory
    protected TargetClass createDefaultTargetClass() {
        return new TargetClass(null, FALSE, FALSE);
    }
}
