public class Mahasiswa {
        public String nama;
        public String nim;
        public String kelas;
        public double ipk;

        public void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("Nim: " + nim);
            System.out.println("Kelas: " + kelas);
            System.out.println("IPK: " + ipk);
        }

        public void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }

        public void updateIPK(double ipkBaru) {
            ipk = ipkBaru;
        }

        public String nilaiKinerja() {
            if (ipk < 0 || ipk > 4.0) {
                return "IPK tidak valid! IPK harus antara 0 - 4.0";
            } else if (ipk >= 3.5 && ipk <= 4.0) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0 && ipk < 3.5) {
                return "Kinerja Baik";
            } else if (ipk >= 2.0 && ipk < 3.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
            }
        }

        // public Mahasiswa(String nm, String nim, double ipk, String kls) {
        //     nama = nm;
        //     this.nim = nim;
        //     this.ipk = ipk;
        //     kelas = kls;
        // }
    }