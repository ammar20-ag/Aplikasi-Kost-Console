import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenKost mk = new ManajemenKost();

        int pilihan;
        do {
            System.out.println("\n===== MENU MANAJEMEN KOST =====");
            System.out.println("1. Tambah Data Penyewa");
            System.out.println("2. Lihat Data Penyewa");
            System.out.println("3. Hapus Data Penyewa");
            System.out.println("4. Hitung Total Pendapatan");
            System.out.println("5. Keluar Aplikasi");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // bersihkan buffer

            switch (pilihan) {
                case 1:
                    mk.tambahData(scanner);
                    break;
                case 2:
                    mk.tampilkanData();
                    break;
                case 3:
                    mk.hapusData(scanner);
                    break;
                case 4:
                    mk.hitungTotalPendapatan();
                    break;
                case 5:
                    System.out.println("🚪 Keluar dari aplikasi. Terima kasih!");
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
