public class Buku {
    String judul;
    String penulis;
    int tahunTerbit;

    public Buku(String judul, String penulis, int tahunTerbit) { // Konstruktor kelas dengan 3 parameter
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String toString() { // Mengembalikan representasi string dari objek buku.
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", penulis='" + penulis + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                '}';
    }
}
