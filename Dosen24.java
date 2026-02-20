public class Dosen24 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Akif: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;

        if (statusAktif == true) {
            System.out.println("Dosen sekarang berstatus aktif");
        } else {
            System.out.println("Dosen sekrang berstatus tidak aktif.");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        thnSkrg -= tahunBergabung;
        System.out.println("Masa kerja dosen: " + thnSkrg + "tahun");
        return thnSkrg;
    }

    void ubahKeahlian(String Bidang) {
        bidangKeahlian = Bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi: " + bidangKeahlian);
    }
}
