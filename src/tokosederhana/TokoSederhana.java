/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tokosederhana;

import java.util.Random;

/**
 *
 * @author agung
 */
public class TokoSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int awal = 1, akhir = 10, hasil;
  Random acak = new Random();
  for (int i=1; i<=5; i++){
    hasil = (int)((akhir - awal + 1) * acak.nextDouble() + awal);
    System.out.println(hasil);  // TODO code application logic here
    }
}
}
