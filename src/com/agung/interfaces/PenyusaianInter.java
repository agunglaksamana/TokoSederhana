/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.interfaces;

import com.agung.entity.Barang;
import com.agung.entity.PenyesuaianDetil;
import com.agung.entity.Penyeusaian;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author agung
 */
public interface PenyusaianInter {
  public void saveP (Penyeusaian p) throws SQLException;
  public void savePD (PenyesuaianDetil pd) throws SQLException;  
  public List<Barang> findKodeBarang(String kodebarang) throws SQLException;
  public void Updatetmbh (PenyesuaianDetil pd) throws SQLException;
  public void Updatekrng (PenyesuaianDetil pd) throws SQLException;
}
