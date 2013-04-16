/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.interfaces;

import com.agung.entity.Barang;
import com.agung.entity.Penjualan;
import com.agung.entity.PenjualanDetil;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author agung
 */
public interface PenjualanInter {
    public void saveP(Penjualan p) throws SQLException;
    public void savePD(PenjualanDetil pd) throws SQLException;
    public List<Barang> findKodeBarang(String kodebarang) throws SQLException;
}
