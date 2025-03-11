/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ASUS
 */
public class Main {
     public static void main(String[] args) {
        // Membuat mesin dengan jenis "V6 Twin-Turbo" dan tenaga 565 horsepower.
        Engine engine = new Engine("V6 Twin-Turbo", 565);

        // Membuat transmisi dengan jenis "Dual-Clutch" dan 6 gigi.
        Transmission transmission = new Transmission("Dual-Clutch", 6);

        // Membuat sistem bahan bakar dengan kapasitas tangki 70 liter.
        FuelSystem fuelSystem = new FuelSystem(70);

        // Membuat mobil Nissan GT-R dengan mesin, transmisi, dan sistem bahan bakar.
        Car car = new Car("Nissan GT-R", engine, transmission, fuelSystem);

        // Menyalakan mobil.
        car.start();

        // Mengecek bahan bakar saat ini.
        car.checkFuelLevel();

        // Mengendarai mobil.
        car.drive();

        // Mengecek bahan bakar saat ini setelah berkendara.
        car.checkFuelLevel();

        // Mengisi bahan bakar sebanyak 20 liter.
        car.refuel(20);

        // Mengecek bahan bakar saat ini setelah mengisi.
        car.checkFuelLevel();

        // Mematikan mobil.
        car.stop();
    }   
}
