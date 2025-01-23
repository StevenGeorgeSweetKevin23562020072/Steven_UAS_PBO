package com.pbo;

class KaryawanTetap extends Karyawan {
    private double gajiPokok;

    public KaryawanTetap(String nama, String nip, String jabatan, double gajiPokok) {
        super(nama, nip, jabatan); // Memanggil constructor superclass
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok;
    }
}