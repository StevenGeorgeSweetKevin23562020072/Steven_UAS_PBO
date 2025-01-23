package com.pbo;

class KaryawanFreelance extends Karyawan {
    private double proyekFee;

    public KaryawanFreelance(String nama, String nip, String jabatan, double proyekFee) {
        super(nama, nip, jabatan);
        this.proyekFee = proyekFee;
    }

    @Override
    public double hitungGaji() {
        return proyekFee;
    }
}