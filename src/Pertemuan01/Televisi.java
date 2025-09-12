public class Televisi {
    String merk;
    int ukuranLayar;

    Televisi(String merk, int ukuranLayar){
        this.merk = merk;
        this.ukuranLayar = ukuranLayar;
    }

    void nyalakanTv(){
        System.out.println("Televisi menyala");
    }

    void gantiCh(int channel){
        System.out.println("Channel diganti ke " + channel);
    }

    void cetakInfoTv(){
        System.out.println("Televisi merk "  + merk + ", mempunyai ukuran layar " + ukuranLayar + " inch");
    }
}
