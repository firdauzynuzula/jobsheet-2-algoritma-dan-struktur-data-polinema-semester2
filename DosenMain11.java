public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 dosen1 = new Dosen11();
        dosen1.idDosen = "D001";
        dosen1.namaDosen = "Dr. Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Pemrograman";

        Dosen11 dosen2 = new Dosen11();
        dosen2.idDosen = "D002";
        dosen2.namaDosen = "Dr. Siti Aminah";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2005;
        dosen2.bidangKeahlian = "Basis Data";

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilkanInformasi();
        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilkanInformasi();

        // Mengubah status aktif dan bidang keahlian dosen1
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Kecerdasan Buatan");

        System.out.println("\nSetelah mengubah status dan bidang keahlian Dosen 1:");
        dosen1.tampilkanInformasi();

        // Menghitung masa kerja dosen2
        int tahunSekarang = 2024;
        int masaKerjaDosen2 = dosen2.hitungMasaKerja(tahunSekarang);
        System.out.println("\nMasa kerja Dosen 2: " + masaKerjaDosen2 + " tahun");
    }
}
