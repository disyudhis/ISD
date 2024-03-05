public class LinkedList {
    Node head;

    public LinkedList() { // Konstruktor untuk menginisialisasi head agar null
        head = null;
    }

    public void addNode(Buku buku) { // Menambahkan node baru ke akhir linked list
        Node newNode = new Node(buku);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean deleteNode(String judul) {  // Menghapus node berdasarkan judul
        Node current = head, prev = null;
        if (current != null && current.buku.judul.equals(judul)) {
            head = current.next;
            return true; 
        }
        while (current != null && !current.buku.judul.equals(judul)) {
            prev = current;
            current = current.next;
        }
        if (current == null) return false;
        prev.next = current.next;
        return true;
    }

    public void printList() { // Mencetak semua buku dalam list
        if (head == null) { 
            System.out.println("Tidak ada buku dalam daftar.\n");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.buku);
            System.out.println();
            current = current.next;
        }
    }
}
