package com.bluelinelabs.logansquare.processor.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.Date;

public abstract class BaseAutoModel {

    public abstract String string();

    public abstract Date date();

    public abstract int testInt();

    public abstract long testLong();

    public abstract float testFloat();

    public abstract double testDouble();

    public abstract String testString();

    public abstract Integer testIntObj();

    public abstract Long testLongObj();

    public abstract Float testFloatObj();

    public abstract Double testDoubleObj();

    public static BaseAutoModel create() {
        return new AutoModel();
    }
}
