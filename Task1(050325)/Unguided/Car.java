/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ASUS
 */
public class Car {
       private String model;  // Model mobil, yaitu "Nissan GT-R".
    private Engine engine;  // Mesin mobil.
    private Transmission transmission;  // Transmisi mobil.
    private FuelSystem fuelSystem;  // Sistem bahan bakar mobil.

    // Konstruktor untuk membuat mobil dengan model, mesin, transmisi, dan sistem bahan bakar.
    public Car(String model, Engine engine, Transmission transmission, FuelSystem fuelSystem) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.fuelSystem = fuelSystem;
    }

    // Method untuk menyalakan mobil.
    public void start() {
        engine.start();
        System.out.println("Nissan GT-R siap jalan!");
    }

    // Method untuk mematikan mobil.
    public void stop() {
        engine.stop();
        System.out.println("Nissan GT-R berhenti.");
    }

    // Method untuk mengendarai mobil.
    public void drive() {
        System.out.println("Mengendarai Nissan GT-R dengan mesin " + engine.getType() + 
                           " bertenaga " + engine.getHorsepower() + " horsepower dan transmisi " + 
                           transmission.getType() + " " + transmission.getGears() + " kecepatan.");
        fuelSystem.consumeFuel(2.5);  // Menggunakan bahan bakar saat berkendara.
    }

    // Method untuk mengisi bahan bakar.
    public void refuel(double amount) {
        fuelSystem.refuel(amount);
    }

    // Method untuk mengecek bahan bakar saat ini.
    public void checkFuelLevel() {
        System.out.println("Bahan bakar saat ini: " + fuelSystem.getFuelLevel() + " liter.");
    } 
}
