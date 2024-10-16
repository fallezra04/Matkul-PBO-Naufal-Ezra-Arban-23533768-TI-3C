    import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan jumlah harta
        System.out.print("Masukkan jumlah harta yg anda miliki): ");
        double harta = scanner.nextDouble();

        // Menghitung zakat maal sebesar 2.5%
        double zakat = harta * 2.5 / 100;

        // Menampilkan jumlah zakat
        System.out.printf("Jumlah zakat yang harus dibayar: Rp %.2f\n", zakat);

        scanner.close();
    }
}

