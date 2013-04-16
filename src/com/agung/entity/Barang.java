/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.entity;

import java.util.Date;

/**
 *
 * @author agung
 */
public class Barang {
  private String kodebarang;
  private Date tglmasuk;
  private String namabarang;
  private String satuan;
  private double hargajual;
  private double hargabeli;
  private int stock;

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public Date getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(Date tglmasuk) {
        this.tglmasuk = tglmasuk;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public double getHargajual() {
        return hargajual;
    }

    public void setHargajual(double hargajual) {
        this.hargajual = hargajual;
    }

    public double getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(double hargabeli) {
        this.hargabeli = hargabeli;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
  
  
}
