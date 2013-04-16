/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.interfaces;

import com.agung.entity.Barang;
import com.agung.entity.Pembelian;
import com.agung.entity.PembelianDetil;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author agung
 */
public interface PembelianInter {
   public void saveP(Pembelian p) throws SQLException;
   public void savePD(PembelianDetil pd) throws SQLException;
   public List<Barang> findKodeBarang(String kodebarang) throws SQLException;
  
}
