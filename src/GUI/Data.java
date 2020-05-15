/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author HP ProBook
 */
class Data implements Serializable{

    int id, biaya;
    String nopol, jenis;
    LocalDateTime jam_masuk, jam_keluar;
    String blok;

    public Data(int id, String nopol, String jenis, String blok) {
        this.id = id;
        this.nopol = nopol;
        this.jenis = jenis;
        this.jam_masuk = LocalDateTime.now();
        this.jam_keluar = LocalDateTime.MIN;
        this.blok = blok;
    }

    public int getID() {
        return id;
    }

    public String getNopol() {
        return nopol;
    }

    public String getJenis() {
        return jenis;
    }

    public String getJamMasuk() {
        String enter = jam_masuk.getHour() + "." + jam_masuk.getMinute();
        return enter;
    }

    public String getJamKeluar() {
        String exit = jam_keluar.getHour() + "." + jam_keluar.getMinute();
        return exit;
    }

    public LocalDateTime timeMasuk() {
        return jam_masuk;
    }

    public LocalDateTime timeKeluar() {
        return jam_keluar;
    }

    public String getBlok() {
        return blok;
    }

    public void insertBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public void updateJamKeluar() {
        this.jam_keluar = LocalDateTime.now();
    }

    public void updateHeap(LocalDateTime jamEnter, LocalDateTime jamExit, int biaya) {
        this.jam_masuk = jamEnter;
        this.jam_keluar = jamExit;
        this.biaya = biaya;
    }

    public void update(String nopol, String jenis, String blok) {
        this.nopol = nopol;
        this.jenis = jenis;
        this.blok = blok;
    }

    public Data getData() {
        return this;
    }
    
    public String getBulankeluar(){
        return jam_keluar.getMonth().toString();
    }
    public int getTanggalKeluar(){
        return jam_keluar.getDayOfYear();
    }
}
