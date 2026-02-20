public class MataKuliahMain24 {
    public static void main(String[] args) {
        MataKuliah24 mk1 = new MataKuliah24();
        mk1.kodeMK = "PBD04";
        mk1.nama = "Refaliya Vinandha";
        mk1.sks = 3;
        mk1.jumlahjam = 6;
        System.out.println();

        mk1.tampilinformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilinformasi();
    }
}
