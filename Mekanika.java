import java.util.Scanner;

public class Mekanika extends KonsepFisika implements Kalkulator {

    public Mekanika() {
        super("Gaya Gravitasi Newton", "F = G * (m1 * m2) / r^2, hukum gravitasi universal.");
    }

    @Override
    public void kalkulasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan massa pertama (m1) dalam kg: ");
        double m1 = scanner.nextDouble();
        System.out.print("Masukkan massa kedua (m2) dalam kg: ");
        double m2 = scanner.nextDouble();
        System.out.print("Masukkan jarak antara dua objek (r) dalam meter: ");
        double r = scanner.nextDouble();
        double G = 6.674e-11;
        double F = G * (m1 * m2) / (r * r);
        System.out.println("Gaya Gravitasi (F) = " + F + " Newton\n");
    }
}