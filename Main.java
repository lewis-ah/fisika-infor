import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KonsepFisika[] konsep = {
            new Listrik(),
            new Mekanika(),
            new Gelombang(),
            new Optik()
        };

        while (true) {
            System.out.println("=== Aplikasi Konsep Fisika ===");
            for (int i = 0; i < konsep.length; i++) {
                System.out.println((i + 1) + ". " + konsep[i].namaKonsep);
            }
            System.out.println("0. Keluar");
            System.out.print("Pilih topik fisika: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) break;
            if (pilihan >= 1 && pilihan <= konsep.length) {
                konsep[pilihan - 1].tampilkanInfo();
                konsep[pilihan - 1].kalkulasi();
            } else {
                System.out.println("Pilihan tidak valid!\n");
            }
        }
        System.out.println("Terima kasih telah menggunakan FisikaApp!");
    }
}