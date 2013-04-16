/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Table;

import com.agung.entity.PembelianDetil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agung
 */
public class TablePembelian extends AbstractTableModel{

    ArrayList<PembelianDetil> list = new ArrayList<>();

    public TablePembelian(ArrayList<PembelianDetil> list) {
        this.list = list;
    }

    public TablePembelian() {
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
                return "Harga Barang";
            case 4:
                return "Jumlah Pesan";
            case 5:
                return "Jumlah Harga";
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
                return list.get(rowIndex).getMasterBarang().getKodebarang();
            case 1:
                return list.get(rowIndex).getMasterBarang().getNamabarang();
            case 2:
                return list.get(rowIndex).getMasterBarang().getSatuan();
            case 3:
                return list.get(rowIndex).getMasterBarang().getHargabeli();
            case 4:
                return list.get(rowIndex).getJumlah();
            case 5:
                return list.get(rowIndex).getJumlahtotal();
            default:
                return null;
        }
    }
    
     public void deleteTablePembelian(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateTablePembelian(int row, PembelianDetil pembelianDetil){
        list.set(row, pembelianDetil);
        fireTableRowsUpdated(row, row);
    }

    public void addTablePembelian(PembelianDetil pembelianDetil,ArrayList<PembelianDetil> pembelianDetils) {
        list.add(pembelianDetil);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
}
