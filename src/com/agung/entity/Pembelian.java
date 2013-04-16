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
public class Pembelian {
  private String nopembelian;
  private Date tglbeli;
  private String kodesupplier;

    public String getNopembelian() {
        return nopembelian;
    }

    public void setNopembelian(String nopembelian) {
        this.nopembelian = nopembelian;
    }

    public Date getTglbeli() {
        return tglbeli;
    }

    public void setTglbeli(Date tglbeli) {
        this.tglbeli = tglbeli;
    }

    public String getKodesupplier() {
        return kodesupplier;
    }

    public void setKodesupplier(String kodesupplier) {
        this.kodesupplier = kodesupplier;
    }

    
    
    
  
}
