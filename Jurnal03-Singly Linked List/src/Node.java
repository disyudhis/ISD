public class Node {
    Buku buku;
    Node next;
 
    Node(Buku buku) { // Ini adalah konstruktor kelas Node. Konstruktor ini menerima objek Buku sebagai parameter dan menginisialisasi variabel anggota buku dengan objek Buku yang diberikan. Variabel next diatur ke null, yang menunjukkan bahwa node ini tidak memiliki node berikutnya saat pertama kali dibuat 
        this.buku = buku;
        this.next = null;
    }
}
