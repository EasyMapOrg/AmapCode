package com.amap.bundle.datamodel;

import java.io.Serializable;

public interface IResultData extends Serializable {
    Class<?> getClassType();

    String getKey();

    boolean hasData();

    void reset();

    void restoreData();

    void saveData();

    void setKey(String str);
}
