package com.rubydev.fuzzylogic;

/**
 * Created by Yogi Wisesa on 10/22/2017.
 */
public class Data {
    private String nama;
    private int emosi, provokasi;
    private Boolean hoax;


    public Data(String nama, int emosi, int provokasi) {
        this.nama   = nama;
        this.emosi = emosi;
        this.provokasi = provokasi;
    }

    public Data(String nama, int emosi, int provokasi, Boolean hoax) {
        this.nama = nama;
        this.emosi = emosi;
        this.provokasi = provokasi;
        this.hoax = hoax;
    }

    public int getEmosi() {
        return emosi;
    }

    public void setEmosi(int emosi) {
        this.emosi = emosi;
    }

    public int getProvokasi() {
        return provokasi;
    }

    public void setProvokasi(int provokasi) {
        this.provokasi = provokasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Boolean getHoax() {
        return hoax;
    }

    public void setHoax(Boolean hoax) {
        this.hoax = hoax;
    }
}
