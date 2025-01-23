package com.pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenKaryawan manajemen = new ManajemenKaryawan();
        Scanner masuk = new Scanner(System.in);
        String pilihan;

        do {
            System.out.println("MENU :");
            System.out.println("1. Tambah Karyawan Tetap");
            System.out.println("2. Tambah Karyawan Kontrak");
            System.out.println("3. Tambah Karyawan Freelance");
            System.out.println("4. Tampilkan Semua Karyawan");
            System.out.println("5. Cari Karyawan Berdasarkan NIP");
            System.out.println("6. Urutkan Karyawan Berdasarkan Gaji");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = masuk.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.println("---------------------------------");
                    System.out.print("Nama\t\t: ");
                    String namaTetap = masuk.nextLine();
                    System.out.print("NIP\t\t: ");
                    String nipTetap = masuk.nextLine();
                    System.out.print("Jabatan\t\t: ");
                    String jabatanTetap = masuk.nextLine();
                    System.out.print("Gaji Pokok\t: ");
                    double gajiPokok = Double.parseDouble(masuk.nextLine());
                    manajemen.tambahKaryawan(new KaryawanTetap(namaTetap, nipTetap, jabatanTetap, gajiPokok));
                    System.out.println("Karyawan Tetap berhasil ditambahkan.");
                    break;

                case "2":
                    System.out.println("---------------------------------");
                    System.out.print("Nama\t\t: ");
                    String namaKontrak = masuk.nextLine();
                    System.out.print("NIP\t\t: ");
                    String nipKontrak = masuk.nextLine();
                    System.out.print("Jabatan\t\t: ");
                    String jabatanKontrak = masuk.nextLine();
                    System.out.print("Gaji Per Jam\t: ");
                    double gajiPerJam = Double.parseDouble(masuk.nextLine());
                    System.out.print("Jam Kerja\t: ");
                    int jamKerja = Integer.parseInt(masuk.nextLine());
                    manajemen.tambahKaryawan(new KaryawanKontrak(namaKontrak, nipKontrak, jabatanKontrak, gajiPerJam, jamKerja));
                    System.out.println("Karyawan Kontrak berhasil ditambahkan.");
                    break;

                case "3":
                    System.out.println("---------------------------------");
                    System.out.print("Nama\t\t: ");
                    String namaFreelance = masuk.nextLine();
                    System.out.print("NIP\t\t: ");
                    String nipFreelance = masuk.nextLine();
                    System.out.print("Jabatan\t\t: ");
                    String jabatanFreelance = masuk.nextLine();
                    System.out.print("Proyek Fee\t: ");
                    double proyekFee = Double.parseDouble(masuk.nextLine());
                    manajemen.tambahKaryawan(new KaryawanFreelance(namaFreelance, nipFreelance, jabatanFreelance, proyekFee));
                    System.out.println("Karyawan Freelance berhasil ditambahkan.");
                    break;

                case "4":
                    System.out.println("\n--- DAFTAR KARYAWAN : ---");
                    manajemen.tampilkanSemuaKaryawan();
                    break;

                case "5":
                    System.out.print("\nMasukkan NIP karyawan yang dicari : ");
                    String nipCari = masuk.nextLine();
                    Karyawan karyawanDitemukan = manajemen.cariKaryawan(nipCari);
                    if (karyawanDitemukan != null) {
                        System.out.println("Karyawan ditemukan :");
                        karyawanDitemukan.cetakData();
                    } else {
                        System.out.println("\nKARYAWAN DENGAN NIP " + nipCari + " TIDAK DITEMUKAN.");
                    }
                    break;

                case "6":
                    manajemen.urutkanKaryawanBerdasarkanGaji();
                    System.out.println("Karyawan telah diurutkan berdasarkan gaji.");
                    break;

                case "7":
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            System.out.println();
    } while (!pilihan.equals("7"));

    masuk.close();
    }
}