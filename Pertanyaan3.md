1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program
berikut?
     Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 2L");
3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.
Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses
secara berurutan? Jelaskan alasannya!
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor
berparameter dari class Mahasiswa!
6. Commit dan push kode program ke Github

jawab : 

1. Baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter pada class Mahasiswa adalah:
public Mahasiswa(String nama, String nim, double ipk, String jurusan) {
    this.nama = nama;
    this.nim = nim;
    this.ipk = ipk;
    this.jurusan = jurusan;
}

2. Baris program tersebut melakukan instansiasi objek baru dari class Mahasiswa dengan menggunakan konstruktor berparameter. Objek tersebut diberi nama mhs2 dan diinisialisasi dengan nilai-nilai yang diberikan dalam parameter konstruktor, yaitu "Annisa Nabila" untuk nama, "2141720160" untuk nim, 3.25 untuk ipk, dan "TI 2L" untuk jurusan.

3. Jika konstruktor default dihapus dari class Mahasiswa, maka saat mencoba untuk menginstansiasi objek tanpa menggunakan konstruktor berparameter, akan terjadi error karena tidak ada konstruktor default yang tersedia. Hasilnya akan berupa pesan error yang menyatakan bahwa tidak dapat menemukan konstruktor default.

4. Method di dalam class Mahasiswa tidak harus diakses secara berurutan. Anda dapat mengakses method apa pun sesuai kebutuhan, asalkan objek tersebut sudah diinstansiasi dengan benar. Urutan akses method tidak mempengaruhi hasil selama objek sudah memiliki nilai yang valid.

5. Contoh instansiasi objek baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa adalah:
Mahasiswa mhsJohnDoe = new Mahasiswa("John Doe", "2141720161", 3.75, "TI 2L");

6. Untuk commit dan push kode program ke Github sudah saya lakukan.
