/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Imple;

import com.agung.Util.Databases;
import com.agung.entity.Barang;
import com.agung.interfaces.BarangInter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author agung
 */
public class BarangImple implements BarangInter{

    @Override
    public void save(Barang mb) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Insert Into "
                    + "barang values (?,?,?,?,?,?,?)");
            ps.setString(1, mb.getKodebarang());
            ps.setDate(2, new java.sql.Date(mb.getTglmasuk().getTime()));
            ps.setString(3, mb.getNamabarang());
            ps.setString(4, mb.getSatuan());
            ps.setDouble(5, mb.getHargajual());
            ps.setDouble(6, mb.getHargabeli());
            ps.setInt(7, mb.getStock());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Insert Master Barang");
        }
    }

    @Override
    public void update(Barang mb) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("update barang set tglmasuk =?"
                    + ", namabarang =?,satuan=?,hargajual=?,hargabeli=?,stock=? where kodebarang=?");
            ps.setString(7, mb.getKodebarang());
            ps.setDate(1, new java.sql.Date(mb.getTglmasuk().getTime()));
            ps.setString(2, mb.getNamabarang());
            ps.setString(3, mb.getSatuan());
            ps.setDouble(4, mb.getHargajual());
            ps.setDouble(5, mb.getHargabeli());
            ps.setInt(6, mb.getStock());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Update Master Barang");
        }
    }

    @Override
    public void delete(String kodebarang) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Delete from barang "
                    + "where kodebarang=?");
            ps.setString(1, kodebarang);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Delete Master Barang");
        }
    }

    @Override
    public List<Barang> findKodeBarang(String kodebarang, String namabarang) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Select * from barang "
                    + "where kodebarang ilike ? or namabarang ilike ? ");
            ps.setString(1, "%"+kodebarang+"%");
            ps.setString(2, "%"+namabarang+"%");
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
    public List<Barang> getAll()throws SQLException{   
        
        Statement st = Databases.getkoneksi().createStatement();
        ResultSet rs = st.executeQuery("Select * from barang order by kodebarang asc");
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
    }

    @Override
    public void updatestock(Barang mb) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("update barang set stock=? where kodebarang=?");
            ps.setString(2, mb.getKodebarang());
            ps.setInt(1, mb.getStock());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Update Master Barang");
        }
    }

    
}
