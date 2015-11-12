package com.tavi.objects;

import com.tavi.ObjectWithAttributes;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tavi on 11/11/2015.
 */
public class FooFooObject {
    List<ObjectWithAttributes> thelist;

    public FooFooObject() {
        List<ObjectWithAttributes> theList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            theList.add(new ObjectWithAttributes("key".concat(String.valueOf(i)), "val".concat(String.valueOf(i))));
        }

        this.setThelist(theList);
        System.out.println(this);
    }

    public List<ObjectWithAttributes> getThelist() {
        return thelist;
    }

    public void setThelist(List<ObjectWithAttributes> thelist) {
        this.thelist = thelist;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("thelist", StringUtils.join(thelist.toArray(), ',')).
                toString();
    }
}
