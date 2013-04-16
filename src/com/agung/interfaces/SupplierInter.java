/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.interfaces;

import com.agung.entity.Barang;
import com.agung.entity.Supplier;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author agung
 */
public interface SupplierInter {
    public void save(Supplier ms) throws SQLException;
    public void update(Supplier ms) throws SQLException;
    public void delete(String kodeSuplier)throws SQLException;
    public List<Supplier> findKodeSupplier(String kodesuplier,String namaSuplier) throws SQLException;
    List<Supplier> getAll()throws SQLException;
}
