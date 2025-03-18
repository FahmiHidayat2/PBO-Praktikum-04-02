# <h1 align="center">Baratie Clinic System</h1>
<p align="center">Fahmi Hidayat (2311110063)</p>


## Overview
The Baratie Clinic System adalah aplikasi berbasis Java sederhana yang dirancang untuk mengelola janji temu antara dokter dan pasien, pendaftaran pasien, serta pelacakan data medis. Sistem ini memungkinkan pengguna untuk:

* Mendaftarkan pasien baru.
* Menjadwalkan janji temu antara dokter dan pasien.
* Melihat daftar janji temu yang telah dijadwalkan.
* Memastikan keamanan data melalui prinsip enkapsulasi dan validasi data.
## Features
### 1. Pendaftaran Pasien
* Mendaftarkan pasien baru dengan ID unik, nama, dan usia.
* Memastikan validasi data seperti nama tidak boleh kosong dan usia harus valid.
### 2. Penjadwalan Janji Temu
* Memungkinkan pengguna untuk menjadwalkan janji temu antara pasien yang terdaftar dan dokter yang tersedia.
* Menyertakan tanggal janji temu secara otomatis (tanggal sekarang).
### 3. Melihat Janji Temu
* Menampilkan daftar semua janji temu yang telah dijadwalkan.
* Menampilkan detail seperti nama dokter, spesialisasi, nama pasien, usia, dan tanggal janji temu.
### 4. Validasi Data
* Memastikan data pasien dan dokter valid sebelum disimpan.
* Menggunakan kelas utilitas DataChecker untuk memvalidasi input.
## Classes Description
### 1. Doctor.java
Kelas ini merepresentasikan seorang dokter di Baratie Clinic.
#### Atribut:
* doctorId: ID unik dokter.
* name: Nama dokter.
* specialization: Spesialisasi dokter.
#### Method:
* getDoctorId(): Mengembalikan ID dokter.
* getName(): Mengembalikan nama dokter.
* getSpecialization(): Mengembalikan spesialisasi dokter.
* toString(): Menampilkan informasi dokter dalam format string.
### 2. Patient.java
Kelas ini merepresentasikan seorang pasien di Baratie Clinic.
#### Atribut:
* patientId: ID unik pasien.
* name: Nama pasien.]
* age: Usia pasien.
#### Method:
* getPatientId(): Mengembalikan ID pasien.
* getName(): Mengembalikan nama pasien.
* getAge(): Mengembalikan usia pasien.
* toString(): Menampilkan informasi pasien dalam format string.
### 3. Appointment.java
Kelas ini merepresentasikan janji temu antara dokter dan pasien.
#### Atribut:
* appointmentId: ID unik janji temu.
* doctor: Dokter yang menangani.
* patient: Pasien yang dijadwalkan.
* date: Tanggal janji temu.
#### Method:
* getAppointmentId(): Mengembalikan ID janji temu.
* getDoctor(): Mengembalikan dokter yang menangani.
* getPatient(): Mengembalikan pasien yang dijadwalkan.
* getDate(): Mengembalikan tanggal janji temu.
* toString(): Menampilkan detail janji temu dalam format string.
### 4. DataChecker.java
Kelas utilitas ini digunakan untuk memvalidasi data pasien dan dokter.
#### Method:
* isValidPatient(Patient patient): Memvalidasi data pasien (nama tidak boleh kosong dan usia harus valid).
* isValidAppointmentDate(String date): Memvalidasi format tanggal janji temu.
5. HospitalSystem.java
Kelas utama yang menyediakan antarmuka sistem.
#### Fungsi Utama:
* Mendaftarkan pasien.
* Menjadwalkan janji temu.
* Menampilkan daftar janji temu.
### Output
![image](https://github.com/user-attachments/assets/ec82698e-40cb-4c43-b71e-480727497385)
