/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Table;

import com.agung.entity.PembelianDetil;
import com.agung.entity.PenjualanDetil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agung
 */
public class TablePenjualan extends AbstractTableModel{

    private ArrayList<PenjualanDetil> list = new ArrayList<>();

    public TablePenjualan(ArrayList<PenjualanDetil> list) {
        this.list = list;
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
                return list.get(rowIndex).getMasterBarang().getHargajual();
            case 4:
                return list.get(rowIndex).getJumlah();
            case 5:
                return list.get(rowIndex).getJumlahtotal();
            default:
                return null;
        }
    }
    
     public void deleteTablePenjualan(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateTablePenjualan(int row, PenjualanDetil penjualanDetil){
        list.set(row, penjualanDetil);
        fireTableRowsUpdated(row, row);
    }

    public void addTablePenjualan(PenjualanDetil penjualanDetil,ArrayList<PenjualanDetil> penjualanDetils) {
        list.add(penjualanDetil);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    } 
}
