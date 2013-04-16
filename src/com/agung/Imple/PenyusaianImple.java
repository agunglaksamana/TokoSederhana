/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Imple;

import com.agung.Util.Databases;
import com.agung.entity.Barang;
import com.agung.entity.PenyesuaianDetil;
import com.agung.entity.Penyeusaian;
import com.agung.interfaces.PenyusaianInter;
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
public class PenyusaianImple implements PenyusaianInter{

    @Override
    public void saveP(Penyeusaian p) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Insert Into "
                    + "penyesuaian values (?,?)");
            ps.setString(1, p.getNopenyesuaian());
            ps.setDate(2, new java.sql.Date(p.getTglpenyusaian().getTime()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di penyesuaian");
        }
    }

    @Override
    public void savePD(PenyesuaianDetil pd) throws SQLException {
          try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Insert Into "
                    + "penyesuaiandetil values (?,?,?,?)");
            ps.setString(1, pd.getNopenyesuaian());
            ps.setString(2,pd.getKodebarang()) ;
            ps.setInt(3, pd.getJumlah());
            ps.setString(4, pd.getJenispenyusaian());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di penyusaiandetil");
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

    @Override
    public void Updatetmbh(PenyesuaianDetil pd) throws SQLException {
        try {
            PreparedStatement ps2 = Databases.getkoneksi().prepareStatement("Update barang set "
                    + "stock =stock+? where kodebarang = ?");
            ps2.setString(2, pd.getKodebarang());
            ps2.setInt(1, pd.getJumlah());
            ps2.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di penyesuaian");
        }
    }

    @Override
    public void Updatekrng(PenyesuaianDetil pd) throws SQLException {
        try {
            PreparedStatement ps2 = Databases.getkoneksi().prepareStatement("Update barang set "
                    + "stock =stock-? where kodebarang = ?");
            ps2.setString(2, pd.getKodebarang());
            ps2.setInt(1, pd.getJumlah());
            ps2.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di penyesuaian");
        }
    }
    
}
