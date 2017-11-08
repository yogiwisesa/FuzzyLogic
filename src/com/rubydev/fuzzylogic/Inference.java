package com.rubydev.fuzzylogic;

/**
 * Created by Yogi Wisesa on 10/23/2017.
 */
public class Inference {
    private String name;
    private float value;

    public Inference(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
