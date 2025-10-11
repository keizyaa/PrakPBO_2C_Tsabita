package Pertemuan07;

class Manusia {
    public void bernapas(){
        System.out.println("Manusia dapat bernapas.");
    }
    public void makan(){
        System.out.println("Manusia dapat makan.");
    }
}

class Dosen extends Manusia {
    @Override
    public void makan(){
        System.out.println("Dosen makan dahulu sebelum mengajar mahasiswa.");
    }
    public void lembur(){
        System.out.println("Dosen melakukan lembur, karena merekap nilai Mahasiswa");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan(){
        System.out.println("Mahasiwa makan dulu sebelum masuk kelas.");
    }
    public void tidur(){
        System.out.println("Mahasiswa tidur siang dahulu sebelum kelas sore.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        m1.makan();
        m2.makan();

        m1.bernapas();
        m2.bernapas();
    }
    
}