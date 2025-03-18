/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ASUS
 */
public class Appointment {
    private String appointmentId; // ID janji temu
    private Doctor doctor;        // Dokter yang menangani
    private Patient patient;      // Pasien yang dijadwalkan
    private String date;          // Tanggal janji temu

    // Constructor untuk inisialisasi objek Appointment
    public Appointment(String appointmentId, Doctor doctor, Patient patient, String date) {
        this.appointmentId = appointmentId;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    // Getter untuk ID janji temu
    public String getAppointmentId() {
        return appointmentId;
    }

    // Getter untuk dokter
    public Doctor getDoctor() {
        return doctor;
    }

    // Getter untuk pasien
    public Patient getPatient() {
        return patient;
    }

    // Getter untuk tanggal janji temu
    public String getDate() {
        return date;
    }

    // Method toString untuk menampilkan informasi janji temu
    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", date='" + date + '\'' +
                '}';
    }   
}
