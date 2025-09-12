public class Tas {
    String merk;
    int kapasitas;

    Tas(){
        
    }

    Tas(String merk, int kapasitas) {
        this.merk = merk;
        this.kapasitas = kapasitas;
    }

    void buka() {
        System.out.println("Tas dibuka...");
    }

    void tutup() {
        System.out.println("Tas ditutup...");
    }

    void cetakInfoTas() {
        System.out.println("Tas merk " + merk + ", mempunyai kapasitas " + kapasitas + " liter");
    }
}
