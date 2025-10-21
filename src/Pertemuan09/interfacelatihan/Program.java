package interfacelatihan;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        // Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // pakRektor.berSertifikatCumlaude(mahasiswaBiasa);
        // pakRektor.berSertifikatCumlaude(sarjanaCumlaude);
        // pakRektor.berSertifikatCumlaude(masterCumlaude);

        pakRektor.berSertifikatMawapres(sarjanaCumlaude);
        pakRektor.berSertifikatMawapres(masterCumlaude);
    }
}
