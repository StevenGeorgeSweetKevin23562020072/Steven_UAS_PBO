package com.pbo;

class KaryawanKontrak extends Karyawan {
    private double gajiPerJam;
    private int jamKerja;

    public KaryawanKontrak(String nama, String nip, String jabatan, double gajiPerJam, int jamKerja) {
        super(nama, nip, jabatan);
        this.gajiPerJam = gajiPerJam;
        this.jamKerja = jamKerja;
    }

    @Override
    public double hitungGaji() {
        return gajiPerJam * jamKerja;
    }
}