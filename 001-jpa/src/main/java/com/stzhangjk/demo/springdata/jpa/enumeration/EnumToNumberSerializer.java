package com.stzhangjk.demo.springdata.jpa.enumeration;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class EnumToNumberSerializer extends JsonSerializer<CodeAndDescEnum> {
    @Override
    public void serialize(CodeAndDescEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeNull();
        } else {
            gen.writeObject(value.toCode());
        }
    }
}
