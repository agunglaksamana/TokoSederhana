/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Table;

import com.agung.entity.Barang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agung
 */
public class TableBarang extends AbstractTableModel{

    List<Barang> list;
    
    public TableBarang(List<Barang> list) {
        this.list = list;
    }

   
    @Override
    public String getColumnName(int column) {
    switch(column){
            case 0:
                return "Kode Barang";
            case 1:
                return "Tgl Masuk";
            case 2:
                return "Nama Barang";
            case 3:
                return "Satuan";
            case 4:
                return "Harga Jual";
            case 5:
                return "Harga Beli";
            case 6:
                return "Stock";
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
        return  7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getKodebarang();
            case 1:
                return list.get(rowIndex).getTglmasuk();
            case 2:
                return list.get(rowIndex).getNamabarang();
            case 3:
                return list.get(rowIndex).getSatuan();
            case 4:
                return list.get(rowIndex).getHargajual();
            case 5:
                return list.get(rowIndex).getHargabeli();
            case 6:
                return list.get(rowIndex).getStock();
            default:
                return null;
        }
    }
    
     public void addBarang(ArrayList<Barang> masterBarangs) {
        this.list = masterBarangs;
        fireTableRowsInserted(0, getRowCount() - 1);
    }
    
}
