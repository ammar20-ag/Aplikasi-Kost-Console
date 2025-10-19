import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenKost {
    private ArrayList<Penyewa> daftarPenyewa;

    public ManajemenKost() {
        daftarPenyewa = new ArrayList<>();
    }

    // Tambah Data Penyewa
    public void tambahData(Scanner scanner) {
        System.out.print("Masukkan Nama Penyewa     : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Nomor Kamar      : ");
        String kamar = scanner.nextLine();
        System.out.print("Masukkan Lama Sewa (bulan): ");
        int lamaSewa = scanner.nextInt();
        System.out.print("Masukkan Biaya per Bulan  : ");
        double biaya = scanner.nextDouble();
        scanner.nextLine(); // bersihkan buffer

        Penyewa p = new Penyewa(nama, kamar, lamaSewa, biaya);
        daftarPenyewa.add(p);
        System.out.println("✅ Data penyewa berhasil ditambahkan!\n");
    }

    // Tampilkan Semua Data Penyewa
    public void tampilkanData() {
        if (daftarPenyewa.isEmpty()) {
            System.out.println("⚠️ Belum ada data penyewa yang tersimpan.\n");
            return;
        }

        System.out.println("\n===== DAFTAR PENYEWA KOST =====");
        for (Penyewa p : daftarPenyewa) {
            p.tampilkanData();
        }
    }

    // Hapus Data Penyewa berdasarkan Nama atau Nomor Kamar
    public void hapusData(Scanner scanner) {
        if (daftarPenyewa.isEmpty()) {
            System.out.println("⚠️ Tidak ada data untuk dihapus.\n");
            return;
        }

        System.out.print("Masukkan Nama atau Nomor Kamar yang akan dihapus: ");
        String keyword = scanner.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < daftarPenyewa.size(); i++) {
            Penyewa p = daftarPenyewa.get(i);
            if (p.getNama().equalsIgnoreCase(keyword) || p.getNomorKamar().equalsIgnoreCase(keyword)) {
                daftarPenyewa.remove(i);
                System.out.println("✅ Data penyewa berhasil dihapus!\n");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("❌ Data dengan nama atau nomor kamar tersebut tidak ditemukan.\n");
        }
    }

    // Hitung Total Pendapatan dari Semua Penyewa
    public void hitungTotalPendapatan() {
        if (daftarPenyewa.isEmpty()) {
            System.out.println("⚠️ Belum ada data penyewa.\n");
            return;
        }

        double total = 0;
        for (Penyewa p : daftarPenyewa) {
            total += p.getTotalBiaya();
        }

        System.out.println("💰 Total Pendapatan Kost: Rp " + total + "\n");
    }
}
