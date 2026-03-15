package yugioh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Kartu> daftarKartu = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {

            System.out.println("\n=== MANAJEMEN KARTU YUGIOH ===");
            System.out.println("1. Tambah Kartu");
            System.out.println("2. Lihat Kartu");
            System.out.println("3. Update Kartu");
            System.out.println("4. Hapus Kartu");
            System.out.println("5. Exit");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahKartu();
                    break;

                case 2:
                    lihatKartu();
                    break;

                case 3:
                    updateKartu();
                    break;

                case 4:
                    hapusKartu();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 5);

    }

    static void tambahKartu() {

        System.out.print("Nama kartu : ");
        String nama = input.nextLine();

        System.out.print("Tipe kartu : ");
        String tipe = input.nextLine();

        System.out.print("Attack : ");
        int attack = input.nextInt();

        System.out.print("Defense : ");
        int defense = input.nextInt();
        input.nextLine();

        Kartu kartu = new Kartu(nama, tipe, attack, defense);
        daftarKartu.add(kartu);

        System.out.println("Kartu berhasil ditambahkan.");
    }

    static void lihatKartu() {

        if (daftarKartu.isEmpty()) {
            System.out.println("Belum ada kartu.");
        } else {

            for (int i = 0; i < daftarKartu.size(); i++) {

                System.out.println("Index : " + i);
                daftarKartu.get(i).tampilkan();

            }

        }

    }

    static void updateKartu() {

        lihatKartu();

        System.out.print("Masukkan index kartu : ");
        int index = input.nextInt();
        input.nextLine();

        System.out.print("Nama baru : ");
        String nama = input.nextLine();

        System.out.print("Tipe baru : ");
        String tipe = input.nextLine();

        System.out.print("Attack baru : ");
        int attack = input.nextInt();

        System.out.print("Defense baru : ");
        int defense = input.nextInt();
        input.nextLine();

        Kartu kartu = daftarKartu.get(index);
        kartu.setNama(nama);
        kartu.setTipe(tipe);
        kartu.setAttack(attack);
        kartu.setDefense(defense);
        System.out.println("Data berhasil diupdate.");
    }

    static void hapusKartu() {

        lihatKartu();

        System.out.print("Masukkan index kartu : ");
        int index = input.nextInt();
        input.nextLine();

        daftarKartu.remove(index);

        System.out.println("Kartu berhasil dihapus.");
    }

}