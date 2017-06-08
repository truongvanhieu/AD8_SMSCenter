package com.example.hieutruongvan.ad8_smscenter;

/**
 * Created by hieu.truongvan on 6/7/2017.
 */

public class Field {
    String feild, type;

    public Field(String feild, String type) {
        this.feild = feild;
        this.type = type;
    }

    public Field() {
        this.feild = "";
        this.type = "";
    }

    public String getFeild() {
        return feild;
    }

    public void setFeild(String feild) {
        this.feild = feild;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
