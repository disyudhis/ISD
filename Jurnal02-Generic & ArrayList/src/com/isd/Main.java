package com.isd;

public class Main {
    public static void main(String[] args) {
        InventoryManager<ATK> atkInventory = new InventoryManager<>();
        InventoryManager<Bag> bagInventory = new InventoryManager<>();

        // Add ATK items
        ATK atk1 = new ATK("A001", "Pulpen", "Pulpen Snowman Board Marker Hitam",  2);
        ATK atk4 = new ATK("A004", "Spidol", "Spidol Faber Castle",  5);
        ATK atk5 = new ATK("A005", "Pensil", "Pensil 2B",  5);
        ATK atk2 = new ATK("B002", "Buku", "Buku Tulis A4",  3);
        ATK atk6 = new ATK("B003", "HVS", "HVS F4",  10);
        atkInventory.addItem(atk1);
        atkInventory.addItem(atk4);
        atkInventory.addItem(atk5);
        atkInventory.addItem(atk2);
        atkInventory.addItem(atk6);

        // Add Bag items
        Bag bag1 = new Bag("C001", "Tas", "Tas Kantor",  2);
        Bag bag2 = new Bag("C002", "Tempat Pensil", "Tempat Pensil Avenger",  7);
        Bag bag3 = new Bag("C003", "Map Plastik", "Map Plastik Putih",  10);
        Bag bag4 = new Bag("C004", "Map Coklat", "Map Coklat Penguin",  5);
        Bag bag5 = new Bag("C005", "Amplop", "Amplop Penguin",  20);
        bagInventory.addItem(bag1);
        bagInventory.addItem(bag2);
        bagInventory.addItem(bag3);
        bagInventory.addItem(bag4);
        bagInventory.addItem(bag5);

        // Display inventory
        System.out.println("------------- Selamat Datang Di Toko Jaya Mandiri -----------------\n\nProduk ATK kami yang tersedia :\n");
        for (ATK item : atkInventory.getInventoryList()) {
            item.display();
        }

        System.out.println("\n\nProduk Non Alat Tulis kami yang tersedia :\n");
        for (Bag item : bagInventory.getInventoryList()) {
            item.display();
        }


        // Contoh Menghapus Item
        System.out.println("\n\nSaya mau menghapus barang dengan kode A0001, sehingga hasilnya seperti berikut");
        atkInventory.removeItem(atk1);

        // Contoh Edit Item
        ATK atk3 = new ATK("A003", "Pulpen", "Pulpen Marker Warna",  4);
        atkInventory.editItem(atk2, atk3);

        System.out.println("\n\n------------ Karena barang B002 sudah habis, maka saya mengganti menjadi ---------------\n");
        for (ATK item : atkInventory.getInventoryList()) {
            item.display();
        }
    }
}
 