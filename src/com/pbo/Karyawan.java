package com.pbo;
import java.text.DecimalFormat;

// Interface (Abstraction level 1)
interface KaryawanOperations {
    double hitungGaji(); // Metode abstrak, implementasi tergantung subclass
    void cetakData(); // Metode abstrak
}

// Abstract Class (Abstraction level 2)
abstract class Karyawan implements KaryawanOperations {
    protected String nama; // Atribut dilindungi, hanya bisa diakses langsung oleh subclass
    protected String nip;
    protected String jabatan;

    public Karyawan(String nama, String nip, String jabatan) {
        this.nama = nama;
        this.nip = nip;
        this.jabatan = jabatan;
    }

    // Getter untuk mendapatkan nilai atribut secara aman
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    @Override
    public void cetakData() {
        // Menggunakan DecimalFormat untuk memformat gaji
        DecimalFormat format = new DecimalFormat("#,##0.00");
        String formattedGaji = "Rp " + format.format(hitungGaji());
        System.out.printf("Nama\t: %s%nNIP\t: %s%nJabatan\t: %s%nGaji\t: %s%n", 
                          nama, nip, jabatan, formattedGaji);
    }
}