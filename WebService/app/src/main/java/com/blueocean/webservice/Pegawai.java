package com.blueocean.webservice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pegawai {

    @SerializedName("index")
    @Expose
    private int index;

    @SerializedName("salary")
    @Expose
    private int gaji;

    @SerializedName("age")
    @Expose
    private int umur;

    @SerializedName("name")
    @Expose
    private String nama;


    public Pegawai(int index, int gaji, int umur, String nama) {
        this.index = index;
        this.gaji = gaji;
        this.umur = umur;
        this.nama = nama;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getGaji() {
        return gaji;
    }

    public  void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
