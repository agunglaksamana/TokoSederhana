/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.entity;

/**
 *
 * @author agung
 */
public class PembelianDetil {
private Pembelian pembelian;
private Barang masterBarang;
private int jumlah;
private double jumlahtotal;
private String KodePembelian;
private String KodeBarang;


    public Pembelian getPembelian() {
        return pembelian;
    }

    public void setPembelian(Pembelian pembelian) {
        this.pembelian = pembelian;
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

    public double getJumlahtotal() {
        return jumlahtotal;
    }

    public void setJumlahtotal(double jumlahtotal) {
        this.jumlahtotal = jumlahtotal;
    }

    public String getKodePembelian() {
        return KodePembelian;
    }

    public void setKodePembelian(String KodePembelian) {
        this.KodePembelian = KodePembelian;
    }

    public String getKodeBarang() {
        return KodeBarang;
    }

    public void setKodeBarang(String KodeBarang) {
        this.KodeBarang = KodeBarang;
    }


}
