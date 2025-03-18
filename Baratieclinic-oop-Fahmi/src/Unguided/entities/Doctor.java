/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Unguided.entities;

/**
 *
 * @author ASUS
 */
public class Doctor {
    private String doctorId; // ID dokter
    private String name;     // Nama dokter
    private String specialization; // Spesialisasi dokter

    // Constructor untuk inisialisasi objek Doctor
    public Doctor(String doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    // Getter untuk ID dokter
    public String getDoctorId() {
        return doctorId;
    }

    // Getter untuk nama dokter
    public String getName() {
        return name;
    }

    // Getter untuk spesialisasi dokter
    public String getSpecialization() {
        return specialization;
    }

    // Setter untuk ID dokter
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    // Setter untuk nama dokter
    public void setName(String name) {
        this.name = name;
    }

    // Setter untuk spesialisasi dokter
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Method toString untuk menampilkan informasi dokter
    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}