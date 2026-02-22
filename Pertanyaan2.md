1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses
instansiasi! Apa nama object yang dihasilkan?
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

jawab :

1. Pada class MahasiswaMain, baris kode program yang digunakan untuk proses instansiasi adalah:
   
   Mahasiswa mahasiswa1 = new Mahasiswa("Muhammad Ali Farhan", 2241720171 , "SI 2J", 3.55);
   Nama object yang dihasilkan adalah `mahasiswa1`.

2. Untuk mengakses atribut dan method dari suatu objek, kita menggunakan operator titik (.) setelah nama objek. Contohnya, untuk mengakses atribut `nama` dari objek `mahasiswa1`, kita dapat menggunakan `mahasiswa1.nama`. Untuk mengakses method `tampilkanInformasi()`, kita dapat menggunakan `mahasiswa1.tampilkanInformasi()`.

3. Hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda karena pada pemanggilan pertama, objek `mahasiswa1` memiliki nilai atribut yang telah diinstansiasi dengan data yang diberikan. Sedangkan pada pemanggilan kedua, objek `mahasiswa2` mungkin memiliki nilai atribut yang berbeda atau belum diinstansiasi dengan data yang sama, sehingga menghasilkan output yang berbeda saat method tampilkanInformasi() dipanggil.