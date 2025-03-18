/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ASUS
 */
public class Patient {
    private String patientId; // ID pasien
    private String name;      // Nama pasien
    private int age;          // Usia pasien

    // Constructor untuk inisialisasi objek Patient
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter untuk ID pasien
    public String getPatientId() {
        return patientId;
    }

    // Getter untuk nama pasien
    public String getName() {
        return name;
    }

    // Getter untuk usia pasien
    public int getAge() {
        return age;
    }

    // Setter untuk ID pasien
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // Setter untuk nama pasien
    public void setName(String name) {
        this.name = name;
    }

    // Setter untuk usia pasien
    public void setAge(int age) {
        this.age = age;
    }

    // Method toString untuk menampilkan informasi pasien
    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
