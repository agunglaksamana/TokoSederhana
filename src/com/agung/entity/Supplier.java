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
public class Supplier {
  private String kodesuplier;
  private Date tglregistrasi;
  private String namasuplier;
  private String telepon;
  private String alamat;
  private boolean aktif;

    public String getKodesuplier() {
        return kodesuplier;
    }

    public void setKodesuplier(String kodesuplier) {
        this.kodesuplier = kodesuplier;
    }

    public Date getTglregistrasi() {
        return tglregistrasi;
    }

    public void setTglregistrasi(Date tglregistrasi) {
        this.tglregistrasi = tglregistrasi;
    }

    public String getNamasuplier() {
        return namasuplier;
    }

    public void setNamasuplier(String namasuplier) {
        this.namasuplier = namasuplier;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
  
  
  
}
