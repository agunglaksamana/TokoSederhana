/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Table;

import com.agung.entity.Barang;
import com.agung.entity.Supplier;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agung
 */
public class TableSupplier extends AbstractTableModel{

    List<Supplier>list;

    public TableSupplier(List<Supplier> list) {
        this.list = list;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Kode Supplier";
            case 1:
                return "Tgl Registrasi";
            case 2:
                return "Nama Supplier";
            case 3:
                return "Telepon";
            case 4:
                return "Alamat";
            case 5:
                return "Aktif";
            default:
                return null;
        }
    }
    
    
    @Override
    public int getRowCount() {
        if(list == null){
            return 0;
        }else{
            return list.size();
        }
    }

    @Override
    public int getColumnCount() {
        return  6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getKodesuplier();
            case 1:
                return list.get(rowIndex).getTglregistrasi();
            case 2:
                return list.get(rowIndex).getNamasuplier();
            case 3:
                return list.get(rowIndex).getAlamat();
            case 4:
                return list.get(rowIndex).getTelepon();
            case 5:
                return list.get(rowIndex).isAktif();
            default:
                return null;
        }
    }
   public void addSuplier(ArrayList<Supplier> masterSuppliers) {
        this.list = masterSuppliers;
        fireTableRowsInserted(0, getRowCount() - 1);
    } 
}
