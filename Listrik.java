import java.util.Scanner;

public class Listrik extends KonsepFisika implements Kalkulator {

    public Listrik() {
        super("Hukum Ohm", "V = I x R, hubungan antara tegangan, arus, dan hambatan.");
    }

    @Override
    public void kalkulasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan arus (I) dalam Ampere: ");
        double I = scanner.nextDouble();
        System.out.print("Masukkan hambatan (R) dalam Ohm: ");
        double R = scanner.nextDouble();
        double V = I * R;
        System.out.println("Tegangan (V) = " + V + " Volt\n");
    }
}