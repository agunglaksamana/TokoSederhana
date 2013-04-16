/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Imple;

import com.agung.Util.Databases;
import com.agung.entity.Barang;
import com.agung.entity.Pembelian;
import com.agung.entity.PembelianDetil;
import com.agung.interfaces.PembelianInter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author agung
 */
public class PembelianImple implements PembelianInter{

    @Override
    public void saveP(Pembelian p) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Insert Into "
                    + "pembelian values (?,?,?)");
            ps.setString(1, p.getNopembelian());
            ps.setDate(2, new java.sql.Date(p.getTglbeli().getTime()));
            ps.setString(3, p.getKodesupplier());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Pemebelian");
        }
    }

    @Override
    public void savePD(PembelianDetil pd) throws SQLException {
       try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Insert Into "
                    + "pembeliandetil values (?,?,?,?)");
            PreparedStatement ps2 = Databases.getkoneksi().prepareStatement("Update barang set "
                    + "stock =stock+? where kodebarang = ?");
            ps.setString(1, pd.getKodePembelian());
            ps.setString(2,pd.getKodeBarang()) ;
            ps.setInt(3, pd.getJumlah());
            ps.setDouble(4, pd.getJumlahtotal());
            ps.executeUpdate();
            ps2.setString(2, pd.getMasterBarang().getKodebarang());
            ps2.setInt(1, pd.getJumlah());
            ps2.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Pemebelian");
        }
        
    }

    @Override
    public List<Barang> findKodeBarang(String kodebarang) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Select * from masterbarang "
                    + "where kodebarang ilike ? ");
            ps.setString(1, "%"+kodebarang+"%");
            ResultSet rs = ps.executeQuery();
            List<Barang> list = new ArrayList<>();
            while (rs.next()) {                
            Barang m = new Barang();
            m.setKodebarang(rs.getString("kodebarang"));
            m.setTglmasuk(rs.getDate("tglmasuk"));
            m.setNamabarang(rs.getString("namabarang"));
            m.setSatuan(rs.getString("satuan"));
            m.setHargabeli(rs.getDouble("hargabeli"));
            m.setHargajual(rs.getDouble("hargajual"));
            m.setStock(rs.getInt("stock"));
            list.add(m);
        }
        return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Pencarian Master Barang");
        }
        return null;
    }

    
}

