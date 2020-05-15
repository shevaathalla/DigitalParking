/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalparking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HP ProBook
 */
public class Data {

    private int nopol;
    private String wilayah, huruf, jenis;
    LocalDateTime masuk,keluar;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public Data(int nopol, String wilayah, String huruf,String jenis, LocalDateTime jam_masuk) {
        this.nopol = nopol;
        this.wilayah = wilayah;
        this.huruf = huruf;
        this.jenis = jenis;
        this.masuk = now;
        this.keluar = null;
    }

    public int getKey() {
        return nopol;
    }
    public String getNopol(){
        return wilayah+" "+nopol+" "+huruf;
    }
    public String getJenis(){
        return jenis;
    }
    public LocalDateTime getJamMasuk(){
        return masuk;
    }
    
}
