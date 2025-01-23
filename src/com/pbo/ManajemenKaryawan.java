package com.pbo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManajemenKaryawan {
    private ArrayList<Karyawan> daftarKaryawan;

    public ManajemenKaryawan() {
        daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public void tampilkanSemuaKaryawan() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Tidak ada karyawan yang terdaftar.");
            return;
        }
        for (Karyawan karyawan : daftarKaryawan) {
            // Menampilkan jenis karyawan
            String jenisKaryawan = "";
            if (karyawan instanceof KaryawanTetap) {
                jenisKaryawan = "Karyawan Tetap";
            } else if (karyawan instanceof KaryawanKontrak) {
                jenisKaryawan = "Karyawan Kontrak";
            } else if (karyawan instanceof KaryawanFreelance) {
                jenisKaryawan = "Karyawan Freelance";
            }
            System.out.printf("\nJenis\t: %s%n", jenisKaryawan);
            karyawan.cetakData();
            System.out.println("---------------------------");
        }
    }
    
    public Karyawan cariKaryawan(String nip) {
        for (Karyawan karyawan : daftarKaryawan) {
            if (karyawan.getNip().equals(nip)) {
                return karyawan;
            }
        }
        return null;
    }

    public void urutkanKaryawanBerdasarkanGaji() {
        Collections.sort(daftarKaryawan, new Comparator<Karyawan>() {
            @Override
            public int compare(Karyawan k1, Karyawan k2) {
                return Double.compare(k1.hitungGaji(), k2.hitungGaji());
            }
        });
        System.out.println("Daftar karyawan telah diurutkan berdasarkan gaji.");
    }
}