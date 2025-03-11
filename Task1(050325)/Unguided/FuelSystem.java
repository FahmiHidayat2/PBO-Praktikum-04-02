/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ASUS
 */
public class FuelSystem {
       private double tankCapacity;  // Kapasitas tangki bahan bakar dalam liter.
    private double fuelLevel;  // Bahan bakar saat ini dalam tangki.

    // Konstruktor untuk membuat sistem bahan bakar dengan kapasitas tertentu.
    public FuelSystem(double tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.fuelLevel = tankCapacity;  // Tangki diisi penuh saat pertama kali dibuat.
    }

    // Method untuk mengisi bahan bakar.
    public void refuel(double amount) {
        if (fuelLevel + amount <= tankCapacity) {
            fuelLevel += amount;
            System.out.println("Bahan bakar diisi sebanyak " + amount + " liter.");
        } else {
            System.out.println("Kapasitas tangki tidak mencukupi.");
        }
    }

    // Method untuk menggunakan bahan bakar saat berkendara.
    public void consumeFuel(double amount) {
        if (fuelLevel - amount >= 0) {
            fuelLevel -= amount;
            System.out.println("Bahan bakar digunakan sebanyak " + amount + " liter.");
        } else {
            System.out.println("Bahan bakar hampir habis! Harap isi bahan bakar.");
        }
    }

    // Method untuk mendapatkan bahan bakar saat ini.
    public double getFuelLevel() {
        return fuelLevel;
    } 
}
