package com.wigball.mapstruct.issue.mapper;

import com.wigball.mapstruct.issue.model.TargetClass;
import org.junit.Before;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertFalse;

public class GreatMapperTest {

    private GreatMapper greatMapper;

    @Before
    public void setup() throws Exception {
        greatMapper = Mappers.getMapper(GreatMapper.class);
    }

    @Test
    public void testMapping() throws Exception {
        TargetClass targetClass = greatMapper.mapSourceClass("a string", null);
        assertFalse(targetClass.getOneFlag());
        assertFalse(targetClass.getAnotherFlag());
    }
}
