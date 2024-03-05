import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Membuat objek LinkedList baru yang akan digunakan untuk menyimpan buku.
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner baru untuk mendapatkan input dari pengguna.
        scanner.useDelimiter("\\n"); // Mengatur delimiter Scanner untuk menggunakan newline (\n) sebagai pembatas antara input. Ini memungkinkan pengguna untuk memasukkan input yang mengandung spasi.
        int choice;
        do { // Menampilkan menu operasi dan meminta pengguna untuk memilih operasi.
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cetak Daftar Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            choice = scanner.nextInt();
            switch (choice) { // Menggunakan pernyataan switch untuk menangani pilihan pengguna. Setiap case dalam pernyataan switch menangani satu operasi: menambahkan buku, menghapus buku, mencetak daftar buku, atau keluar dari aplikasi.
                case 1:
                    System.out.print("\nMasukkan Judul Buku: ");
                    String judul = scanner.next();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = scanner.next();
                    System.out.print("Masukkan Tahun Terbit: ");
                    int tahun = scanner.nextInt();
                    System.out.println();
                    list.addNode(new Buku(judul, penulis, tahun));
                    break;
                case 2:
                    System.out.print("\nMasukkan Judul Buku yang ingin dihapus: ");
                    judul = scanner.next();
                    boolean isDeleted = list.deleteNode(judul);
                    if (isDeleted) {
                        System.out.println("Buku berhasil dihapus.\n");
                    } else {
                        System.out.println("Buku dengan judul tersebut tidak ditemukan.\n");
                    }
                    break;
                case 3:
                    System.out.println("\nBerikut Daftar Buku : ");
                    list.printList();
                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);
    }
}
