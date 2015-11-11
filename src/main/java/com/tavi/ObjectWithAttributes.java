package com.tavi;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by Tavi on 11/11/2015.
 */
public class ObjectWithAttributes {
    public String attr1;
    public String attr2;

    public ObjectWithAttributes(String attr1, String attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("attr1", attr1).
                append("attr2", attr2).
                toString();
    }
}
