/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ASUS
 */
public class DataChecker {
    // Method untuk memeriksa apakah data pasien valid
    public static boolean isValidPatient(Patient patient) {
        return patient != null && patient.getName() != null && !patient.getName().isEmpty() && patient.getAge() > 0;
    }

    // Method untuk memeriksa apakah tanggal janji temu valid
    public static boolean isValidAppointmentDate(String date) {
        // Validasi sederhana: tanggal tidak boleh null atau kosong
        return date != null && !date.isEmpty();
    }
}
