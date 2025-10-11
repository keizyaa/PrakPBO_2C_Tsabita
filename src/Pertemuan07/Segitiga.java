package Pertemuan07;

public class Segitiga {
    int sudut;

    int totalSudut(int sudutA){
        return 180 - sudutA;
    }

    int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA+sudutB);
    }

    int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    double keliling(int sisiA, int sisiB){
        return Math.sqrt((sisiA*sisiA) + (sisiB*sisiB));
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total Sudut 1: " + s.totalSudut(90));
        System.out.println("Total Sudut 2: " + s.totalSudut(30, 30));
        System.out.println("Keliling 1: " + s.keliling(2, 3, 4));
        System.out.println("Keliling 2: " + s.keliling(3, 4));
    }
}
