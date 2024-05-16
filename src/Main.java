import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> namaMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        int counter = 1;
        while (true) {
            try {

                System.out.print("Masukkan nama mahasiswa-"+ counter +" : ");
                input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("selesai")) {
                    break;
                }

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }

                namaMahasiswa.add(input);
                counter++;
            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            }
        }

        scanner.close();

        System.out.println("\nDaftar mahasiswa yang di inputkan:");
        for (int i = 0; i < namaMahasiswa.size(); i++) {
            System.out.println("- "  + namaMahasiswa.get(i));
        }
    }
}
