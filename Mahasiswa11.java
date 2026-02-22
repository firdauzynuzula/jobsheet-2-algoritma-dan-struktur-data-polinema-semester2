
    class Mahasiswa {
        String nama;
        String nim;
        String kelas;
        double ipk;

        void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("Nim: " + nim);
            System.out.println("IPK: " + kelas);
            System.out.println("Kelas: " + ipk);
        }

        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }

        void updateIPK(double ipkBaru) {
            ipk = ipkBaru;
        }

        String nilaiKinerja() {
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
    }
