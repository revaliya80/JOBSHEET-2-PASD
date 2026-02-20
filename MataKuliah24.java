public class MataKuliah24 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahjam;

    public MataKuliah24() {
    }

    public MataKuliah24(String kodeMK, String nama, int sks, int jumlahjam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tampilinformasi() {
        System.out.println("Kode Mata kuliah: " + kodeMK);
        System.out.println("Nama Mata kuliah: " + nama);
        System.out.println("Jumlah SKS      : " + sks);
        System.out.println("Jumlah Jam      : " + jumlahjam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahjam = jumlahjam + jam;
    }

    void kurangiJam(int jam) {
        if (jumlahjam >= jam) {
            jumlahjam = jumlahjam - jam;
            System.out.println("Jam berhasil dikurangi");
        } else {
            System.out.println("Pengurangan gagal. jam tidak mememnuhi sayrat");
        }
    }
}
