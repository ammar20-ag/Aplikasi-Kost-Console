public class Penyewa {
    private String nama;
    private String nomorKamar;
    private int lamaSewa; // dalam bulan
    private double biayaPerBulan;

    public Penyewa(String nama, String nomorKamar, int lamaSewa, double biayaPerBulan) {
        this.nama = nama;
        this.nomorKamar = nomorKamar;
        this.lamaSewa = lamaSewa;
        this.biayaPerBulan = biayaPerBulan;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public double getBiayaPerBulan() {
        return biayaPerBulan;
    }

    public double getTotalBiaya() {
        return lamaSewa * biayaPerBulan;
    }

    public void tampilkanData() {
        System.out.println("Nama Penyewa   : " + nama);
        System.out.println("Nomor Kamar    : " + nomorKamar);
        System.out.println("Lama Sewa      : " + lamaSewa + " bulan");
        System.out.println("Biaya per Bulan: Rp " + biayaPerBulan);
        System.out.println("Total Biaya    : Rp " + getTotalBiaya());
        System.out.println("-----------------------------------");
    }
}
