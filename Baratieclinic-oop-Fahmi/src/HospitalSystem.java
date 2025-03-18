/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import Unguided.entities.Doctor;
import Unguided.entities.Patient;
import Unguided.entities.Appointment;
import Unguided.entities.DataChecker;
import java.time.LocalDate;

public class HospitalSystem {
    public static void main(String[] args) {
        // Membuat objek dokter (menggunakan karakter One Piece: Tony Tony Chopper sebagai dokter)
        Doctor doctor = new Doctor("D001", "Dr. Tony Tony Chopper", "General Medicine");

        // Membuat objek pasien (menggunakan karakter One Piece: Monkey D. Luffy sebagai pasien)
        Patient patient = new Patient("P001", "Monkey D. Luffy", 19);

        // Mendapatkan tanggal sekarang
        LocalDate today = LocalDate.now();

        // Memeriksa apakah data pasien valid
        if (DataChecker.isValidPatient(patient)) {
            // Membuat janji temu dengan tanggal sekarang
            Appointment appointment = new Appointment("A001", doctor, patient, today.toString());

            // Menampilkan detail janji temu
            System.out.println("Detail Janji Temu di Baratie Clinic:");
            System.out.println(appointment);
        } else {
            System.out.println("Data pasien tidak valid.");
        }

        // Contoh lain dengan karakter yang berbeda
        Doctor doctor2 = new Doctor("D002", "Dr. Trafalgar Law", "Bedah");
        Patient patient2 = new Patient("P002", "Portgas D. Ace", 20);
        if (DataChecker.isValidPatient(patient2)) {
            // Membuat janji temu lain dengan tanggal sekarang
            Appointment appointment2 = new Appointment("A002", doctor2, patient2, today.toString());
            System.out.println("\nDetail Janji Temu Lain di Baratie Clinic:");
            System.out.println(appointment2);
        } else {
            System.out.println("Data pasien tidak valid.");
        }
    }
}
