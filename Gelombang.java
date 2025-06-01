import java.util.Scanner;

public class Gelombang extends KonsepFisika implements Kalkulator {

    public Gelombang() {
        super("Frekuensi Resonansi Helmholtz", "f = (v / 2π) * sqrt(A / (V * L)), resonansi tabung udara.");
    }

    @Override
    public void kalkulasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan suara (v) dalam m/s: ");
        double v = scanner.nextDouble();
        System.out.print("Masukkan luas penampang leher (A) dalam m^2: ");
        double A = scanner.nextDouble();
        System.out.print("Masukkan volume rongga (V) dalam m^3: ");
        double V = scanner.nextDouble();
        System.out.print("Masukkan panjang leher (L) dalam meter: ");
        double L = scanner.nextDouble();
        double f = (v / (2 * Math.PI)) * Math.sqrt(A / (V * L));
        System.out.println("Frekuensi Resonansi (f) = " + f + " Hz\n");
    }
}