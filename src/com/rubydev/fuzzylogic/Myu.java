package com.rubydev.fuzzylogic;

/**
 * Created by Yogi Wisesa on 10/22/2017.
 */
public class Myu {
    private String fungsiKeanggotaan;
    private float value;

    public Myu() {
    }

    public Myu(String fungsiKeanggotaan, float value) {
        this.fungsiKeanggotaan = fungsiKeanggotaan;
        this.value = value;
    }

    public String getFungsiKeanggotaan() {
        return fungsiKeanggotaan;
    }

    public void setFungsiKeanggotaan(String fungsiKeanggotaan) {
        this.fungsiKeanggotaan = fungsiKeanggotaan;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
