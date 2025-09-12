public class Demo {
    public static void main(String[] args) {
        Motor motor = new Motor("Honda", 150);
        Televisi tv = new Televisi("Samsung", 42);
        TasSekolah tasSekolah = new TasSekolah("Eiger", 20, 5, "Biru");
        TasLaptop tasLaptop = new TasLaptop("Consina", 25, 15, true);

        motor.nyalakanMesin();
        motor.rem();
        motor.cetakInfo();
        System.out.println("============================");

        tv.nyalakanTv();
        tv.gantiCh(7);
        tv.cetakInfoTv();
        System.out.println("============================");

        tasSekolah.buka();
        tasSekolah.isiBuku(3);
        tasSekolah.tampilkanInfoSekolah();
        tasSekolah.tutup();
        System.out.println("============================");

        tasLaptop.buka();
        tasLaptop.simpanLaptop();
        tasLaptop.tampilkanInfoLaptop();
        tasLaptop.tutup();
        System.out.println("============================");
    }
}
