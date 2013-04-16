/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.entity;

/**
 *
 * @author agung
 */
public class PenjualanDetil {
 private Penjualan penjualan;
 private Barang masterBarang;
 private String NoPenjualan;
 private String KodeBarang;
 private int jumlah;
 private double jumlahtotal;

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
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
        this.jumlahtotal = jumlahtotal ;
    }

    public String getNoPenjualan() {
        return NoPenjualan;
    }

    public void setNoPenjualan(String NoPenjualan) {
        this.NoPenjualan = NoPenjualan;
    }

    public String getKodeBarang() {
        return KodeBarang;
    }

    public void setKodeBarang(String KodeBarang) {
        this.KodeBarang = KodeBarang;
    }
 
}
