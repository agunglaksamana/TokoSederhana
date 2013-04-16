/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Table;

import com.agung.entity.PembelianDetil;
import com.agung.entity.PenjualanDetil;
import com.agung.entity.PenyesuaianDetil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agung
 */
public class TablePenyesuaian extends AbstractTableModel{

    private List<PenyesuaianDetil> list;

    public TablePenyesuaian(List<PenyesuaianDetil> list) {
        this.list = list;
    }

    public TablePenyesuaian() {
    }
    
    

   @Override
    public String getColumnName(int column) {
    switch(column){
            case 0:
                return "Kode Barang";
            case 1:
                return "Nama Barang";
            case 2:
                return "Satuan";
            case 3:
                return "Jenis Penyusaian";
            case 4:
                return "Jumlah Barang";
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
        return  5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getMasterBarang().getKodebarang();
            case 1:
                return list.get(rowIndex).getMasterBarang().getNamabarang();
            case 2:
                return list.get(rowIndex).getMasterBarang().getSatuan();
            case 3:
                return list.get(rowIndex).getJenispenyusaian();
            case 4:
                return list.get(rowIndex).getJumlah();
            default:
                return null;
        }
    }
    
     public void deleteTablePenjualan(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateTablePenjualan(int row, PenyesuaianDetil penjualanDetil){
        list.set(row, penjualanDetil);
        fireTableRowsUpdated(row, row);
    }

    public void addTablePenjualan(PenyesuaianDetil penyesuaianDetil) {
        list.add(penyesuaianDetil);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    } 
}
