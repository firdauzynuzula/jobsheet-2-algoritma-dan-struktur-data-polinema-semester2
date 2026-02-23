public class MahasiswaMain {

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();


        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 2L");

        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa Brokaka = new Mahasiswa();
        Brokaka.nama = "BroKaka";
        Brokaka.nim = "01297121928";
        Brokaka.kelas = "TI 3A";
        Brokaka.ipk = 4.00;

    }
}