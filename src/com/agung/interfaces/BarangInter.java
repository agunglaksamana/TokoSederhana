/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.interfaces;

import com.agung.entity.Barang;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author agung
 */
public interface BarangInter {
    public void save(Barang mb) throws SQLException;
    public void update(Barang mb) throws SQLException;
    public void updatestock(Barang mb) throws SQLException;
    public void delete(String kodebarang)throws SQLException;
    public List<Barang> findKodeBarang(String kodebarang,String namabarang) throws SQLException;
    List<Barang> getAll()throws SQLException;
}
