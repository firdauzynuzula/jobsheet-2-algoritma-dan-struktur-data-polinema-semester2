public class MataKuliahMain {
    
    public static void main(String[] args) {
        
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMk = "MK001";
        mk1.nama = "Pemrograman Java";
        mk1.sks = 3;
        mk1.jumlahJam = 45;

        System.out.println("Informasi Mata Kuliah:");
        mk1.tampilkanInformasi();

        System.out.println("\nMengubah SKS dan Menambah Jam...");
        mk1.ubahsks(4);
        mk1.tambahJam(15);

        System.out.println("\nInformasi Mata Kuliah Setelah Perubahan:");
        mk1.tampilkanInformasi();

        System.out.println("\nMengurangi Jam...");
        mk1.kurangiJam(10);

        System.out.println("\nInformasi Mata Kuliah Setelah Pengurangan Jam:");
        mk1.tampilkanInformasi();

        MataKuliah11 mk2 = new MataKuliah11();
        mk2.kodeMk = "MK002";
        mk2.nama = "Struktur Data";
        mk2.sks = 3;
        mk2.jumlahJam = 10;

        System.out.println("\nInformasi Mata Kuliah 2:");
        mk2.tampilkanInformasi();

        mk2.ubahsks(4);
        mk2.tambahJam(20);
        System.out.println("\nInformasi Mata Kuliah 2 Setelah Perubahan:");
        mk2.tampilkanInformasi();
    }
}
