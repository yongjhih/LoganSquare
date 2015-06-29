package com.bluelinelabs.logansquare.processor.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.fasterxml.jackson.core.*;

import java.util.Date;
import java.util.List;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import java.io.IOException;

@JsonObject(serializeNullObjects = true)
public class CustomConverterInListModel {

    @JsonField
    public String string;

    @JsonField
    public Date date;

    @JsonField(name = "test_int")
    public int testInt;

    @JsonField(name = "test_long")
    public long testLong;

    @JsonField(name = "test_float")
    public float testFloat;

    @JsonField(name = "test_double")
    public double testDouble;

    @JsonField(name = "test_string")
    public String testString;

    @JsonField(name = "test_int_obj")
    public Integer testIntObj;

    @JsonField(name = "test_long_obj")
    public Long testLongObj;

    @JsonField(name = "test_float_obj")
    public Float testFloatObj;

    @JsonField(name = "test_double_obj")
    public Double testDoubleObj;

    @JsonField(name = "models", typeConverter = BaseAutoModelConverter.class)
    public List<BaseAutoModel> models;

    public static class BaseAutoModelConverter implements TypeConverter<BaseAutoModel> {
        @Override
        public BaseAutoModel parse(JsonParser jsonParser) throws IOException {
            return AutoModel$$JsonObjectMapper._parse(jsonParser);
        }
        @Override
        public void serialize(BaseAutoModel object, String fieldName, boolean writeFieldNameForObject, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName(fieldName);
            AutoModel$$JsonObjectMapper._serialize((AutoModel) object, jsonGenerator, true);
        }
    }
}
