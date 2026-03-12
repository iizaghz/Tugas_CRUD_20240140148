# Sistem Manajemen Data KTP (CRUD)

Aplikasi **Sistem Manajemen Data KTP berbasis web** yang dikembangkan menggunakan **Java 25 dan Spring Boot** sebagai backend serta **HTML, Bootstrap, dan jQuery** sebagai frontend.
Aplikasi ini menyediakan fitur **CRUD (Create, Read, Update, Delete)** untuk mengelola data penduduk seperti **nomor KTP, nama lengkap, alamat, tanggal lahir, dan jenis kelamin**.

Backend menggunakan **Spring Data JPA dan Hibernate** untuk berinteraksi dengan database **MySQL**. Library **Lombok** digunakan untuk mengurangi boilerplate code seperti getter dan setter, sedangkan **MapStruct** digunakan untuk mempermudah proses mapping antara **Entity dan DTO**.

Aplikasi berjalan menggunakan **Spring Boot pada port 8080** dan dapat diakses melalui:

```
http://localhost:8080
```

Frontend menampilkan **tabel data KTP** serta **form input** yang terhubung dengan backend menggunakan **AJAX**, sehingga proses tambah, edit, dan hapus data dapat dilakukan secara **dinamis tanpa perlu reload halaman**.

---

# Fitur Aplikasi

* Menambahkan data KTP
* Menampilkan seluruh data KTP
* Mengambil data berdasarkan ID
* Mengedit data KTP
* Menghapus data KTP
* Tampilan tabel data yang dinamis menggunakan AJAX

---

# Endpoint API

| Method | Endpoint    | Deskripsi                     |
| ------ | ----------- | ----------------------------- |
| POST   | `/ktp`      | Menambahkan data KTP          |
| GET    | `/ktp`      | Menampilkan seluruh data      |
| GET    | `/ktp/{id}` | Mengambil data berdasarkan ID |
| PUT    | `/ktp/{id}` | Memperbarui data              |
| DELETE | `/ktp/{id}` | Menghapus data                |

---

# Demo Tampilan Aplikasi

### Halaman Utama

![Home]https://raw.githubusercontent.com/iizaghz/Tugas_CRUD_20240140148/main/img.png


# Struktur Project

```
src/main/java
│
├── controller
│   └── KtpController
│
├── service
│   └── KtpService
│
├── repository
│   └── KtpRepository
│
├── entity
│   └── Ktp
│
├── dto
│   └── KtpDTO
│
└── mapper
    └── KtpMapper
```

Struktur ini digunakan untuk memisahkan **logika bisnis, akses data, dan pengelolaan API** agar kode lebih terorganisir dan mudah dikembangkan.

---

# Cara Menjalankan Aplikasi

1. Clone repository

```bash
git clone https://github.com/username/Tugas_CRUD_NIM
```

2. Masuk ke folder project

```bash
cd praktikum2
```

3. Jalankan aplikasi

```bash
mvn spring-boot:run
```

4. Buka di browser

```
http://localhost:8080
```

---

# Teknologi yang Digunakan

* Java 25
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Lombok
* MapStruct
* Maven
* Bootstrap
* jQuery

---

# Author

* Nama : Sukma Hawa Iza Ghazali
* NIM : 20240140148
* Mata Kuliah : Deployment Perangkat Lunax
