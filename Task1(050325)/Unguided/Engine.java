/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ASUS
 */
public class Engine {
       private String type;  // Jenis mesin, misalnya "V6 Twin-Turbo".
    private int horsepower;  // Tenaga mesin dalam horsepower.

    // Konstruktor untuk membuat mesin dengan jenis dan tenaga tertentu.
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    // Method untuk menyalakan mesin.
    public void start() {
        System.out.println("Mesin dinyalakan.");
    }

    // Method untuk mematikan mesin.
    public void stop() {
        System.out.println("Mesin dimatikan.");
    }

    // Method untuk mendapatkan jenis mesin.
    public String getType() {
        return type;
    }

    // Method untuk mendapatkan tenaga mesin.
    public int getHorsepower() {
        return horsepower;
    } 
}
