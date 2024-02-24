package com.isd;

// Pojo Bag class
public class Bag {
    private String code;
    private String jenisBarang;
    private String namaBarang;
    private int stok;

    // Constructor
    public Bag(String code, String jenisBarang, String namaBarang, int stok) {
       this.code = code;
       this.jenisBarang = jenisBarang;
       this.namaBarang = namaBarang;
       this.stok = stok;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void display() {
        System.out.println("- " + this.code + " " + this.namaBarang + " memiliki stok " + this.stok);
    }
}
