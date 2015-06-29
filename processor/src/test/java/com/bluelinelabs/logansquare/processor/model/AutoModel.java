package com.bluelinelabs.logansquare.processor.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.Date;

@JsonObject(serializeNullObjects = true)
public class AutoModel extends BaseAutoModel {

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

    @Override
    public String string() {
        return string;
    }

    @Override
    public Date date() {
        return date;
    }

    @Override
    public int testInt() {
        return testInt;
    }

    @Override
    public long testLong() {
        return testLong;
    }

    @Override
    public float testFloat() {
        return testFloat;
    }

    @Override
    public double testDouble() {
        return testDouble;
    }

    @Override
    public String testString() {
        return testString;
    }

    @Override
    public Integer testIntObj() {
        return testIntObj;
    }

    @Override
    public Long testLongObj() {
        return testLongObj;
    }

    @Override
    public Float testFloatObj() {
        return testFloatObj;
    }

    @Override
    public Double testDoubleObj() {
        return testDoubleObj;
    }

}
