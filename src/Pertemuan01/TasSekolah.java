public class TasSekolah extends Tas {
    int jumlahBuku;
    String warna;

    TasSekolah(String merk, int kapasitas, int jumlahBuku, String warna) {
        super(merk, kapasitas);
        this.jumlahBuku = jumlahBuku;
        this.warna = warna;
    }

    void isiBuku(int buku) {
        this.jumlahBuku += buku;
        System.out.println("Menambah " + buku + " buku. Total buku: " + jumlahBuku);
    }

    void tampilkanInfoSekolah() {
        super.cetakInfoTas();
        System.out.println("Jumlah Buku: " + jumlahBuku + ", Warna: " + warna);
    }

}
