public class TasLaptop extends Tas {
    int ukuranLaptop;
    boolean tahanAir;

    TasLaptop(String merk, int kapasitas, int ukuranLaptop, boolean tahanAir) {
        super(merk, kapasitas);
        this.ukuranLaptop = ukuranLaptop;
        this.tahanAir = tahanAir;
    }

    void simpanLaptop() {
        System.out.println("Laptop ukuran " + ukuranLaptop + " inch disimpan.");
    }

    void tampilkanInfoLaptop() {
        super.cetakInfoTas();
        System.out.println("Ukuran Laptop: " + ukuranLaptop + " inch, Tahan Air: " + tahanAir);
    }
}
