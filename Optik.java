import java.util.Scanner;

public class Optik extends KonsepFisika implements Kalkulator {

    public Optik() {
        super("Pembiasan Cahaya (Hukum Snellius)", "n1 * sin(θ1) = n2 * sin(θ2), pembiasan antar medium.");
    }

    @Override
    public void kalkulasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan indeks bias medium pertama (n1): ");
        double n1 = scanner.nextDouble();
        System.out.print("Masukkan indeks bias medium kedua (n2): ");
        double n2 = scanner.nextDouble();
        System.out.print("Masukkan sudut datang (θ1) dalam derajat: ");
        double theta1 = Math.toRadians(scanner.nextDouble());
        double sinTheta2 = (n1 / n2) * Math.sin(theta1);
        double theta2 = Math.toDegrees(Math.asin(sinTheta2));
        System.out.println("Sudut bias (θ2) = " + theta2 + " derajat\n");
    }
}