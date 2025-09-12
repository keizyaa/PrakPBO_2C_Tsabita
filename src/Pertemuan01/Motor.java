public class Motor {
    String merk;
    int kapasitasMesin;

    Motor(String merk, int kapasitasMesin){
        this.merk = merk;
        this.kapasitasMesin = kapasitasMesin;
    }

    void nyalakanMesin(){
        System.out.println("Motor menyala");
    }

    void rem(){
        System.out.println("Motor direm");
    }

    void cetakInfo(){
        System.out.println("Motor merk " + merk + ", mempunyai kapasitas mesin " + kapasitasMesin + " cc");
    }
}
