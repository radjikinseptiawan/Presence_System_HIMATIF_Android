package com.example.bicara;

public class Anggota {
    private String anggota_name;
    private String jabatan_anggota;
    public Anggota(String anggota_name, String jabatan_anggota){
        this.anggota_name = anggota_name;
        this.jabatan_anggota = jabatan_anggota;
    }

    public String getNama(){
        return anggota_name;
    }

    public String getJabatan(){
        return jabatan_anggota;
    }
}
