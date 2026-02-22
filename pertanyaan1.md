1. Sebutkan dua karakteristik class atau object!
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Mahasiswa? Sebutkan apa saja atributnya!
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method
tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah
IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak
pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,
kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang
dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6. Commit dan push kode program ke Github


jawab :

1. Dua karakteristik class atau object
    - Encapsulation: Class atau object dapat menyembunyikan data dan hanya menyediakan akses melalui method tertentu.
    - Inheritance: Class dapat mewarisi sifat dan perilaku dari class lain, memungkinkan untuk membuat hierarki kelas.

2. Atribut yang dimiliki oleh class Mahasiswa
    - nama: String
    - nim: String
    - jurusan: String
    - ipk: double

3. Method yang dimiliki oleh class Mahasiswa
    - updateIpk(double newIpk): void
    - nilaiKinerja(): String

4. Modifikasi method updateIpk() untuk validasi IPK sudah dilakukan:

public void updateIpk(double newIpk) {
    if (newIpk >= 0.0 && newIpk <= 4.0) {
        this.ipk = newIpk;
    } else {
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    }
}

5. Cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa adalah dengan menggunakan kriteria IPK untuk menentukan nilai kinerja. Kriteria yang digunakan biasanya adalah sebagai berikut:
    - IPK >= 3.5: "Sangat Baik"
    - IPK >= 3.0 dan < 3.5: "Baik"
    - IPK >= 2.5 dan < 3.0: "Cukup"
    - IPK < 2.5: "Kurang"

Method nilaiKinerja() akan mengembalikan (return) sebuah String yang menunjukkan nilai kinerja mahasiswa berdasarkan IPK yang dimilikinya.

6. Sudah dilakukan commit dan push kode program ke Github.