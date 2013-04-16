/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.entity;

/**
 *
 * @author agung
 */
public class PenyesuaianDetil {
private Penyeusaian penyusaian;
private Barang masterBarang;
private String nopenyesuaian;
private String kodebarang;
private int jumlah;
private String jenispenyusaian;

    public Penyeusaian getPenyusaian() {
        return penyusaian;
    }

    public void setPenyusaian(Penyeusaian penyusaian) {
        this.penyusaian = penyusaian;
    }

    public Barang getMasterBarang() {
        return masterBarang;
    }

    public void setMasterBarang(Barang masterBarang) {
        this.masterBarang = masterBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getJenispenyusaian() {
        return jenispenyusaian;
    }

    public void setJenispenyusaian(String jenispenyusaian) {
        this.jenispenyusaian = jenispenyusaian;
    }

    public String getNopenyesuaian() {
        return nopenyesuaian;
    }

    public void setNopenyesuaian(String nopenyesuaian) {
        this.nopenyesuaian = nopenyesuaian;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    
    

}
