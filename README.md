# Cinema_Mobile
## Kelompok Aplikasi Bioskop
Anggota kelompok kami terdiri dari :
- Dian Anisa Putri (2200018260)
- Widya Fahmidasari Alya Raushan (2200018266)
  

# Tugas Kelompok Proyek PMOB_AplikasiBioskop
Proyek ini dikerjakan sebagai salah satu prasayarat tugas akhir mata kuliah Pemorgraman Mobile 2024. Beberapa detail mengenai proyek kami sebagai berikut.
Proyek Aplikasi Mobile ini menggunakan teknologi sebagai berikut :
1. Java
2. API yang digunakan terdiri dari
  
   - [API 1](https://moviesapi.ir/api/v1/movies?page={page}) , API yang digunakan untuk mendapatkan data daftar film yang akan tayang berupa list film yang terdapat di dalam API tersebut.

   - [API 2](https://moviesapi.ir/api/v1/movies/{movie_id}) , API yang digunakan untuk mendapatkan data detail dari setiap film, seperti sinopsis dan detail pemain yang ada di dalam film.
  
   - [API 3](https://moviesapi.ir/api/v1/genres) , API yang digunakan untuk mendapatkan data genre untuk setiap film menyesuaikan peminat dan pengguna aplikasi.

Bebeberapa kekurangan dari aplikasi yang masih bisa dikembangkan untuk kedepannya, kami terangkan sebagai berikut :

  1. Penambahan fitur pemilihan kursi bagi pemesan tiket bioskop
  2. Penambahan fitur checkout untuk tiket bioskop beserta detail harga dan metode pembayarannya

> [!NOTE]
> Beberapa kendala yang kami hadapi, yaitu :
Penggunaan Firebase pada fitur Storage yang sekarang diharuskan membayar langganan terlebih dahulu agar dapat menggunakan fitur tersebut. Mengapa fitur tersebut kami perlukan, karena untuk melakukan upload gambar ke dalam sistem database, Firebase mangharuskan menggunakan fitur Storage tersebut.
Isu tersebut kami temukan pada halaman reddit dibawah ini, yang dimana fitur Free dari storage / Spark Plan telah ditiadakan, dan pengguna harus mengupgrade ke Blaze pricing plan untuk menggunakannya seperti mestinya. Dari Official Firebase diumumkan pada tanggal 01 Oktober 2024.
[Sumber Informasi Atas Kendala Diatas](https://www.reddit.com/r/Firebase/comments/1gj9lja/firebase_storage_no_longer_accessible_under_spark/?rdt=36604)
