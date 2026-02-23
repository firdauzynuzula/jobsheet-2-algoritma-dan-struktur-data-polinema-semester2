public class Dosen11 {
    public String idDosen;
    public String namaDosen;
    public boolean statusAktif;
    public int tahunBergabung;
    public String bidangKeahlian;


    public void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }


    public void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    public int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
