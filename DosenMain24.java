public class DosenMain24 {
    public static void main(String[] args) {
        Dosen24 ds1 = new Dosen24();
        ds1.idDosen = "D010";
        ds1.nama = "Refaliya Vinandha";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2007;
        ds1.bidangKeahlian = "Kesehatan dan keselamatan kerja";
        System.out.println();

        ds1.tampilInformasi();
        ds1.setStatusAktif(false);
        ds1.hitungMasaKerja(2026);
        ds1.ubahKeahlian("Matematika");
    }
}
