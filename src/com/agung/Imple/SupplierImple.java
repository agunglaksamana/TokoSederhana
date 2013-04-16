/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Imple;

import com.agung.Util.Databases;
import com.agung.entity.Supplier;
import com.agung.interfaces.SupplierInter;
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
public class SupplierImple implements SupplierInter{

    @Override
    public void save(Supplier ms) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Insert Into "
                    + "supplier values (?,?,?,?,?,?)");
            ps.setString(1, ms.getKodesuplier());
            ps.setDate(2, new java.sql.Date(ms.getTglregistrasi().getTime()));
            ps.setString(3, ms.getNamasuplier());
            ps.setString(4, ms.getTelepon());
            ps.setString(5, ms.getAlamat());
            ps.setBoolean(6, ms.isAktif());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Insert Master Supplier");
        }
    }

    @Override
    public void update(Supplier ms) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("update supplier set"
                    + "namasuplier =?,telepon=?,alamat=?,aktif=? where kodesuplier=?");
            ps.setString(5, ms.getKodesuplier());
            ps.setString(1, ms.getNamasuplier());
            ps.setString(2, ms.getTelepon());
            ps.setString(3, ms.getAlamat());
            ps.setBoolean(4, ms.isAktif());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Update Master Suplier");
        }
    }

    @Override
    public void delete(String kodeSuplier) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Delete from supplier "
                    + "where kodesuplier=?");
            ps.setString(1, kodeSuplier);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Delete Master Suplier");
        }
    }

    @Override
    public List<Supplier> findKodeSupplier(String kodesuplier, String namaSuplier) throws SQLException {
        try {
            PreparedStatement ps = Databases.getkoneksi().prepareStatement("Select * from supplier "
                    + "where kodesuplier ilike ? or namasuplier ilike ? ");
            ps.setString(1, "%"+kodesuplier+"%");
            ps.setString(2, "%"+namaSuplier+"%");
            ResultSet rs = ps.executeQuery();
            List<Supplier> list = new ArrayList<>();
            while (rs.next()) {                
            Supplier m = new Supplier();
            m.setKodesuplier(rs.getString("kodesuplier"));
            m.setTglregistrasi(rs.getDate("tglregistrasi"));
            m.setNamasuplier(rs.getString("namasuplier"));
            m.setTelepon(rs.getString("telepon"));
            m.setAlamat(rs.getString("alamat"));
            m.setAktif(rs.getBoolean("aktif"));
            list.add(m);
        }
        return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Di Pencarian Master Suplier");
        }
        return null;
    }

    @Override
    public List<Supplier> getAll() throws SQLException{
        Statement st = Databases.getkoneksi().createStatement();
        ResultSet rs = st.executeQuery("Select * from supplier");
        List<Supplier> list = new ArrayList<>();
        while (rs.next()) {            
            Supplier m = new Supplier();
            m.setKodesuplier(rs.getString("kodesuplier"));
            m.setTglregistrasi(rs.getDate("tglregistrasi"));
            m.setNamasuplier(rs.getString("namasuplier"));
            m.setTelepon(rs.getString("telepon"));
            m.setAlamat(rs.getString("alamat"));
            m.setAktif(rs.getBoolean("aktif"));
            list.add(m);
        }
        return list;
    }

    
    
}
