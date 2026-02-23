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
    }
}
